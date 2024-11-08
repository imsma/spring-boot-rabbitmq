package im.sma.rabbitmq.consumer.listener;

import org.springframework.amqp.AmqpRejectAndDontRequeueException;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQListener {

    @RabbitListener(queues = "#{annQueue.name}")
    public void listen(String message) throws InterruptedException {
        System.out.println("Processing...");
        System.out.println("Received message: " + message);
    }
}
