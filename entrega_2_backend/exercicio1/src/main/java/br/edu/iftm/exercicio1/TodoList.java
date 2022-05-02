package br.edu.iftm.exercicio1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class TodoList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;

    @OneToMany(mappedBy = "todolist")
    private List<TodoListItem> todolistitem = new ArrayList<TodoListItem>();


    public TodoList(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }
    
}