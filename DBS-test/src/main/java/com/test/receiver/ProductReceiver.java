package com.test.receiver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.test.entity.Product;
import com.test.repository.ProductRepository;

@Component
public class ProductReceiver {

	@Autowired
	private ProductRepository productRepository;

	@JmsListener(destination = "ProductReceiverQueue", containerFactory = "myFactory")
	public void receiveMessage(Product product) {

		System.out.println("Received <" + product + ">");

		productRepository.save(product);

	}

}