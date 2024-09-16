package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QuizGUI extends JFrame {

    public QuizGUI(){ // Variável para armazenar a resposta corret
        // Variável para armazenar a resposta correta


        // Variável para armazenar o saldo dos pontos
        int pontos = 0;

        // Rótulo para exibir o saldo
        JLabel rotuloPontos;



            // Criação de um novo JFrame
            JFrame frame = new JFrame("Show do Milhão");

            // Definir a operação padrão de fechamento
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Definir o tamanho da janela
            frame.setSize(700, 500); // Largura: 700, Altura: 500

            // Definir o layout do frame como BorderLayout
            frame.setLayout(new BorderLayout());

            // Definir a cor de fundo do conteúdo do frame
            frame.getContentPane().setBackground(Color.YELLOW);

            // Criar um painel para as perguntas na parte superior
            JPanel painelPerguntas = new JPanel();
            painelPerguntas.setLayout(new FlowLayout(FlowLayout.CENTER)); // Usar FlowLayout para centralizar o texto
            painelPerguntas.setOpaque(false); // Definir como não opaco para permitir a visualização da cor de fundo

            // Criar um rótulo para perguntas
            JLabel rotuloPergunta = new JLabel("Pergunta: Qual é a sua cor favorita?");
            rotuloPergunta.setFont(new Font("Arial", Font.BOLD, 16)); // Definir a fonte

            // Adicionar o rótulo ao painel de perguntas
            painelPerguntas.add(rotuloPergunta);

            // Criar um painel para o saldo
            JPanel painelPontos = new JPanel();
            painelPontos.setLayout(new FlowLayout(FlowLayout.CENTER)); // Usar FlowLayout para centralizar o texto
            painelPontos.setOpaque(false); // Definir como não opaco para permitir a visualização da cor de fundo

            // Criar um rótulo para exibir o saldo
            rotuloPontos = new JLabel("Saldo: R$ 0");
            rotuloPontos.setFont(new Font("Arial", Font.BOLD, 16)); // Definir a fonte

            // Adicionar o rótulo ao painel de pontos
            painelPontos.add(rotuloPontos);

            // Criar um painel para os botões, alinhado à parte inferior
            JPanel painelInferior = new JPanel();
            painelInferior.setLayout(new GridLayout(4, 1, 0, 10)); // GridLayout com 4 linhas e 1 coluna, espaçamento vertical de 10 pixels

            // Criar e adicionar os botões
            JButton botaoA = new JButton("Azul");
            JButton botaoB = new JButton("Vermelho");
            JButton botaoC = new JButton("Roxo");
            JButton botaoD = new JButton("Amarelo");

            // Adicionar os ActionListeners aos botões
            botaoA.addActionListener(new ButtonClickListener());
            botaoB.addActionListener(new ButtonClickListener());
            botaoC.addActionListener(new ButtonClickListener());
            botaoD.addActionListener(new ButtonClickListener());

            // Adicionar os botões no painel
            painelInferior.add(botaoA);
            painelInferior.add(botaoB);
            painelInferior.add(botaoC);
            painelInferior.add(botaoD);

            // Carregar a imagem (ícone)
            ImageIcon icone = new ImageIcon("C:\\Users\\jose roberto\\Documents\\ShowDoMilha\\.idea\\src\\main\\pictures\\pngtree-sack-of-cash-notes-png-image_12920390.png");
            Image imagem = icone.getImage();

            // Adicionar os painéis ao frame
            frame.add(painelPerguntas, BorderLayout.NORTH);
            frame.add(painelPontos, BorderLayout.CENTER); // Adicionar o painel de pontos ao centro
            frame.add(painelInferior, BorderLayout.SOUTH);

            // Definir a imagem como ícone da janela
            frame.setIconImage(imagem);

            // Tornar a janela visível
            frame.setVisible(true);
        }

        // Classe interna para o ActionListener dos botões
        private static class ButtonClickListener implements ActionListener {
            private static final String RESPOSTA_CORRETA = "Amarelo"; // Alterar para a resposta correta


            @Override
            public void actionPerformed(ActionEvent e) {

                // Variável para armazenar o saldo dos pontos
                int pontos = 0;
                // Rótulo para exibir o saldo
                JLabel rotuloPontos = null;

                // Obter o texto do botão clicado
                JButton source = (JButton) e.getSource();
                String textoBotao = source.getText();

                // Comparar com a resposta correta e atualizar o saldo
                if (textoBotao.equals(RESPOSTA_CORRETA)) {
                    pontos += 100;
                    JOptionPane.showMessageDialog(null, "Correta! Você acertou.");
                } else {
                    pontos -= 100;
                    JOptionPane.showMessageDialog(null, "Errado! Tente novamente.");
                }

                // Atualizar o rótulo com o saldo atual
                rotuloPontos.setText("Prêmio: R$ " + pontos);
            }
        }

}


