package br.com.vianna.task.manager.config;

import br.com.vianna.task.manager.models.Usuario;
import br.com.vianna.task.manager.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public void run(String... args) throws Exception {
        if (!usuarioRepository.existsByEmail("admin@email.com")) {
            Usuario admin = new Usuario();
            admin.setNome("Admin");
            admin.setEmail("admin@email.com");
            admin.setSenha("12345678");

            usuarioRepository.save(admin);
        }
    }
}
