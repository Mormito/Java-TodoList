package com.example.gerenciadordetarefas;

import java.util.List;

public class NotificationsParser {
    public static String mostrarNotificacao(List<? extends Tarefa> list) {
        String tarefa = "";
        for (Tarefa tar : list) {
            tarefa += tar.getTarefa() + "\n";
        }

        return tarefa;
    }
}
