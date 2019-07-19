package com.cts.Annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BookBeanConfigure {
	@Bean
	@Scope(value="prototype")
	public Book getBookBean(){
		return new Book();
	}
	
	@Bean
	@Scope(value="prototype")
	public Publisher getPublisher() {
		return new Publisher();
	}
	
	
}
