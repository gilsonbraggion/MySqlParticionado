package com.rhinosistemas.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.PrePersist;
import javax.persistence.Table;

@Entity
@IdClass(RegistroId.class)
@Table(name = "Registro")
public class Registro implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Id
	private LocalDateTime dataRegistro;

	private String textoRegistro;

	public String getTextoRegistro() {
		return textoRegistro;
	}

	public void setTextoRegistro(String textoRegistro) {
		this.textoRegistro = textoRegistro;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDateTime getDataRegistro() {
		return dataRegistro;
	}

	public void setDataRegistro(LocalDateTime dataRegistro) {
		this.dataRegistro = dataRegistro;
	}

	@PrePersist
	public void prePersist() {
		this.dataRegistro = LocalDateTime.now();
	}

}
