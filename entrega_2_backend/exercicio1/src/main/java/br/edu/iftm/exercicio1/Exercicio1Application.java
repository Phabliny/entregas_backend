package br.edu.iftm.exercicio1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Exercicio1Application implements CommandLineRunner{

	@Autowired
	TodoListRepository todoListRepository;

	@Autowired
	TodoListItemRepository todoListItemRepository;
	public static void main(String[] args) {
		SpringApplication.run(Exercicio1Application.class, args);
	}

	@Override
	public void run (String... args) throws Exception{
		TodoList todoList = new TodoList(null, "Compras Papelaria");

		TodoListItem i1 = new TodoListItem(null, "Caderno", todoList);
		TodoListItem i2 = new TodoListItem(null, "Apontador", todoList);
		TodoListItem i3 = new TodoListItem(null, "Caneta", todoList);
		TodoListItem i4 = new TodoListItem(null, "Borracha", todoList);

		// Salvar TodoList 
		todoListRepository.save(todoList);

		// Salvar itens
		todoListItemRepository.save(i1);
		todoListItemRepository.save(i2);
		todoListItemRepository.save(i3);
		todoListItemRepository.save(i4);

		TodoList todoList1 = new TodoList(null, "Compras Supermercado");

		TodoListItem i5 = new TodoListItem(null, "Arroz", todoList1);
		TodoListItem i6 = new TodoListItem(null, "Feijão", todoList1);
		TodoListItem i7 = new TodoListItem(null, "Café", todoList1);
		TodoListItem i8 = new TodoListItem(null, "Bolacha", todoList1);

		// Salvar TodoList 
		todoListRepository.save(todoList1);

		// Salvar itens
		todoListItemRepository.save(i5);
		todoListItemRepository.save(i6);
		todoListItemRepository.save(i7); 
		todoListItemRepository.save(i8);
	}

}
