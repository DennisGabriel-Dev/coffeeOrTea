package com.coffeortea.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.coffeortea.domain.Client;
import com.coffeortea.repository.ClientRepository;

@Configuration
public class Instantiation implements CommandLineRunner{
	
	@Autowired
	private ClientRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		Client client1 = new Client(null, "Dennis Gabriel", "dennisgabr@gmailcom", "123");
		repository.save(client1);
	}

}
