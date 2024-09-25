package br.com.vianna.task.manager.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.vianna.task.manager.models.Usuario;
import br.com.vianna.task.manager.services.UsuarioService;

public class HomeController {
	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping
	public String index(Model model) {
	    Usuario usuario = usuarioService.findByEmail("admin@email.com");
	    
	    model.addAttribute("tarefas", usuario.getTarefas());
	    model.addAttribute("usuario", usuario);
	    
	    return "index";
	}
}
