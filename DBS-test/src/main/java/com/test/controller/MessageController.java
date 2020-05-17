package com.test.controller;

import java.util.Queue;

import javax.jms.Destination;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")

public class MessageController {

	@Autowired
	private JmsTemplate jmsTemplate;

	@GetMapping("message/{message}")

	public ResponseEntity<String> publish(@PathVariable("message") final String message) {

		jmsTemplate.convertAndSend("ProductReceiverQueue", message);

		return new ResponseEntity(message, HttpStatus.OK);

	}
}
