package org.Manager;

import java.util.ArrayList;

public class Opcoes {
    private ArrayList<String> opcoes;





    public Opcoes() {
        this.opcoes = new ArrayList<>();
    }

    public void addOpcao(String opcao) {
        opcoes.add(opcao);
    }

    public ArrayList<String> getOpcoes() {
        return opcoes;
    }
}
