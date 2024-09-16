package org.example;

public class Pergunta {
    private String pergunta;
    private Enum resposta;

    private String codigoDeVerificacao;


    public Pergunta() {
        this.pergunta = null;
        this.resposta = null;
        this.codigoDeVerificacao = "#333";
    }

    public String getCodigoDeVerificacao(){
        return codigoDeVerificacao;
    }

    public void escreverPergunta(String pergunta, String resposta, String codigoDeVerificacao) {

        this.pergunta = pergunta;
        this.resposta = converterResposta(resposta);
        this.codigoDeVerificacao = codigoDeVerificacao;
    }
    public String exibirPergunta() {
        return this.pergunta;
    }

    public Alternativas converterResposta(String alternativa) {
        if (alternativa.equalsIgnoreCase("a")) {
            return Alternativas.A;
        }
        return Alternativas.B;
    }
}
