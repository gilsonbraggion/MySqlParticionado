package com.rhinosistemas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rhinosistemas.model.Registro;
import com.rhinosistemas.service.RegistroService;

@RestController
@RequestMapping(value = "registros")
public class RegistroController {

	@Autowired
	private RegistroService service;
	
	@PostMapping
	public ResponseEntity<Registro> salvarRegistro(@RequestBody Registro registro) {
		
		try {
			return new ResponseEntity<Registro>(service.salvar(registro), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Registro>(HttpStatus.NOT_FOUND);
		}
		
	}
	
	
}
