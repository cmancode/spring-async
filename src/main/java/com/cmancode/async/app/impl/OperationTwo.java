package com.cmancode.async.app.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class OperationTwo {
	
	
	private List<String> addLetters() {
		List<String> letters = new ArrayList<String>();
		for (char i = 'a'; i < 'o'; i++) {
			letters.add(Character.toString(i));
		}
		return letters;
	}
	
	@Async
	public void printObjectsTow() {
		List<String> letters = this.addLetters();
		
		letters.forEach(letter -> {
			log.info("Executing Thread {}", Thread.currentThread().getName());
			log.info(letter);
		});
	}
	
}
