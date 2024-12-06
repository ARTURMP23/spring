package br.com.artur.exerciciospring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired

    private UsuarioRepository usuarioRepository;

    public List<ExerciciospringApplication.Usuario> listarTodos(){
        return usuarioRepository.findAll();
    }

    public ExerciciospringApplication.Usuario salvarUsuario(ExerciciospringApplication.Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    public void alterarUsuario(Long id){
        usuarioRepository.deleteById(id);
    }

    public void deletarUsuario(Long id) {
        return;
    }
}
