package com.example.demo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Products;
import com.example.demo.sevices.ProductsService;

@RestController
@RequestMapping(value = "/products")
public class ProductsResourse {
	
	@Autowired
	private ProductsService service;
	
	@GetMapping
	public ResponseEntity<List> findAll() {
		List<Products> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Products> findById(@PathVariable long id){
		Products Products = service.findByID(id);
		return ResponseEntity.ok().body(Products);
	}

}
