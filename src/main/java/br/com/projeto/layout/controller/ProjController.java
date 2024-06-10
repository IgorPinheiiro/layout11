package br.com.projeto.layout.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.projeto.layout.model.Aluno;
import br.com.projeto.layout.model.AlunoService;


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
    public String cadastrar(Model model, @ModelAttribute Aluno aluno){
        AlunoService as = context.getBean(AlunoService.class);
		as.inserirAluno(aluno);
        return "redirect:registrado";
    }

    @GetMapping("/listar")
    public String listar(Model model){
        AlunoService as = context.getBean(AlunoService.class);
        List<Map<String,Object>> lista = as.listarAlunos();
        model.addAttribute("lista", lista);
        return "lista";
    }

}
