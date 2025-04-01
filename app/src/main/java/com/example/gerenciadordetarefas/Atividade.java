package com.example.gerenciadordetarefas;

public class Atividade implements Tarefa {
    private String titulo;
    private String descricao;
    private String check;
    //atualizacao de check

    public Atividade(String titulo, String descricao, String check) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.check = check;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCheck() {
        return check;
    }

    public void setCheck(String check) {
        this.check = check;
    }

    @Override
    public String getTarefa() {
        return "Atividade: " + titulo + "\n" + descricao + "\n" + check + "\n";
    }
}