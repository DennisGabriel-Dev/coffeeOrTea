package com.coffeortea.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.coffeortea.domain.Order;
import com.coffeortea.service.OrderService;

@Controller
public class OrderController {
	@Autowired
	private OrderService service;

	@GetMapping(value = "/orders")
	public ResponseEntity<List<Order>> findAll(){
		List<Order> orders = service.findAll();
		return ResponseEntity.ok().body(orders);
	}
}
