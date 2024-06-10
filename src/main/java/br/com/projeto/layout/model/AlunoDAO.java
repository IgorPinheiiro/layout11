package br.com.projeto.layout.model;

import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import jakarta.annotation.PostConstruct;

@Repository
public class AlunoDAO {
    
    @Autowired
    private DataSource dataSource;

    private JdbcTemplate jdbcTemplate;

    @PostConstruct
    private void initialize() {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public void inserirAluno(Aluno aluno) {
        String sql = "INSERT INTO aluno(nome, observacao, responsavel, idade, telefone) VALUES (?, ?, ?, ?, ?)";
        Object[] params = new Object[5];
        params[0] = aluno.getNome();
        params[1] = aluno.getObservacao();
        params[2] = aluno.getResponsavel();
        params[3] = aluno.getIdade();
        params[4] = aluno.getTelefone();
        jdbcTemplate.update(sql, params);
    }

    // public void inserirAluno(Aluno aluno) {
    //     String sql = "INSERT INTO aluno(nome, observacao, responsavel, idade, telefone) VALUES (?, ?, ?, ?, ?)";
    //     try {
    //         jdbcTemplate.update(sql, aluno.getNome(), aluno.getObservacao(), aluno.getResponsavel(), aluno.getIdade(), aluno.getTelefone());
    //     } catch (DataAccessException e) {
    //         e.printStackTrace();
    //     }
    // }

    public List<Map<String, Object>> listarAlunos() {
        String sql = "SELECT * FROM aluno";
        return jdbcTemplate.queryForList(sql);
    }
}