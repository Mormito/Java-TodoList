package com.example.gerenciadordetarefas;

public class Atividade implements Tarefa {
    private String titulo;
    private String descricao;
    private boolean check;

    public Atividade(String titulo, String descricao, boolean check) {
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

    public boolean isCheck() {
        return check;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }

    @Override
    public String getTarefa() {
        return "Atividade: " + titulo + "\n" + descricao + "\n" + check + "\n";
    }
}