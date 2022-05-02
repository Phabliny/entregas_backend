package iftm.edu.br.atividade_1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador {
    
    @GetMapping("/alo")
    public Dominio greeting() {
            return new Dominio("alô mundo");
    }
}
