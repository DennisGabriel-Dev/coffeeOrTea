package com.coffeortea.config;

import java.text.SimpleDateFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.coffeortea.dao.ClientDTO;
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
		Client client1 = new Client(null, "Dennis Gabriel", "dennisgabr@gmail.com", "123");
		
		ClientDTO clientDAO1 = new ClientDTO(client1);
		
		Order o1 = new Order(null, clientDAO1, sdf.parse("22/08/2023"), "Three cups of tea.");

		clientRepository.save(client1);
		orderRepository.save(o1);
	}

}
