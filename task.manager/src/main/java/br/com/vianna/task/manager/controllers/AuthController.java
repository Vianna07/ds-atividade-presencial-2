package br.com.vianna.task.manager.controllers;

import br.com.vianna.task.manager.models.Usuario;
import br.com.vianna.task.manager.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AuthController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute("titulo", "Login");
        model.addAttribute("botaoTexto", "Entrar");
        model.addAttribute("formAction", "/login");
        model.addAttribute("linkTexto", true);
        return "login";
    }

    @GetMapping("/registrar")
    public String registrar(Model model) {
        model.addAttribute("titulo", "Registrar-se");
        model.addAttribute("botaoTexto", "Registrar");
        model.addAttribute("formAction", "/registrar");
        model.addAttribute("linkTexto", false);
        return "login";
    }

    @PostMapping("/login")
    public String realizarLogin(String emailCHANGE, String senhaCHANGE) {
//        try {
//            Authentication authentication = authenticationManager.authenticate(
//                new UsernamePasswordAuthenticationToken(email, senha)
//            );
//            SecurityContextHolder.getContext().setAuthentication(authentication);
//            return "redirect:/index";
//        } catch (Exception e) {
//            return "redirect:/login?error";
//        }
    	
        return "redirect:/";
    }

    @PostMapping("/registrar")
    public String realizarRegistro(Usuario usuario) {
        usuario.setSenha(passwordEncoder.encode(usuario.getSenha()));
        usuarioRepository.save(usuario);
        return "redirect:/login";
    }

    @GetMapping("/index")
    public String index() {
        return "index";
    }
}
