package com.aluracursos.LIBRERIA;

import com.aluracursos.LIBRERIA.main.Main;
import com.aluracursos.LIBRERIA.repository.AuthorRepository;
import com.aluracursos.LIBRERIA.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LibreriaAlura implements CommandLineRunner
{

	public static void main(String[] args)
	{
		SpringApplication.run(LibreriaAlura.class, args);
	}

	@Autowired
	private LibroRepository repository;
	@Autowired
	private AuthorRepository authorRepository;
	public void run(String[] args) {
		Main principal = new Main(repository,authorRepository);
		principal.showMenu();
	}
}
