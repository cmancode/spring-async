package com.cmancode.async.app;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cmancode.async.app.impl.OperationOne;
import com.cmancode.async.app.impl.OperationTwo;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
class ProjectAsyncApplicationTests {
	
	@Autowired
	private OperationOne op1;

	@Autowired
	private OperationTwo op2;
	
	@Test
	void contextLoads() throws InterruptedException {
		log.info("Starting test");
		
		op1.printObjectsOne();
		//Thread.sleep(4000);
		op2.printObjectsTow();
				
	}

}
