package br.com.projeto.layout.model;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class AlunoDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void inserirAluno(Aluno aluno) {
        String sql = "INSERT INTO aluno(nome, idade, telefone, responsavel, observacao) VALUES (?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, aluno.getNome(), aluno.getIdade(), aluno.getTelefone(), aluno.getResponsavel(), aluno.getObservacao());
    }

    public List<Map<String, Object>> listarAlunos() {
        String sql = "SELECT * FROM aluno";
        return jdbcTemplate.queryForList(sql);
    }

    public void deletarAluno(int id) {
        String sql = "DELETE FROM aluno WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }
}