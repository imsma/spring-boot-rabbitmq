package im.sma.rabbitmq.producer;

import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import im.sma.rabbitmq.producer.config.RabbitMQConfig;

@SpringBootApplication
public class ProducerApplication implements CommandLineRunner {
	@Autowired
	private RabbitTemplate rabbitTemplate;

	public static void main(String[] args) {
		SpringApplication.run(ProducerApplication.class, args);
	}

	public void run(String... args) throws Exception {
		String response = (String) rabbitTemplate.convertSendAndReceive(RabbitMQConfig.REQUEST_QUEU, "Hello, bySMA!");
		System.out.println("Response: " + response);
	}

}
