package br.com.artur.exerciciospring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired

    private UsuarioService usuarioService;

    @GetMapping
    public List<ExerciciospringApplication.Usuario> listarTodos() {
        return usuarioService.listarTodos();
    }

    @PostMapping

    public ExerciciospringApplication.Usuario criarUsuario (@RequestBody ExerciciospringApplication.Usuario usuario){
        return usuarioService.salvarUsuario(usuario);
    }

    @DeleteMapping("/{id}")
    public  void deletarUsuario(@PathVariable Long id){
        usuarioService.deletarUsuario(id);
    }
}
