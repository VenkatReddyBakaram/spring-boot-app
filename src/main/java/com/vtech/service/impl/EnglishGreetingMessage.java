package com.vtech.service.impl;

import org.springframework.stereotype.Service;

import com.vtech.service.GreetingMessage;

@Service("english")
public class EnglishGreetingMessage implements GreetingMessage {

	@Override
	public void greeting() {
		System.out.println("Hellow in English Language..!");
	}
}
