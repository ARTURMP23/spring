package br.com.artur.exerciciospring;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<ExerciciospringApplication.Usuario,Long> {
}
