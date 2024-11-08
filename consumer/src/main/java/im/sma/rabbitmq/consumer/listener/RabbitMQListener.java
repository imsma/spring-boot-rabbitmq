package im.sma.rabbitmq.consumer.listener;

import org.springframework.amqp.AmqpRejectAndDontRequeueException;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQListener {

    @RabbitListener(queues = "hello")
    public void listen(String message) throws InterruptedException {
        System.out.println("Processing...");
        // Thread.sleep(5000);
        // throw new RuntimeException("Error occurred");
        // throw new AmqpRejectAndDontRequeueException("");
        System.out.println("Received message: " + message);
    }
}
