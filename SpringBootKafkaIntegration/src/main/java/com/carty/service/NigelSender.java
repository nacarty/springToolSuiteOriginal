package com.carty.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class NigelSender {

	@Autowired
	private KafkaTemplate template;
	
	String topicName = "NigelTopic";
	
	public void sendMessage(String msg) {
		template.send(topicName, msg);
	}
}
