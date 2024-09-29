package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QuizGUI extends JFrame {

    public QuizGUI(){ 
        

        
        JLabel rotuloPontos;



            
            JFrame frame = new JFrame("Show do Milhão");

            
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

           
            frame.setSize(700, 500);

           
            frame.setLayout(new BorderLayout());

            
            frame.getContentPane().setBackground(Color.YELLOW);

            
            JPanel painelPerguntas = new JPanel();
            painelPerguntas.setLayout(new FlowLayout(FlowLayout.CENTER)); 
            painelPerguntas.setOpaque(false); 

            
            JLabel rotuloPergunta = new JLabel("Pergunta: Qual é a sua cor favorita?");
            rotuloPergunta.setFont(new Font("Arial", Font.BOLD, 16)); 

            painelPerguntas.add(rotuloPergunta);

            

           
            JPanel painelInferior = new JPanel();
            painelInferior.setLayout(new GridLayout(4, 1, 0, 10)); 
          
            JButton botaoA = new JButton("Azul");
            JButton botaoB = new JButton("Vermelho");
            JButton botaoC = new JButton("Roxo");
            JButton botaoD = new JButton("Amarelo");

           
            botaoA.addActionListener(new ButtonClickListener());
            botaoB.addActionListener(new ButtonClickListener());
            botaoC.addActionListener(new ButtonClickListener());
            botaoD.addActionListener(new ButtonClickListener());

           
            painelInferior.add(botaoA);
            painelInferior.add(botaoB);
            painelInferior.add(botaoC);
            painelInferior.add(botaoD);

           
            ImageIcon icone = new ImageIcon("C:\\Users\\jose roberto\\Documents\\ShowDoMilha\\.idea\\src\\main\\pictures\\pngtree-sack-of-cash-notes-png-image_12920390.png");
            Image imagem = icone.getImage();

        
            frame.add(painelPerguntas, BorderLayout.NORTH);
            frame.add(painelPontos, BorderLayout.CENTER); 
            frame.add(painelInferior, BorderLayout.SOUTH);

        
            frame.setIconImage(imagem);

            
            frame.setVisible(true);
        }

       
        private static class ButtonClickListener implements ActionListener {
            private static final String RESPOSTA_CORRETA = "Amarelo"; 


            @Override
            public void actionPerformed(ActionEvent e) {

                
                int pontos = 0;
                
                JLabel rotuloPontos = null;

                
                JButton source = (JButton) e.getSource();
                String textoBotao = source.getText();

                
                if (textoBotao.equals(RESPOSTA_CORRETA)) {
                    pontos += 100;
                    JOptionPane.showMessageDialog(null, "Correta! Você acertou.");
                } else {
                    pontos -= 100;
                    JOptionPane.showMessageDialog(null, "Errado! Tente novamente.");
                }

                
                rotuloPontos.setText("Prêmio: R$ " + pontos);
            }
        }

}


