package com.TestEDMS.test;

import com.TestEDMS.test.stateMachine.Events;
import com.TestEDMS.test.stateMachine.States;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.statemachine.StateMachine;
import org.springframework.statemachine.config.StateMachineFactory;

@SpringBootApplication
public class TestApplication {

	private StateMachine<States, Events> stateMachine;

	@Autowired
	private StateMachineFactory<States, Events> stateMachineFactory;

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);


	}

}
