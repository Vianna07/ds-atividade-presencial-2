package br.com.vianna.task.manager.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.vianna.task.manager.models.Usuario;
import br.com.vianna.task.manager.repositories.UsuarioRepository;

@Service
public class UsuarioService {
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public Usuario findByEmail(String email) {
		return usuarioRepository.findByEmailLike(email); 
	}
	
	public Usuario findByIdAndSave(Long id) {
		return null;
	}
}
