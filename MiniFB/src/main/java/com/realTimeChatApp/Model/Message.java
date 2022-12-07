package com.realTimeChatApp.Model;

public class Message {
	private String sender;
	private String data;
	private String timeStamp;
	
	public Message() {
		
	}
	
	public Message(String sender, String data) {
		this.sender = sender;
		this.data = data;
	}
	
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}
	
	

}
