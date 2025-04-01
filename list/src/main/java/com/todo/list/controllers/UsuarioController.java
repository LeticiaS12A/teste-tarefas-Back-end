package com.todo.list.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todo.list.dto.UsuarioDTO;
import com.todo.list.services.UsuarioService;

import jakarta.validation.Valid;

//Rest vai responder a requisicao HTTP.
//Request define a url base a URL será "usuario" (/usuario).
@RestController
@RequestMapping("usuario")
public class UsuarioController {

	@Autowired
	UsuarioService usuarioService;
	
	//Definindo que este metodo vai responder a requisições POST.
	@PostMapping
	public ResponseEntity<UsuarioDTO> salvar(@Valid @RequestBody UsuarioDTO usuarioDto) {
		
		//Chama o servico (usuarioService) para salvar o usuario no banco de dados.
		usuarioDto = usuarioService.salvar(usuarioDto);
		
		//Retorna o usuario de usuarioDto salvo dentro de um ResponseEntity
		return ResponseEntity.ok(usuarioDto);
	}
	
}
