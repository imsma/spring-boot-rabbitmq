package im.sma.rabbitmq.producer;

import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.FanoutExchange;
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
	private DirectExchange directExchange;

	public static void main(String[] args) {
		SpringApplication.run(ProducerApplication.class, args);
	}

	public void run(String... args) throws Exception {
		rabbitTemplate.convertAndSend(directExchange.getName(), "directRouting", "Hello bySMA!");
	}

}
