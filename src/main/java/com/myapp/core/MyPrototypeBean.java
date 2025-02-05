package com.myapp.core;

import java.time.LocalDateTime;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE
//				, proxyMode=ScopedProxyMode.TARGET_CLASS
	)
public class MyPrototypeBean {

	private String dateTimeString = LocalDateTime.now().toString();

	public String getDateTime() {
		return dateTimeString;
	}
}
