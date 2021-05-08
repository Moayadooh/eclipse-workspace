package com.moayad;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.moayad.config.AppConfig;
import com.moayad.model.Product;
import com.moayad.receiver.MessageReceiver;

public class MessageConsumerApp
{

	public static void main(String[] args)
	{
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(
				AppConfig.class);

		MessageReceiver messageReceiver = (MessageReceiver) context.getBean("messageReceiver");
		Product product = messageReceiver.receiveMessage();
		System.out.println("Message Received = " + product);

		((AbstractApplicationContext) context).close();
	}

}