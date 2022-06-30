package com.sena.messagingrabbitmq.queue;

import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.QueueBuilder;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
public class OverflowConfig {

    @Value("${rabbitmq.overflow.queue}")
    private String QUEUE_NAME;


    @Autowired
    private AmqpAdmin amqpAdmin;

    @PostConstruct
    public void init()
    {
        amqpAdmin.declareQueue(createOverflowQueue());
    }

    Queue createOverflowQueue()
    {
        return QueueBuilder.durable(QUEUE_NAME)
                .maxLength(2)
                .overflow(QueueBuilder.Overflow.rejectPublish)
                .build();
    }

    @Bean
    public AmqpTemplate defaultOverflowExchange(ConnectionFactory connectionFactory, MessageConverter messageConverter)
    {
        RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
        rabbitTemplate.setMessageConverter(messageConverter);
        rabbitTemplate.setRoutingKey(QUEUE_NAME);

        return rabbitTemplate;
    }
}