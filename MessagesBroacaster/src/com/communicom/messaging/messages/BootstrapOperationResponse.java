package com.communicom.messaging.messages;

public class BootstrapOperationResponse extends Message {
	private String version;
	private int result;
	private String errorMessage;
	
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	@Override
	public String toString() {
		return "Nombre: "+this.getName()+",  Numero"+this.getMessageNumber()+
				", Timestamp de emision"+this.getEmisionTime();
		
	}
	

}
