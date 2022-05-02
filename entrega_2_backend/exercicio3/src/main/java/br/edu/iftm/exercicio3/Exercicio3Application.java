package br.edu.iftm.exercicio3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Exercicio3Application implements CommandLineRunner{

	@Autowired
	PostRepository postRepository;

	@Autowired
	PostCommentRepository postCommentRepository;

	public static void main(String[] args) {
		SpringApplication.run(Exercicio3Application.class, args);
	}

	@Override
	public void run (String... args) throws Exception{
		Post post = new Post(null, "Post 01");

		PostComment i1 = new PostComment(null, "Comentário 1", post);
		PostComment i2 = new PostComment(null, "Comentário 2", post);
		PostComment i3 = new PostComment(null, "Comentário 3", post);
		PostComment i4 = new PostComment(null, "Comentário 4", post);

		// Salvar TodoList 
		postRepository.save(post);

		postCommentRepository.save(i1);
		postCommentRepository.save(i2);
		postCommentRepository.save(i3);
		postCommentRepository.save(i4);

		Post post1 = new Post(null, "Post 02");

		PostComment i5 = new PostComment(null, "Comentário 5", post1);
		PostComment i6 = new PostComment(null, "Comentário 6", post1);

		// Salvar TodoList 
		postRepository.save(post1);

		postCommentRepository.save(i5);
		postCommentRepository.save(i6);
	}
}
