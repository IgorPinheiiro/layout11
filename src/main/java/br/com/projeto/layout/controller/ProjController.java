package br.com.projeto.layout.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProjController {
    
    @GetMapping("/home")
    public String home(){
        return "home";
    }

    @GetMapping("/cadastro")
    public String cadastro(){
        return "cadastro";
    }

    @GetMapping("/registrado")
    public String registrado(){
        return "registrado";
    }
}
