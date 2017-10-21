package com.communicom.messaging.messages;

import java.time.LocalDateTime;

public abstract class Message {
	private String name;
	private int messageNumber;
	private String sourceAddress;
	private String targetAddress;
	private LocalDateTime emisionTime;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMessageNumber() {
		return messageNumber;
	}
	public void setMessageNumber(int messageNumber) {
		this.messageNumber = messageNumber;
	}
	public String getSourceAddress() {
		return sourceAddress;
	}
	public void setSourceAddress(String sourceAddress) {
		this.sourceAddress = sourceAddress;
	}
	public String getTargetAddress() {
		return targetAddress;
	}
	public void setTargetAddress(String targetAddress) {
		this.targetAddress = targetAddress;
	}
	public LocalDateTime getEmisionTime() {
		return emisionTime;
	}
	public void setEmisionTime(LocalDateTime emisionTime) {
		this.emisionTime = emisionTime;
	}
	
	@Override
	public String toString() {
		
		return "Nombre: "+this.getName()+",  Numero"+this.getMessageNumber()+
				", Timestamp de emision"+this.getEmisionTime();
		
	}
}
