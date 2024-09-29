package org.Manager;

import java.util.Objects;

public class Pergunta {
    private String pergunta;

    private String aAlternativasA;
    private String aAlternativasB;
    private String aAlternativasC;
    private String aAlternativasD;

    private String Resposta;

    public Pergunta() {
        this.pergunta = null;
        this.aAlternativasA = null;
        this.aAlternativasB = null;
        this.aAlternativasC = null;
        this.aAlternativasD = null;
    }

    public void EscreverPergunta(String pergunta, Alternativas resposta) {
        this.pergunta = pergunta;
        this.resposta = resposta;
    }
    public String exibirPergunta() {
        return this.pergunta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pergunta pergunta1 = (Pergunta) o;
        return Objects.equals(pergunta, pergunta1.pergunta) && Objects.equals(resposta, pergunta1.resposta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pergunta, resposta);
    }
}
