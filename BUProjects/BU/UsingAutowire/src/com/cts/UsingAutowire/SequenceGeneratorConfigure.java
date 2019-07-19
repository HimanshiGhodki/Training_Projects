package com.cts.UsingAutowire;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SequenceGeneratorConfigure 
{
	@Bean
	public Sequence getSequenceBean() 
	{
		return new Sequence();
	}
	
	@Bean
	public PrefixGenerator gePrefixGeneratorBean() 
	{
		return new PrefixGenerator();
	}

}
