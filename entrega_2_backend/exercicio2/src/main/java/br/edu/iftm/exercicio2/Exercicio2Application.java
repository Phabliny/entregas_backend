package br.edu.iftm.exercicio2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Exercicio2Application implements CommandLineRunner {

	@Autowired
	BookRepository bookRepository;

	@Autowired
	LibraryRepository libraryRepository;

	public static void main(String[] args) {
		SpringApplication.run(Exercicio2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception{
		Library library = new Library(null, "Terror");

		Book i1 = new Book(null, "Livro 1", library);
		Book i2 = new Book(null, "Livro 2", library);
		Book i3 = new Book(null, "Livro 3", library);
		Book i4 = new Book(null, "Livro 4", library);

		libraryRepository.save(library);

		bookRepository.save(i1);
		bookRepository.save(i2);
		bookRepository.save(i3);
		bookRepository.save(i4);

		Library library1 = new Library(null, "Romance");

		Book i5 = new Book(null, "Livro 5", library1);
		Book i6 = new Book(null, "Livro 6", library1);
		Book i7 = new Book(null, "Livro 7", library1);

		libraryRepository.save(library1);

		bookRepository.save(i5);
		bookRepository.save(i6);
		bookRepository.save(i7);
	}
}
