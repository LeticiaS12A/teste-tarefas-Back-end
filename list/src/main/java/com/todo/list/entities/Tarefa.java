package com.todo.list.entities;

import java.time.LocalDate;

import com.todo.list.enums.Prioridade;
import com.todo.list.enums.Status;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_tarefa")
public class Tarefa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(columnDefinition = "TEXT")
	private String descricao;
	
	private String setor;
	private LocalDate dataCadastro;
	
	//O tipo da variavel será o nome do nosso enum Priodade
	private Prioridade prioridado;
	
	//O tipo da variavel será o nome do nosso enum Status
	private Status status;

	@ManyToOne
	@JoinColumn(name = "usuario_id")
	private Usuario usuario;
	
	//Constructors
	//Crontutor com parametros que não podem ser mechidos
	public Tarefa(Long id, String descricao, String setor, LocalDate dataCadastro, Prioridade prioridado,
			Status status) {
		this.id = id;
		this.descricao = descricao;
		this.setor = setor;
		this.dataCadastro = dataCadastro;
		this.prioridado = prioridado;
		this.status = status;
	}
	//Construtor (vazio/sem parametros) para que seja modificado pro 0
	public Tarefa() {
		
	}
	
	//Getters And Setters
	//Para pegar uma variavel privada para publica
	public Long getId() {
		return id;
	}
	//Para poder modificar a variavel
	public void setId(Long id) {
		this.id = id;
	}

	//Para pegar uma variavel privada para publica
	public String getDescricao() {
		return descricao;
	}
	//Para poder modificar a variavel
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	//Para pegar uma variavel privada para publica
	public String getSetor() {
		return setor;
	}
	//Para poder modificar a variavel
	public void setSetor(String setor) {
		this.setor = setor;
	}

	//Para pegar uma variavel privada para publica
	public LocalDate getDataCadastro() {
		return dataCadastro;
	}
	//Para poder modificar a variavel
	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	//Para pegar uma variavel privada para publica
	public Prioridade getPrioridado() {
		return prioridado;
	}
	//Para poder modificar a variavel
	public void setPrioridado(Prioridade prioridado) {
		this.prioridado = prioridado;
	}

	//Para pegar uma variavel privada para publica
	public Status getStatus() {
		return status;
	}
	//Para poder modificar a variavel
	public void setStatus(Status status) {
		this.status = status;
	}
	
	//Para pegar uma variavel privada para publica
	public Usuario getUsuario() {
		return usuario;
	}
	//Para poder modificar a variavel
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
	
}
