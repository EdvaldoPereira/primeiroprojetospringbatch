package com.udemy.primeiroprojetospringbatch.job;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PrimeiroJobSpringBatchConfig {
	
	@Autowired
	private JobBuilderFactory builderFactory;
	
	@Bean
	public Job imprimeOlaJob(Step imprimeOlaStep) {
		
		return builderFactory
				.get("imprimeOlaJob")
				.start(imprimeOlaStep)
				.build();
	}
	
}
