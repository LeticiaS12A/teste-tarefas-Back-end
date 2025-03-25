package com.lista.tarefas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lista.tarefas.dto.TarefasDTO;
import com.lista.tarefas.service.TarefasService;

@RequestMapping(value = "/tarefas")
@RestController
public class TarefasController {
	
	@Autowired
	TarefasService tarefasService;
	
	@PostMapping
	public ResponseEntity<TarefasDTO> adicionarTarefas(@RequestBody TarefasDTO tarefasDTO){
		tarefasDTO = tarefasService.adicionarTarefas(tarefasDTO);
		return ResponseEntity.ok(tarefasDTO);
	}
	
	@GetMapping(value = "buscar")
	public ResponseEntity<List<TarefasDTO>> buscar(){
		return ResponseEntity.ok(tarefasService.buscarTarefas());
	}
}
