package org.Manager.Aplication;

import org.Manager.Quiz;
import org.Manager.QuizGUI;
import org.example.Alternativas;
import org.example.Pergunta;

public class Main {
    public static void main(String[] args) {
        QuizGUI quizGUI = new QuizGUI();
        Quiz quiz = new Quiz();
        Pergunta pergunta1 = new Pergunta();
        pergunta1.EscreverPergunta("Qual a cor do ceu?", Alternativas.A);
        quiz.addPergunta(1, pergunta1);

        Pergunta pergunta2 = new Pergunta();
        pergunta2.EscreverPergunta("Qual a cor do ceu?", Alternativas.A);
        quiz.addPergunta(2, pergunta2);

        quiz.getPerguntaRandom();
    }
}
