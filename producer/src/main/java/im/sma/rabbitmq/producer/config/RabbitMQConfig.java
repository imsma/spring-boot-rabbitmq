package im.sma.rabbitmq.producer.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {
    public static final String REQUEST_QUEU = "rpc.request.queue";

    @Bean
    public Queue requestQueue() {
        return new Queue(REQUEST_QUEU);
    }
}
