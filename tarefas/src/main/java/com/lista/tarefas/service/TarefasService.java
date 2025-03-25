package com.lista.tarefas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lista.tarefas.dto.TarefasDTO;
import com.lista.tarefas.dto.UsuarioDTO;
import com.lista.tarefas.entity.Tarefas;
import com.lista.tarefas.entity.Usuario;
import com.lista.tarefas.repository.TarefasRepository;
import com.lista.tarefas.repository.UsuarioRepository;

@Service
public class TarefasService {

	@Autowired
	TarefasRepository tarefasRepository;
	
	public TarefasDTO adicionarTarefas(TarefasDTO dto){
		Tarefas tarefas = new Tarefas();
		
		tarefas.setDescricao(dto.getDescricao());
		tarefas.setNomeSetor(dto.getNomeSetor());
		tarefas.setDataHora(dto.getDataHora());
		tarefas.setPrioridade(dto.getPrioridade());
		tarefas.setStatus(dto.getStatus());
		
		Tarefas saveTarefas = tarefasRepository.save(tarefas);
		
		return new TarefasDTO(saveTarefas);
	}
	
	
	public List<TarefasDTO> buscarTarefas(){
		List<Tarefas> list = tarefasRepository.findAll();
		return list.stream().map(x -> new TarefasDTO(x)).toList();
	}
	
	
}
