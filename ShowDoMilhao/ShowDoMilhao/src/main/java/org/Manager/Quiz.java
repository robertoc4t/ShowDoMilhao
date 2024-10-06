package org.Manager;



import org.Manager.Exceptions.PerguntaNaoExisteException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Quiz {
    private HashMap<Integer, Pergunta> perguntas;

    public Quiz() {
        this.perguntas = new HashMap<>();
    }

    public void addPergunta(int n, Pergunta pergunta) {
        this.perguntas.put(n, pergunta);
    }

    public void addAlternativas(){

    }

    public void addResposta(){

    }

    public ArrayList<Integer> getKeys() {
        ArrayList<Integer> keys = new ArrayList<>();
        for (Integer pergunta : this.perguntas.keySet()) {
            keys.add(pergunta);
        }
        return keys;
    }

    public void getPerguntaRandom() {
        Random rand = new Random();
        int indiceAleatoria = rand.nextInt(getKeys().size());
        System.out.println(getKeys().get(indiceAleatoria));
    }

    public boolean existePergunta(Pergunta pergunta){
        for(Pergunta p: this.perguntas.values()){
            if(p.equals(pergunta)){
                return true;
            }
        }
        return false;
    }

    public void removePergunta(Pergunta pergunta) throws PerguntaNaoExisteException {
        if(existePergunta(pergunta)){
            throw new PerguntaNaoExisteException("A pergunta não existe!!");
        }else {
            for(Pergunta p: this.perguntas.values()){
                if(p.equals(pergunta)){
                    this.perguntas.remove(pergunta);
                }
            }
        }
    }


}
