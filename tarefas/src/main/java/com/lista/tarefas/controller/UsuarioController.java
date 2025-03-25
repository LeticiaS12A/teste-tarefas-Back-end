package com.lista.tarefas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lista.tarefas.dto.UsuarioDTO;
import com.lista.tarefas.service.UsuarioService;

@RequestMapping("usuario")
@RestController
public class UsuarioController {

	@Autowired
	UsuarioService usuarioService;
	
	@PostMapping(name = "adicionar")
	public ResponseEntity<UsuarioDTO> adicionarUsuario(@RequestBody UsuarioDTO usuarioDTO){
		usuarioDTO = usuarioService.adicionarUsuario(usuarioDTO);
		return ResponseEntity.ok(usuarioDTO);
	}
	
}
