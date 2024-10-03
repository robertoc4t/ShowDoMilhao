package org.Manager;



import org.Manager.Exceptions.PerguntaNaoExisteException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Quiz {
    private HashMap<Integer, Pergunta> perguntas;

    public Quiz() {
        this.perguntas = new HashMap<>();
    }

    public void addPergunta(int n, Pergunta pergunta) {
        this.perguntas.put(n, pergunta);
    }

    public void addAlternativas(){

    }

    public void addResposta(){

    }

    public ArrayList<Integer> getKeys() {
        ArrayList<Integer> keys = new ArrayList<>();
        for (Integer pergunta : this.perguntas.keySet()) {
            keys.add(pergunta);
        }
        return keys;
    }

    public void getPerguntaRandom() {
        Random rand = new Random();
        int indiceAleatoria = rand.nextInt(getKeys().size());
        System.out.println(getKeys().get(indiceAleatoria));
    }

    public boolean existePergunta(Pergunta pergunta){
        for(Pergunta p: this.perguntas.values()){
            if(p.equals(pergunta)){
                return true;
            }
        }
        return false;
    }

    public void removePergunta(Pergunta pergunta) throws PerguntaNaoExisteException {
        if(existePergunta(pergunta)){
            throw new PerguntaNaoExisteException("A pergunta não existe!!");
        }else {
            for(Pergunta p: this.perguntas.values()){
                if(p.equals(pergunta)){
                    this.perguntas.remove(pergunta);
                }
            }
        }
    }


    public static class QuizGUIAdmin {

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

    public static class QuizGUIUser {
    }
}
