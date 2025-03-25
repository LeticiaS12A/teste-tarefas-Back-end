package com.lista.tarefas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lista.tarefas.dto.UsuarioDTO;
import com.lista.tarefas.entity.Usuario;
import com.lista.tarefas.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	UsuarioRepository usuarioRepository;
	
	public UsuarioDTO adicionarUsuario(UsuarioDTO dto){
		Usuario usuario = new Usuario();
		
		usuario.setNome(dto.getNome());
		usuario.setEmail(dto.getEmail());
		
		Usuario saveUsuario = usuarioRepository.save(usuario);
		
		return new UsuarioDTO(saveUsuario);
	}
	
	
}
