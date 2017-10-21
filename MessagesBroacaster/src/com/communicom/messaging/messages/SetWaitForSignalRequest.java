package com.communicom.messaging.messages;

import com.communicom.messaging.messages.signals.SignalType;

public class SetWaitForSignalRequest extends Message{
	private SignalType signal;
	private String signalValue;
	
	public SignalType getSignal() {
		return signal;
	}

	public void setSignal(SignalType signal) {
		this.signal = signal;
	}

	public String getSignalValue() {
		return signalValue;
	}

	public void setSignalValue(String signalValue) {
		this.signalValue = signalValue;
	}
	
	@Override
	public String toString() {
		return "Nombre: "+this.getName()+",  Numero"+this.getMessageNumber()+
				", Timestamp de emision"+this.getEmisionTime();
		
	}
}
