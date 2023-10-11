package com.midominio.spring01.app.entity;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="clientes")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	private String apellido;
	private String email;
	
	@Column(name = "create_at")
	@DateTimeFormat(iso = ISO.DATE)
	private LocalDate createAt;
	
	/*
	// nombre del campo de la base de datos
	@Column(name = "create_at")
	// formato de los datos en la base de datos AAAA-MM-DD
	@DateTimeFormat(iso = ISO.DATE)
	private LocalDate createAt;
	*/
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public LocalDate getCreateAt() {
		return createAt;
	}
	public void setCreateAt(LocalDate createAt) {
		this.createAt = createAt;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
}
