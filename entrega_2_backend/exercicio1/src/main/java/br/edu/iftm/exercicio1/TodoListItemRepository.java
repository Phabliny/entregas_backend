package br.edu.iftm.exercicio1;

import org.springframework.data.repository.CrudRepository;

public interface TodoListItemRepository extends CrudRepository<TodoListItem, Integer> {
    
}
