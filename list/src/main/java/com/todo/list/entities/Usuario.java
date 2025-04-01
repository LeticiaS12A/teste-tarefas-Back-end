package com.todo.list.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

//Entity para que essa class seja indentificada como tabela
//Table para dar um nome especifico a nossa tabela
@Entity
@Table(name = "tb_usuario")
public class Usuario {

	//Para que indentifique como chave primaria
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	@Column(unique = true)
	private String email;
	
	@OneToMany( mappedBy = "usuario", fetch = FetchType.EAGER) 
	private List<Tarefa> tarefas;
	
	//Constructors
	//Crontutor com parametros que não podem ser mechidos
	public Usuario(Long id, String nome, String email) {
		this.id = id;
		this.nome = nome;
		this.email = email;
	}
	//Construtor (vazio/sem parametros) para que seja modificado
	public Usuario() {
		
	}
	
	//Getters and Setters
	//Para pegar uma variavel privada para publica
	public Long getId() {
		return id;
	}
	//Para poder modificar a variavel
	public void setId(Long id) {
		this.id = id;
	}
	
	//Para pegar uma variavel privada para publica
	public String getNome() {
		return nome;
	}
	//Para poder modificar a variavel
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//Para pegar uma variavel privada para publica
	public String getEmail() {
		return email;
	}
	//Para poder modificar a variavel
	public void setEmail(String email) {
		this.email = email;
	}
	
	//Para pegar uma variavel privada para publica
	public List<Tarefa> getTarefas() {
		return tarefas;
	}
	//Para poder modificar a variavel
	public void setTarefas(List<Tarefa> tarefas) {
		this.tarefas = tarefas;
	}
	
	
}
