package im.sma.rabbitmq.consumer.config;

import org.springframework.amqp.core.AnonymousQueue;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {
    @Bean
    public TopicExchange topicExchange() {
        return new TopicExchange("topicExchange");
    }

    @Bean
    public Queue annQueue() {
        return new AnonymousQueue();
    }

    @Bean
    public Binding binding(Queue annQueue, TopicExchange topicExchange) {
        return BindingBuilder.bind(annQueue).to(topicExchange).with("topicRouting");
    }

}
