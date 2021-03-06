package br.edu.iftm.exercicio1;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class TodoListItem {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nomeDoItem;

    @ManyToOne
    private TodoList todolist;

    public TodoListItem(){

    }

    public TodoListItem(Integer id, String nomeDoItem, TodoList todolist){
        this.id = id;
        this.nomeDoItem = nomeDoItem;
        this.todolist = todolist;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeDoItem() {
        return this.nomeDoItem;
    }

    public void setNomeDoItem(String nomeDoItem) {
        this.nomeDoItem = nomeDoItem;
    }

    public TodoList getTodolist() {
        return this.todolist;
    }

    public void setTodolist(TodoList todolist) {
        this.todolist = todolist;
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", nomeDoItem='" + getNomeDoItem() + "'" +
            ", todolist='" + getTodolist() + "'" +
            "}";
    }

}
