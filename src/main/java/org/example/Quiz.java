package org.example;

import java.util.ArrayList;
import java.util.HashMap;

public class Quiz {
    private HashMap<String, Pergunta> perguntas;


    public Quiz(){
        this.perguntas = new HashMap<>();
    }


    public void inserirPergunta(Pergunta pergunta) {
        this.perguntas.put(pergunta.getCodigoDeVerificacao(),pergunta);
    }

    public void apagarPergunta(Pergunta pergunta) throws PerguntaNaoEcontradaEsception{
        if(perguntaExiste(pergunta)) {
            this.perguntas.remove(pergunta.getCodigoDeVerificacao(), pergunta);
        }
        throw new PerguntaNaoEcontradaEsception("Macacos me mordão!");
    }

    public boolean perguntaExiste(Pergunta pergunta){
        if(this.perguntas.containsKey(pergunta.getCodigoDeVerificacao())){
            return true;
        }
        return false;
    }

    public HashMap<String, Pergunta> getPerguntas() {
        return perguntas;
    }

}
