package com.coffeortea.dto;

import java.io.Serializable;

import com.coffeortea.domain.Client;

public class ClientDTO  implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String name;
	
	public ClientDTO() {} 
	
	public ClientDTO(Client client) {
		id =  client.getId();
		name = client.getName();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
