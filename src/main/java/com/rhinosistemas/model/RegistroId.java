package com.rhinosistemas.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class RegistroId implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private LocalDateTime dataRegistro;
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

}
