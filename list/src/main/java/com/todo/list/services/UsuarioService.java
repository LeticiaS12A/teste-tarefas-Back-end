package com.todo.list.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todo.list.dto.UsuarioDTO;
import com.todo.list.entities.Usuario;
import com.todo.list.repositories.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	UsuarioRepository usuarioRepository;
	
	public UsuarioDTO salvar(UsuarioDTO usuarioDTO) {
		//aqui a gente diz que vamos criar um novo usuario
		Usuario usuario = new Usuario();
		//modificamos(set) a variavel e depois enviamos(get) ela pro nosso dto
		usuario.setNome(usuarioDTO.getNome());
		usuario.setEmail(usuarioDTO.getEmail());
		
		//Salva no banco o que as infos do usuario
		usuario = usuarioRepository.save(usuario);
		
		return new UsuarioDTO(usuario);
	}
	
}
