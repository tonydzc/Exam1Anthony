package com.communicom.messaging.messages;

public class PingServerRequest extends Message {

	
	@Override
	public String toString() {
		return "Nombre: "+this.getName()+",  Numero"+this.getMessageNumber()+
				", Timestamp de emision"+this.getEmisionTime();
		
	}
	
	
	
}
