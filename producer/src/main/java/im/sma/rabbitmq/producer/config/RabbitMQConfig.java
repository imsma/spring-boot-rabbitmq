package im.sma.rabbitmq.producer.config;

import org.springframework.amqp.core.AnonymousQueue;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {
    @Bean
    public DirectExchange directExchange() {
        return new DirectExchange("directExchange");
    }

    @Bean
    public Queue annQueue() {
        return new AnonymousQueue();
    }

    @Bean
    public Binding binding(Queue annQueue, DirectExchange directExchange) {
        return BindingBuilder.bind(annQueue).to(directExchange).with("directRouting");
    }
}
