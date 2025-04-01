package com.todo.list.dto;

import com.todo.list.entities.Usuario;

public class UsuarioDTO {

	private Long id;
	private String nome;
	private String email;
	
	//Constructors
	public UsuarioDTO() {
		
	}
	public UsuarioDTO(Long id, String nome, String email) {
		this.id = id;
		this.nome = nome;
		this.email = email;
	}
	
	//para receber um dado do tipo usuario e passar para usuarioDto
	public UsuarioDTO(Usuario usuario) {
		id = usuario.getId();
		nome = usuario.getNome();
		email = usuario.getEmail();
	}
	
	//Getters and Setters
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
}
