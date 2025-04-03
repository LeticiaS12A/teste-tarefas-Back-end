package com.Bcript.safety.dto;

import com.Bcript.safety.entities.Usuario;

public class UsuarioDTO {

	private Long id;
	private String email;
	private String senha;
	
	//Constructors
	public UsuarioDTO() {
	
	}
	public UsuarioDTO(Long id, String email, String senha) {
		this.id = id;
		this.email = email;
		this.senha = senha;
	}
	public UsuarioDTO(Usuario u) {
		id = u.getId();
		email = u.getEmail();
		senha = u.getSenha();
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
