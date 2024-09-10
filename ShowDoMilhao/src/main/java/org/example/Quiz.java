package org.example;

import java.util.ArrayList;

public class Quiz {
    private ArrayList<Pergunta> perguntas;

    public Quiz() {
        this.perguntas = new ArrayList<>();
    }
    public void inserirPergunta(Pergunta pergunta) {
        this.perguntas.add(pergunta);
    }
    public void apagarPergunta(Pergunta pergunta) {
        this.perguntas.remove(pergunta);
    }
}
