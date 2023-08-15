package com.coffeortea.dao;

import com.coffeortea.domain.Client;

public class ClientDAO {
	private String name;
	private String email;
	public ClientDAO(Client client) {
		name = client.getName();
		email = client.getEmail();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
