package br.com.vianna.task.manager.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.vianna.task.manager.models.Tarefa;
import br.com.vianna.task.manager.services.CategoriaService;
import br.com.vianna.task.manager.services.UsuarioService;

@Controller
public class TarefaController {
	@Autowired
	private CategoriaService categoriaService;
	
	@Autowired
	private UsuarioService usuarioService;

    @GetMapping("/nova-tarefa")
    public String novaTarefa(Model model) {
        model.addAttribute("tarefa", new Tarefa());
        model.addAttribute("categorias", categoriaService.findAll());
        model.addAttribute("email", "admin@email.com");
       
        return "nova-tarefa"; 
    }
    
    @PostMapping("/salvar-tarefa")
    public String salvarTarefa(@ModelAttribute Tarefa tarefa, @ModelAttribute Long id) {
    	System.out.print(id);
        return "redirect:/";
    }

}
