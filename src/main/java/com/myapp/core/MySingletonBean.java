package com.myapp.core;

import javax.inject.Provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MySingletonBean {

	
//	@Autowired
//	private ApplicationContext applicationContext;

//	public void showMessage() {
//		MyPrototypeBean bean = applicationContext.getBean(MyPrototypeBean.class);
//		System.out.println("Hi, the time is " + bean.getDateTime());
//	}
	
//	@Autowired
//	MyPrototypeBean prototypeBean;
//
//	public void showMessage() {
//		System.out.println("Hi, the time is " + prototypeBean.getDateTime());
//	}
	
	@Autowired
	Provider<MyPrototypeBean> myPrototypeBeanProvider;

	public void showMessage() {
		System.out.println("Hi, the time is " + myPrototypeBeanProvider.get().getDateTime());
	}
}
