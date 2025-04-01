package com.todo.list.dto;

import java.time.LocalDate;

import com.todo.list.entities.Tarefa;
import com.todo.list.enums.Prioridade;
import com.todo.list.enums.Status;

public class TarefaDTO {

private Long id;

	private String descricao;
	private String setor;
	private LocalDate dataCadastro;
	private Prioridade prioridado;
	private Status status;
	private Long idUsuario;
	
	
	public TarefaDTO() {
		
	}
	public TarefaDTO(Long id, String descricao, String setor, LocalDate dataCadastro, Prioridade prioridado,
			Status status, Long idUsuario) {
		this.id = id;
		this.descricao = descricao;
		this.setor = setor;
		this.dataCadastro = dataCadastro;
		this.prioridado = prioridado;
		this.status = status;
		this.idUsuario = idUsuario;
	}
	public TarefaDTO(Tarefa tarefa) {
		id = tarefa.getId();
		descricao = tarefa.getDescricao();
		setor = tarefa.getSetor();
		dataCadastro = tarefa.getDataCadastro();
		prioridado = tarefa.getPrioridado();
		status = tarefa.getStatus();
		//para puxar id de tarefa vamos puxar o set de usuario
		idUsuario = tarefa.getUsuario().getId();
	}
	
	//Getters And Setters
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	public LocalDate getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	public Prioridade getPrioridado() {
		return prioridado;
	}
	public void setPrioridado(Prioridade prioridado) {
		this.prioridado = prioridado;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public Long getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}
	
	
	
	
}
