package br.com.projeto.layout.model;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;


public class AlunoService {
    @Autowired AlunoDAO cdao;

    public void inserirAluno(Aluno aluno){
        cdao.inserirAluno(aluno);
    }

    public List<Map<String, Object>> listarAlunos(){
        return cdao.listarAlunos();
    }

}
