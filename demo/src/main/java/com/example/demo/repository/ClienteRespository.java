package com.example.demo.repository;

import java.util.List;

import com.example.demo.model.Cliente;

public interface ClienteRespository {

	
	public Cliente add(Cliente cliente);
	public List<Cliente> findAll();
	public Cliente getCliente(Integer id); 
	
}
