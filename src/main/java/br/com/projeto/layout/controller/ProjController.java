package br.com.projeto.layout.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;
import br.com.projeto.layout.model.AlunoService;
import br.com.projeto.layout.model.Aluno;


@Controller
public class ProjController {

    @Autowired private ApplicationContext context;
    
    @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/cadastrar")
    public String cadastrar(Model model){
        model.addAttribute("aluno", new Aluno());
        return "cadastro";
    }

    @PostMapping("/cadastrar")
    public String cadastrar(Model model, @ModelAttribute Aluno cli){
        AlunoService cs = context.getBean(AlunoService.class);
		cs.inserirAluno(cli);
        return "registrado";
    }

}
