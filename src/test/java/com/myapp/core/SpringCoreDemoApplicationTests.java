package com.myapp.core;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringCoreDemoApplicationTests {

	@Autowired
	private MessageService messageService;
	
	@Autowired
	private MySingletonBean singleton;

	@Test
	public void shouldCreateTwoBuilders() throws Exception {
		// when
		Message s1 = messageService.createMessage("text", "alice");
		Message s2 = messageService.createMessage("msg", "bob");
		// then
		int prototypeCounter = MessageBuilder.getInstanceCounter();
		assertEquals("Wrong number of instances", 2, prototypeCounter);
//		assertEquals(s1, s2);
	}
	
	@Test
	public void singletonPrototypeTest() throws InterruptedException {
		singleton.showMessage();
        Thread.sleep(5000);

        singleton.showMessage();
	}
	

}
