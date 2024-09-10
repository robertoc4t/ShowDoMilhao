package org.example;

public class Pergunta {
    private String pergunta;
    private Enum resposta;


    public Pergunta() {
        this.pergunta = null;
        this.resposta = null;
    }

    public void EscreverPergunta(String pergunta, Enum resposta) {
        this.pergunta = pergunta;
        this.resposta = resposta;
    }
    public String exibirPergunta() {
        return this.pergunta;
    }

}
