package org.Manager;

import java.util.HashMap;
import java.util.Random;

import org.Manager.Exceptions.MaximoDeQuestoesException;

public class Opcoes {
    private HashMap<Alternativas, String> opcoes;
    private final int maxDeOpcoes = 4;
    private boolean alternativaA;
    private boolean alternativaB;
    private boolean alternativaC;
    private boolean alternativaD;


    public Opcoes() {
        this.opcoes = new HashMap<>();
        this.alternativaA = true;
        this.alternativaB = true;
        this.alternativaC = true;
        this.alternativaD = true;

    }

    private Alternativas sortearAlternativa() {
        boolean run = true;
        while (run) {
            Random rand = new Random();
            int indiceAleatoria = rand.nextInt(1, 4);

            if ((indiceAleatoria == 1) && alternativaA == true) {
                alternativaA = false;
                run = false;
                return Alternativas.A;
            } else if ((indiceAleatoria == 2) && alternativaB == true) {
                alternativaB = false;
                run = false;
                return Alternativas.B;

            } else if ((indiceAleatoria == 3) && alternativaC == true) {
                alternativaC = false;
                run = false;
                return Alternativas.C;

            } else if ((indiceAleatoria == 4) && alternativaD == true) {
                alternativaD = false;
                run = false;
                return Alternativas.D;
            }
        }
        return null;
    }


        public void addOpcao(String opcao) throws MaximoDeQuestoesException {
            if (this.opcoes.size() >= maxDeOpcoes) {
                throw new MaximoDeQuestoesException("A quantidade de questões máxima foi atingida");
            } else {
                this.opcoes.put(sortearAlternativa(), opcao);
            }
        }

    @Override
    public String toString() {
        return "Opcoes{" +
                "opcoes=" + opcoes +
                ", maxDeOpcoes=" + maxDeOpcoes +
                ", alternativaA=" + alternativaA +
                ", alternativaB=" + alternativaB +
                ", alternativaC=" + alternativaC +
                ", alternativaD=" + alternativaD +
                '}';
    }
}


