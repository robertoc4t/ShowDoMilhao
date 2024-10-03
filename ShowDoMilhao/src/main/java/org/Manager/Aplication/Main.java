package org.Manager.Aplication;

import org.Manager.Pergunta;
import org.Manager.Quiz;

public class Main {
    public static void main(String[] args) {
        Quiz.QuizGUIAdmin quizGUI = new Quiz.QuizGUIAdmin();
        Quiz quiz = new Quiz();
        Pergunta pergunta1 = new Pergunta();
        pergunta1.EscreverPergunta("Qual a cor do ceu?");

        pergunta1.cadastraOpcao("aa");
        pergunta1.cadastraOpcao("bb");
        pergunta1.cadastraOpcao("cc");
        pergunta1.cadastraOpcao("dd");

        System.out.println(pergunta1.toString());

        quiz.addPergunta(1, pergunta1);

        Pergunta pergunta2 = new Pergunta();
        pergunta2.EscreverPergunta("Qual a cor do ceu?");

        pergunta2.cadastraOpcao("aa");
        pergunta2.cadastraOpcao("bb");
        pergunta2.cadastraOpcao("cc");
        pergunta2.cadastraOpcao("dd");

        System.out.println(pergunta2.toString());

        quiz.addPergunta(2, pergunta2);


    }
}
