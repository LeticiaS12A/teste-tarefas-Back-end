package com.Bcript.safety.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.Bcript.safety.dto.UsuarioDTO;
import com.Bcript.safety.entities.Usuario;
import com.Bcript.safety.repositories.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Autowired
	private PasswordEncoder passwordEncoder;

	public UsuarioDTO salvar(UsuarioDTO usuarioDto) {

		Usuario usuario = new Usuario();

		usuario.setEmail(usuarioDto.getEmail());

		// Recebendo a senha do cadastro encriptografando ela e salvando no banco de
		// dados criptografado
		usuario.setSenha(passwordEncoder.encode(usuarioDto.getSenha()));

		usuario = usuarioRepository.save(usuario);
		return new UsuarioDTO(usuario);
	}

	// Para autenticar o usuario quando ele fizer login
	public boolean autenticarUsuario(UsuarioDTO usuarioDto) {

		// Pegando o metodo findByEmail para verificar se getEmail existe
		Usuario usuario = usuarioRepository.findByEmail(usuarioDto.getEmail());

		// Se email do usuario não existir retorna um erro
		if (usuario == null) {
			return false;
		}

		// Se o email do usuario existir retorna certo
		// Ele vai verificar se senha que escreveu no login é o mesmo do banco
		return passwordEncoder.matches(usuarioDto.getSenha(), usuario.getSenha());
	}

}
