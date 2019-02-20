package com.myapp.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class MessageService {

	@Autowired
	private MessageBuilder messageBuilder;

	Message createMessage(String content, String receiver) {
		return messageBuilder.build(content, receiver);
	}
}
