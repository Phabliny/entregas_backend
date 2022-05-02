package br.edu.iftm.exercicio2;

import java.util.List;
import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Library {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @OneToMany(mappedBy = "library")
    private List<Book> book= new ArrayList<Book>();


    public Library(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
    
}