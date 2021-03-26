package edu.ifsul.pdm.myapplication;

public class Pessoa {

    private int id;
    private String nome;
    private int count = 1;

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    Pessoa(String nome){
        setNome(nome);
        this.id = count++;
    }
}
