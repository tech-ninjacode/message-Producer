package com.example.message_Producer.controller;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageProducer {
	
	@Autowired
	private RabbitTemplate rabbitTemplate;

	@PostMapping("/send")
	public String sendMessage(@RequestParam String message) {
		rabbitTemplate.convertAndSend("demoQueue", message);
		return "Message sent: " + message;
	}
}
