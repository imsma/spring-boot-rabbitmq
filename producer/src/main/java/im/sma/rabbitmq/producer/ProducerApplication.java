package im.sma.rabbitmq.producer;

import org.springframework.amqp.core.TopicExchange;
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
	private TopicExchange topicExchange;

	public static void main(String[] args) {
		SpringApplication.run(ProducerApplication.class, args);
	}

	public void run(String... args) throws Exception {
		rabbitTemplate.convertAndSend(topicExchange.getName(), "topicRouting", "Hello bySMA!");
	}

}
