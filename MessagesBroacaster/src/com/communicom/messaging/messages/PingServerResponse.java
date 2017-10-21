package com.communicom.messaging.messages;

public class PingServerResponse extends Message{
	
		
	@Override
	public String toString() {
		return "Nombre: "+this.getName()+",  Numero"+this.getMessageNumber()+
				", Timestamp de emision"+this.getEmisionTime();
		
	}
}
