package com.coffeortea.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.coffeortea.domain.Client;
import com.coffeortea.domain.Order;
import com.coffeortea.repository.ClientRepository;
import com.coffeortea.repository.OrderRepository;

@Configuration
public class Instantiation implements CommandLineRunner{
	
	@Autowired
	private ClientRepository clientRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Override
	public void run(String... args) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Client client1 = new Client(null, "Dennis Gabriel", "dennisgabr@gmailcom", "123");
		
		Order o1 = new Order(null, client1, sdf.parse("22/08/2023"));

		clientRepository.save(client1);
		orderRepository.save(o1);
	}

}
