package com.carty.step;

import java.text.ParseException;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.UnexpectedInputException;

public class Reader implements ItemReader<String>{

	private String[] messages = {"cogent", "Welcome tp Spring", "We use H2 in this batch"};


	private int count = 0;
	
	@Override	
	public String read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException{
		if (count < messages.length) {
			return messages[count++];
		}
		else
			count = 0;
		
	
	return null;
    }
	}