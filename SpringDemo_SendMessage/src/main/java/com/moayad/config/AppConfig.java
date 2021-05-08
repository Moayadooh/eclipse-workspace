package com.moayad.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = "com.moayad")
@Import({ MessagingConfiguration.class })
public class AppConfig
{

	// Put Other Application configuration here.
}