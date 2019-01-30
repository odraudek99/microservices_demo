package com.example.demo.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Cliente;
import com.example.demo.repository.ClienteRespository;

@RestController
@RequestMapping("/api/v1/cliente")
public class ClienteAPI {

	@Autowired
	private ClienteRespository clienteRespository;
	
	
	@GetMapping
	public List<Cliente> getAll() {
		return clienteRespository.findAll();
	}
	
	
	@PostMapping
	public Cliente add(@RequestBody Cliente cliente) {
		
		return clienteRespository.add(cliente);
	}
	
	
	
	
}
