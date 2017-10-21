package com.communicomm.messaging.messages.controller;

import java.util.ArrayList;

import com.communicom.messaging.messages.Message;
import com.communicom.messaging.messages.fabrica.MessagesFactory;

public class MessageController {
	private ArrayList<Message> messages = new ArrayList<Message>();
	private MessagesFactory fabrica = new MessagesFactory();
	
	public void sendMessage(int messageOption) {
		
		messages.add(fabrica.CreateMessage(messageOption));		
	}

	public void listMessage(int messageOption) {
		
	    System.out.println(messages.get(messageOption).toString());
		
	}

}
