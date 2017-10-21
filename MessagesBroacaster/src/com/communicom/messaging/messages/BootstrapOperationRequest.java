package com.communicom.messaging.messages;

public class BootstrapOperationRequest extends Message {
	private String version;
	
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	
	@Override
	public String toString() {
		
		return "Nombre: "+this.getName()+",  Numero"+this.getMessageNumber()+
				", Timestamp de emision"+this.getEmisionTime();
		
	}
	
}
