package com.project.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Client {
	
	// Si los campos tiene  el mismo nombre que en la BD no es necesario poner el atributo name.
	@GeneratedValue
	@Id
	private Long id;
	private String name;
	
	public Client(String name)
	{
		this.name=name;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
