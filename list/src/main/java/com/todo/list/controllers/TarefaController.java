package com.todo.list.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todo.list.dto.TarefaDTO;
import com.todo.list.entities.Tarefa;
import com.todo.list.services.TarefaService;

import jakarta.validation.Valid;

//Rest vai responder a requisicao HTTP.
//Request define a url base a URL será "usuario" (/usuario).
@RestController
@RequestMapping("tarefa")
public class TarefaController {

	@Autowired
	TarefaService tarefaService;
	
	//Definindo que este metodo vai responder a requisições POST.
	@PostMapping
	public ResponseEntity<TarefaDTO> salvar(@Valid @RequestBody TarefaDTO tarefaDTO) {
		
		//Chama o servico (usuarioService) para salvar o usuario no banco de dados.
		tarefaDTO = tarefaService.salvar(tarefaDTO);
		
		//Retorna o usuario de usuarioDto salvo dentro de um ResponseEntity
		return ResponseEntity.ok(tarefaDTO);
	}
	
	@GetMapping
	public ResponseEntity<List<Tarefa>> listarTarefas(){
		return ResponseEntity.ok(tarefaService.listarTarefas());
	}
	
}
