package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Cliente;
import com.example.demo.model.Genero;

@Repository
public class ClienteRespositoryImpl implements ClienteRespository {

	private static List<Cliente> clientes = new ArrayList<>();
	
	static {
		clientes.add(new Cliente(1, "Granados", "Eduardo", 32, Genero.MASCULINO));
	}
	
	@Override
	public Cliente add(Cliente cliente) {
		cliente.setId(clientes.size()+1);
		clientes.add(cliente);
		return cliente;
	}

	@Override
	public List<Cliente> findAll() {
		return clientes;
	}

	@Override
	public Cliente getCliente(Integer id) {
		
		for (Cliente c: clientes) {
			if (c.getId().equals(id)) {
				return c;
			}
		}
		
		return null;
	}

}
