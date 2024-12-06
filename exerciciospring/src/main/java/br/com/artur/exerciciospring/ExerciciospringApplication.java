package br.com.artur.exerciciospring;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExerciciospringApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExerciciospringApplication.class, args);
	}
	@Entity
	@Getter
	@Setter
	@AllArgsConstructor
	@NoArgsConstructor
	@Table (name = "usuarios")
	public static class Usuario{
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id;
		}

		@Column(name = "Nome", nullable = false, length = 50)
		private String nome;

		@Column(name = "Senha", nullable = false, length = 100, unique = true)
		private String password;

		@Column(name = "Email", nullable = false,length = 100, unique = true)
		private String email;


}
