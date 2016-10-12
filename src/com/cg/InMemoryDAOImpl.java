package com.cg;

import java.util.LinkedList;
import java.util.List;

public class InMemoryDAOImpl implements IDao {

	@Override
	public List<String> getMessages() {

		List<String> messages = new LinkedList<>();
		
		String message1= "Hello World!";
		String message2= "How are you";
		
		messages.add(message1);
		messages.add(message2);
		
		return messages;
	}

}
