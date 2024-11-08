package im.sma.rabbitmq.producer;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageDeliveryMode;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProducerApplication implements CommandLineRunner {
	@Autowired
	private RabbitTemplate rabbitTemplate;

	@Autowired
	private Queue queue;

	public static void main(String[] args) {
		SpringApplication.run(ProducerApplication.class, args);
	}

	public void run(String... args) throws Exception {
		// MessageProperties messageProperties = new MessageProperties();
		// messageProperties.setDeliveryMode(MessageDeliveryMode.NON_PERSISTENT);
		// Message message = new Message("Hello bySMA!".getBytes(), messageProperties);
		// rabbitTemplate.convertAndSend(queue.getName(), message);
		rabbitTemplate.convertAndSend(queue.getName(), "Hello bySMA!");
	}

}
