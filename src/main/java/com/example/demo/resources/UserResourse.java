package com.example.demo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.User;
import com.example.demo.sevices.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResourse {
	
	@Autowired
	private UserService service;
	
	@GetMapping
	public ResponseEntity<List> findAll() {
		List<User> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

}