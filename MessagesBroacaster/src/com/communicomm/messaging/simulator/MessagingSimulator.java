package com.communicomm.messaging.simulator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.communicomm.messaging.messages.controller.MessageController;

public class MessagingSimulator {

	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static MessageController messageController = new MessageController();
	
	
	public static void main(String[] args) throws Exception{
		processUI();
	}

	private static void processUI() throws Exception{
		int option = 0;
		do {
			printOptions();
			option = getAction();
			processOption(option);
		} while (option != 4);
	}

	private static void printOptions() {
		System.out.println("MESSAGING SIMULATOR V1.0");
		System.out.println("1. Simulate Message");
		System.out.println("2. List simulated messages");
		System.out.println("3. Exit");
	}

	private static int getAction() throws Exception {
		return Integer.parseInt(br.readLine());
	}
	

	private static void processOption(int option) throws Exception  {
		int messageOption = askForOptions();
		if (option == 1){
			messageController.sendMessage(messageOption);	
		}
		if (option == 2){
			messageController.listMessage(messageOption);	
		}
		
	}

	private static int askForOptions() throws Exception {
		System.out.println("1. Ping Server Request");
		System.out.println("2. Ping Server Response");
		System.out.println("3. Set Wait For Signal Request");
		System.out.println("4. Set Wait For Signal Response");
		return Integer.parseInt(br.readLine());
	}	
	
}
