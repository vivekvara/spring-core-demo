package com.myapp.core;

public class Message {

	private String content;
	private String receiver;

	public Message(String content, String receiver) {
		super();
		this.content = content;
		this.receiver = receiver;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

}
