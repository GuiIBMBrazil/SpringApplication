package com.example.Filmes.domain;

public class Filmes {
    private String nome;
    private String diretor;
    private Integer hours_duraction;

    public Filmes(String nome,String diretor,Integer hours_duraction) {
        this.nome = nome;
        this.diretor = diretor;
        this.hours_duraction = hours_duraction;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getHours_duraction() {
        return hours_duraction;
    }

    public void setHours_duraction(Integer hours_duraction) {
        this.hours_duraction = hours_duraction;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
}
