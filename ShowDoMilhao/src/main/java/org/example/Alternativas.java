package org.example;

public enum Alternativas {
    A("A"),
    B("B"),
    C("C"),
    D("D");
    private String alternativa;

    private Alternativas(String alternativa) {
        this.alternativa = alternativa;
    }
    public String getAlternativa() {
        return alternativa;
    }
}
