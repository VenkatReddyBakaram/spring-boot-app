package com.vtech.service.impl;

import org.springframework.stereotype.Service;

import com.vtech.service.GreetingMessage;

@Service("french")
public class FrenchGreetingMessage implements GreetingMessage {

	@Override
	public void greeting() {
		System.out.println("Hellow in French Language..!");
	}
}
