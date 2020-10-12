package com.example.demo.sevices;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Products;
import com.example.demo.repositories.ProductsRepository;

@Service
public class ProductsService {

	@Autowired
	private ProductsRepository repository;

	public List<Products> findAll() {
		return repository.findAll();
	}

	public Products findByID(long id) {
		Optional<Products> obj = repository.findById(id);
		return obj.get();
	}
}
