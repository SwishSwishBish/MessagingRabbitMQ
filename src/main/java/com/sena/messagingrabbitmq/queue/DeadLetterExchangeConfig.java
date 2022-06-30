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
public class DeadLetterExchangeConfig {

    @Value("${rabbitmq.fanout.exchange}")
    private String FANOUT_EXCHANGE;

    @Value("${rabbitmq.dead-letter-exchange.queue}")
    private String QUEUE_NAME;

    @Autowired
    private AmqpAdmin amqpAdmin;

    @PostConstruct
    public void init()
    {
        amqpAdmin.declareQueue(createDeadLetterExchangeQueue());
    }

    Queue createDeadLetterExchangeQueue()
    {
        //When messages are expired, redirected to dead-letter-exchange.
        //Here, used existing predefined fanout exchange. When message is rejected, redirected tp: fanout queue-1, 2
        return QueueBuilder.durable(QUEUE_NAME)
                .ttl(5000)
                .deadLetterExchange(FANOUT_EXCHANGE)
                .build();
    }

    @Bean
    public AmqpTemplate defaultDeadLetterExchange(ConnectionFactory connectionFactory, MessageConverter messageConverter)
    {
        RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
        rabbitTemplate.setMessageConverter(messageConverter);
        rabbitTemplate.setRoutingKey(QUEUE_NAME);

        return rabbitTemplate;
    }
}