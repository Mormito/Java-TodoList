package com.example.gerenciadordetarefas;

public class Treino implements Tarefa{
    private String titulo;
    private String exercicios;
    private int horas;
    private boolean check;

    public Treino(String titulo, String exercicios, int horas, boolean check) {
        this.titulo = titulo;
        this.exercicios = exercicios;
        this.horas = horas;
        this.check = check;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getExercicios() {
        return exercicios;
    }

    public void setExercicios(String exercicios) {
        this.exercicios = exercicios;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public boolean isCheck() {
        return check;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }

    @Override
    public String getTarefa() {
        return "Treino: " + titulo + "\n" + exercicios + "\n" + "Horas: " + horas  + "\n" + check;
    }
}
