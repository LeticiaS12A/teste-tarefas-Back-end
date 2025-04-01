package com.todo.list.services;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todo.list.dto.TarefaDTO;
import com.todo.list.entities.Tarefa;
import com.todo.list.entities.Usuario;
import com.todo.list.enums.Prioridade;
import com.todo.list.enums.Status;
import com.todo.list.repositories.TarefaRepository;
import com.todo.list.repositories.UsuarioRepository;

@Service
public class TarefaService {
		
	@Autowired
	TarefaRepository tarefaRepository;
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	public TarefaDTO salvar(TarefaDTO tarefaDto) {
		//aqui a gente diz que vamos criar um novo usuario
		Tarefa tarefa = new Tarefa();
		//modificamos(set) a variavel e depois enviamos(get) ela pro nosso dto
		tarefa.setDescricao(tarefaDto.getDescricao());
		tarefa.setSetor(tarefaDto.getSetor());
		tarefa.setDataCadastro(LocalDate.now());
		tarefa.setPrioridado(Prioridade.BAIXA);
		tarefa.setStatus(Status.A_FAZER);
		
		//Salva no banco o que as infos do usuario
		Usuario user = usuarioRepository.getReferenceById(tarefaDto.getIdUsuario());
		
		tarefa.setUsuario(user);
		
		tarefa = tarefaRepository.save(tarefa);
		
		return new TarefaDTO(tarefa);
	}
	
	public List<Tarefa> listarTarefas(){
		List<Tarefa> tarefa = tarefaRepository.findAll();
		
		return tarefa;
	}
	
}
