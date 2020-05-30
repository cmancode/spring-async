package com.cmancode.async.app.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class OperationOne {
	
	private List<Long> addNumbers() {
		List<Long> numbers = new ArrayList<Long>();
		for (int i = 0; i < 15; i++) {
			numbers.add((long) i);
		}
		return numbers;
	}
	
	@Async
	public void printObjectsOne() {
		List<Long> numbers = this.addNumbers();
		numbers.forEach(number -> {
			log.info("Executing Thread {}", Thread.currentThread().getName());
			log.info(""+number);
		});
	}

}
