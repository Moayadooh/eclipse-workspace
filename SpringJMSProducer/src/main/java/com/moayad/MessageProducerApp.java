package com.moayad;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.moayad.config.AppConfig;
import com.moayad.model.Product;
import com.moayad.producer.MessageSender;

public class MessageProducerApp
{

	public static void main(String[] args)
	{
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(
				AppConfig.class);

		MessageSender messageSender = context.getBean(MessageSender.class);

		Product product = new Product();
		product.setProductId(100);
		product.setName("Laptop");
		product.setQuantity(10);

		messageSender.sendMessage(product);
		System.out.println("Message has been sent successfully to Queue");

		((AbstractApplicationContext) context).close();
	}

}