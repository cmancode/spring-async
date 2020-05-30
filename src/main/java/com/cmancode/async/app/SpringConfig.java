package com.cmancode.async.app;

import java.util.concurrent.Executor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@Configuration
@EnableAsync
public class SpringConfig {

	@Bean
	 public Executor taskExecutor() {
	    ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
	    executor.setCorePoolSize(2); //Number max of core
	    executor.setMaxPoolSize(3);
	    executor.setQueueCapacity(500);
	    executor.setThreadNamePrefix("ExampleThread-");
	    executor.initialize();
	    return executor;
	  }
}