package com.example.gerenciadordetarefas;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private TextView mensagensTV;
    private androidx.appcompat.widget.AppCompatButton AdicionarTarefa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        mensagensTV = findViewById(R.id.mensagensTV);

        List<Tarefa> listTarefas = new ArrayList<>();
        listTarefas.add(new Atividade("Trabalho do professor Moisés", "Criar um app to-do list", "À Fazer"));
        listTarefas.add(new Atividade("Trabalho do professor Faria", "Exercicio da apostila", "À Fazer"));
        listTarefas.add(new Atividade("Trabalho do professor Josinei", "Apresentação de trabalho", "À Fazer"));
        listTarefas.add(new Atividade("Trabalho da professoa Andreia", "Apresentação do trabalho", "À Fazer"));


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        mensagensTV.setText(NotificationsParser.mostrarNotificacao(listTarefas));
    }
}