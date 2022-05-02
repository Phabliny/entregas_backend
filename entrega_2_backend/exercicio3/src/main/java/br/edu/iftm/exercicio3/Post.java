package br.edu.iftm.exercicio3;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Post {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)  
  private Long id;
  private String title;
  
  @OneToMany(mappedBy = "post")
  private List<PostComment> postcommet = new ArrayList<PostComment>();

  public Post(Long id, String title) {
    this.id = id;
    this.title = title;
  }
}
