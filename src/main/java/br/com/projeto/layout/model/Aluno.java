package br.com.projeto.layout.model;

public class Aluno {
    private int id, idade, telefone;
    private String nome, observacao, responsavel;


    public Aluno(){

    }

    public Aluno(String nome, String observacao, String responsavel, int idade, int telefone){
        this.nome = nome;
        this.observacao = observacao;
        this.responsavel = responsavel;
        this.idade = idade;
        this.telefone = telefone;
    }

    public Aluno(int id,  String nome, String observacao, String responsavel, int idade, int telefone){
        this.id = id;
        this.nome = nome;
        this.observacao = observacao;
        this.responsavel = responsavel;
        this.idade = idade;
        this.telefone = telefone;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setObservacao(String observacao){
        this.observacao = observacao;
    }

    public void setResponsavel(String responsavel){
				this.responsavel = responsavel;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getIdade() {
      return idade;
    }

    public int getTelefone() {
        return telefone;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public int getId(){
        return id;
    }

    public String getObservacao(){
        return observacao;
    }

    public String getNome(){
        return nome;
    }




}


