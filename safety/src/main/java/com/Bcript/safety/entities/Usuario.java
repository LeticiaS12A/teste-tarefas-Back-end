package com.Bcript.safety.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_usuario")
public class Usuario {
	
	//Para definir a variavel id como uma chave primaria
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	//Para gerar numeros automaticamente em sequencia
	private Long id;
	
	@Column(unique = true)
	private String email;
	private String senha;
	
	//Constructors
	public Usuario() {
	
	}
	public Usuario(Long id, String email, String senha) {
		this.id = id;
		this.email = email;
		this.senha = senha;
	}
	
	//Getters and Setters
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	

}
