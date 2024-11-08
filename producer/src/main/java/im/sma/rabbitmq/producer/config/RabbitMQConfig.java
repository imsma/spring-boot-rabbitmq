package im.sma.rabbitmq.producer.config;

import org.springframework.amqp.core.AnonymousQueue;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

    // @Bean
    // public Queue createQueue() {
    // return new Queue("hello");
    // }

    @Bean
    public FanoutExchange createFanoutExchange() {
        return new FanoutExchange("fanoutExchange");
    }

    @Bean
    Queue annQueue() {
        return new AnonymousQueue();
    }

    @Bean
    public Binding binding(FanoutExchange fanout, Queue annQueue) {
        return BindingBuilder.bind(annQueue).to(fanout);
    }
}
