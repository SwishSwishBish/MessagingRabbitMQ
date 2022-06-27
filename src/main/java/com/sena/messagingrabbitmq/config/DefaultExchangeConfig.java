package com.sena.messagingrabbitmq.config;

import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
public class DefaultExchangeConfig
{
    @Value("${rabbitmq.default.queue}")
    private String DEFAULT_QUEUE;

    @Autowired
    private AmqpAdmin amqpAdmin;

    @PostConstruct
    public void init()
    {
        amqpAdmin.declareQueue(createQueue());
    }

    Queue createQueue()
    {
        return new Queue(DEFAULT_QUEUE, true, false, false);
    }

    @Bean
    public AmqpTemplate defaultExchange(ConnectionFactory connectionFactory, MessageConverter messageConverter)
    {
        RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
        rabbitTemplate.setMessageConverter(messageConverter);
        rabbitTemplate.setRoutingKey(DEFAULT_QUEUE);

        return rabbitTemplate;
    }

}