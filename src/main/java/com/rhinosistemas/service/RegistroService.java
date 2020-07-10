package com.rhinosistemas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rhinosistemas.model.Registro;
import com.rhinosistemas.repository.RegistroRepository;

@Service
public class RegistroService {
	
	@Autowired
	private RegistroRepository repository;
	
	public Registro salvar(Registro registro) {
		return repository.save(registro);
	}

}
