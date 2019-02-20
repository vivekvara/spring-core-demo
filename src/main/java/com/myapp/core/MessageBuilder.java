package com.myapp.core;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class MessageBuilder {
	private static final AtomicInteger instanceCounter = new AtomicInteger(0);

	static int getInstanceCounter() {
		return instanceCounter.get();
	}

	Message build(String content, String receiver) {
		instanceCounter.incrementAndGet();
		return new Message(content, receiver);
	}
}
