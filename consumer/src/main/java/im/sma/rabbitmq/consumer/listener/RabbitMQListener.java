package im.sma.rabbitmq.consumer.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQListener {

    @RabbitListener(queues = "hello")
    public void listen(String message) {
        System.out.println("Received message: " + message);
    }
}
