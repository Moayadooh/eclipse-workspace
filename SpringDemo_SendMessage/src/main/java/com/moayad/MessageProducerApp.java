package com.moayad;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.moayad.config.AppConfig;
import com.moayad.producer.MessageSender;

public class MessageProducerApp
{

	public static void main(String[] args)
	{
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(
				AppConfig.class);

		MessageSender messageSender = context.getBean(MessageSender.class);

		messageSender.sendMessage("Hi Moayad, How are you?");
		System.out.println("Message has been sent successfully...");

		((AbstractApplicationContext) context).close();
	}

}