package org.Manager;

import java.util.Objects;

public class Pergunta {
    private String pergunta;
    private Opcoes opcoes;

    private String Resposta;

    public Pergunta() {
        this.pergunta = null;
        this.opcoes = null;
    }

    public void EscreverPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public void cadastraOpcao(String opcao) {
        this.opcoes.addOpcao(opcao);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pergunta pergunta1 = (Pergunta) o;
        return Objects.equals(pergunta, pergunta1.pergunta) && Objects.equals(opcoes, pergunta1.opcoes) && Objects.equals(Resposta, pergunta1.Resposta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pergunta, opcoes, Resposta);
    }

    @Override
    public String toString() {
        return "Pergunta{" +
                "pergunta='" + pergunta + '\'' +
                ", opcoes=" + opcoes +
                ", Resposta='" + Resposta + '\'' +
                '}';
    }
}
