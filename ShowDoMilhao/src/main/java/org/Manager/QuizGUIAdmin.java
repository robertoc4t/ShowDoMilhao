package org.Manager;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class QuizGUIAdmin {

    public QuizGUIAdmin() {
        JFrame box = new JFrame();
        box.setTitle("QuizAdmin");
        box.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        box.setLayout(new FlowLayout());
        box.setSize(400, 400);
        box.setVisible(true);

        JPanel painelCadastrar = new JPanel();
        box.add(painelCadastrar);


        JButton excluirPergunta = new JButton("Excluir Pergunta");
        JButton cadastrarPergunta = new JButton("Cadastrar Pergunta");
        painelCadastrar.add(excluirPergunta);
        painelCadastrar.add(cadastrarPergunta);

        box.add(excluirPergunta);
        box.add(cadastrarPergunta);


        JTextArea textoArea = new JTextArea(5, 20);
        JScrollPane scrollPane = new JScrollPane(textoArea);
        painelCadastrar.add(textoArea);

        box.add(scrollPane, BorderLayout.CENTER);





        JPanel painelDePerguntas = new JPanel();
        box.add(painelDePerguntas);

        JTextArea cadastraOpcao1 = new JTextArea(5, 20);
        JScrollPane scrollPane1 = new JScrollPane(textoArea);
        painelDePerguntas.add(cadastraOpcao1);

        box.add(scrollPane1, BorderLayout.CENTER);

        JTextArea cadastrarOpcao2 = new JTextArea(5, 20);
        JScrollPane scrollPane2 = new JScrollPane(textoArea);
        painelDePerguntas.add(cadastrarOpcao2);

        box.add(scrollPane2, BorderLayout.CENTER);

        JTextArea cadastrarOpcao3 = new JTextArea(5, 20);
        JScrollPane scrollPane3 = new JScrollPane(textoArea);
        painelDePerguntas.add(cadastrarOpcao3);

        box.add(scrollPane3, BorderLayout.CENTER);

        JTextArea cadastrarOpcao4 = new JTextArea(5, 20);
        JScrollPane scrollPane4 = new JScrollPane(textoArea);
        painelDePerguntas.add(cadastrarOpcao4);

        box.add(scrollPane4, BorderLayout.CENTER);




        //empilhando os paineis
        box.setLayout(new BoxLayout(box.getContentPane(), BoxLayout.Y_AXIS));
    }

}