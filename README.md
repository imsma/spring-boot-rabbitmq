# Spring Boot RabbitMQ Producer & Consumer Example bySMA

Welcome to the **Spring Boot RabbitMQ** example repository bySMA! This project is a simple, hands-on guide to setting up message queues using RabbitMQ with Spring Boot. We’ll show you the ropes by building two Spring Boot applications – a **Producer** that sends messages and a **Consumer** that receives them. Whether you’re a beginner in messaging systems or looking to sharpen your skills, this project will get you up and running in no time.

## Project Overview

This repository hosts two Spring Boot projects: the **Producer** and the **Consumer**. The Producer sends messages to RabbitMQ, while the Consumer listens for these messages and processes them. Here’s the breakdown:

- **Producer App**: [View Code](https://github.com/imsma/spring-boot-rabbitmq/tree/main/producer)
- **Consumer App**: [View Code](https://github.com/imsma/spring-boot-rabbitmq/tree/main/consumer)

The projects use **OpenJDK 21**, **Spring Boot 3.3.5**, and **Maven** for dependency management, giving you the latest and greatest to work with.

## Tech Stack

- **Java**: OpenJDK 21
- **Spring Boot**: Version 3.3.5
- **Maven**: For build and dependency management
- **RabbitMQ**: Docker setup included for easy configuration

## Setting Up RabbitMQ with Docker

To make it easy to run RabbitMQ on your local machine, we’ll use Docker. If you don’t have Docker installed, [install it from here](https://docs.docker.com/get-docker/).

Once Docker is ready, start a RabbitMQ container with the following command:

```bash
docker run -d --name rabbitmq -p 5672:5672 -p 15672:15672 rabbitmq:3-management
```

This command does a few things:

- Downloads the RabbitMQ image with a management plugin.
- Exposes RabbitMQ on port **5672** (for messaging) and **15672** (for the management dashboard).

Once it’s running, you can access the RabbitMQ management console at `http://localhost:15672` using the default credentials:

- **Username**: `guest`
- **Password**: `guest`

## Running the Spring Boot Applications

Follow these steps to run the Producer and Consumer projects.

1. **Clone the Repository**

   Clone this repo to your machine using HTTPS or SSH:

   ```bash
   git clone https://github.com/imsma/spring-boot-rabbitmq.git
   ```

2. **Navigate to Each Project**

   Change directories to either the `producer` or `consumer` folder, depending on which one you want to start first.

   ```bash
   cd spring-boot-rabbitmq/producer
   # or
   cd spring-boot-rabbitmq/consumer
   ```

3. **Build the Project with Maven**

   Run the Maven command to build the project. This command compiles the code and packages it into a runnable `.jar` file:

   ```bash
   mvn clean install
   ```

4. **Run the Spring Boot Application**

   After building, you can run the app with the following command:

   ```bash
   java -jar target/producer.jar  # For the Producer app
   java -jar target/consumer.jar  # For the Consumer app
   ```

   Alternatively, if you’re using an IDE like IntelliJ or Eclipse, simply run the `main` class for each project to start the applications.

### How It Works

1. **Producer App**: This app connects to RabbitMQ and sends messages to a specified queue. You’ll see logs in the console as each message is sent.

2. **Consumer App**: This app listens to the same RabbitMQ queue, receiving and processing each message as it arrives.

The setup is designed to be straightforward, so you can focus on understanding how RabbitMQ works with Spring Boot rather than getting bogged down in configuration details.

## License

This project is licensed under the MIT License, which means you’re free to use, modify, and distribute it as you please.

## About bySMA

This example is part of the open-source initiative bySMA, where I, Shoket Mahmood Ahmed (SMA), share code samples, tools, and practical resources for developers. If this project helps you, check out more of my work on GitHub and my blog.

## Further Reading

For tips, tutorials, and insights, feel free to visit my blog at [sma.im](https://sma.im) – I'd love for you to explore and join the conversation!
