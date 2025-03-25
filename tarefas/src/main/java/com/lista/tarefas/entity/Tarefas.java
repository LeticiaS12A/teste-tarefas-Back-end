package com.lista.tarefas.entity;

import java.time.LocalDate;

import com.lista.tarefas.enums.Prioridade;
import com.lista.tarefas.enums.Status;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_tarefas")
public class Tarefas {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String descricao;
	private String nomeSetor;
	private LocalDate dataHora;
	private Prioridade prioridade;
	private Status status;
	
	@ManyToOne
	@JoinColumn(name = "id_usuario")
	private Usuario usuario;

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

	public Usuario getUsuarios() {
		return usuario;
	}

	public void setUsuarios(Usuario usuarios) {
		this.usuario = usuarios;
	}

	public Tarefas(Long id, String descricao, String nomeSetor, LocalDate dataHora, Prioridade prioridade,
			Status status, Usuario usuarios) {
		this.id = id;
		this.descricao = descricao;
		this.nomeSetor = nomeSetor;
		this.dataHora = dataHora;
		this.prioridade = prioridade;
		this.status = status;
		this.usuario = usuarios;
	}

	public Tarefas() {
	
	}
	
	
	
}
