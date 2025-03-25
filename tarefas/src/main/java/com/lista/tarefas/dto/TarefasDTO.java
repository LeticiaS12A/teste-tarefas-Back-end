package com.lista.tarefas.dto;

import java.time.LocalDate;

import com.lista.tarefas.entity.Tarefas;
import com.lista.tarefas.enums.Prioridade;
import com.lista.tarefas.enums.Status;



public class TarefasDTO {

	private Long id;
	private String descricao;
	private String nomeSetor;
	private LocalDate dataHora;
	private Prioridade prioridade;
	private Status status;
	
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
	public String getNomeSetor() {
		return nomeSetor;
	}
	public void setNomeSetor(String nomeSetor) {
		this.nomeSetor = nomeSetor;
	}
	public LocalDate getDataHora() {
		return dataHora;
	}
	public void setDataHora(LocalDate dataHora) {
		this.dataHora = dataHora;
	}
	public Prioridade getPrioridade() {
		return prioridade;
	}
	public void setPrioridade(Prioridade prioridade) {
		this.prioridade = prioridade;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	
	public TarefasDTO(Long id, String descricao, String nomeSetor, LocalDate dataHora, Prioridade prioridade,
			Status status) {
		this.id = id;
		this.descricao = descricao;
		this.nomeSetor = nomeSetor;
		this.dataHora = dataHora;
		this.prioridade = prioridade;
		this.status = status;
	}
	public TarefasDTO(Tarefas t) {
		id = t.getId();
		descricao = t.getDescricao();
		nomeSetor = t.getNomeSetor();
		dataHora = t.getDataHora();
		prioridade = t.getPrioridade();
		status = t.getStatus();
	}
	
	
	
}
