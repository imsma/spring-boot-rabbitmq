package im.sma.rabbitmq.consumer.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import im.sma.rabbitmq.consumer.config.RabbitMQConfig;

@Component
public class RabbitMQListener {
    @RabbitListener(queues = RabbitMQConfig.REQUEST_QUEUE)
    public String handle(String message) {
        System.out.println("Message received " + message);
        return "Thanks, bySMA!!!";
    }
}
