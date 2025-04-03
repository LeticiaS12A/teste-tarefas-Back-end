package com.Bcript.safety.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Bcript.safety.dto.UsuarioDTO;
import com.Bcript.safety.services.UsuarioService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("usuario")
public class UsuarioController {

	@Autowired
	UsuarioService usuarioService;
	
	@PostMapping(value = "/salvar")
	public ResponseEntity<UsuarioDTO> salvar(@Valid @RequestBody UsuarioDTO usuarioDto){
		usuarioDto = usuarioService.salvar(usuarioDto);
		
		return ResponseEntity.ok(usuarioDto);
	}
	
	//Retornando um post de login feito com sucesso ou negado
	@PostMapping(value = "/login")	
	public ResponseEntity<?> login(@RequestBody UsuarioDTO usuarioDto){ 
		
		//Atribuindo o metodo de autentificar usuario aqui no nosso login
		boolean login = usuarioService.autenticarUsuario(usuarioDto);
		
		//Se o email e senha estiver corretos retorna sucesso
		if(login) {
			return ResponseEntity.ok("Sucessu!!!");
		}
		//Se algum estiver inválido retorna que email ou senha esta inválidos
		else {
			return ResponseEntity.status(401).body("Email ou senha inválidos!");
		}
	}
	
}
