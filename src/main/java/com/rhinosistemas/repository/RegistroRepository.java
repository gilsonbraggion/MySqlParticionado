package com.rhinosistemas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rhinosistemas.model.Registro;
import com.rhinosistemas.model.RegistroId;

@Repository
public interface RegistroRepository extends JpaRepository<Registro, RegistroId> {
	
	
}
