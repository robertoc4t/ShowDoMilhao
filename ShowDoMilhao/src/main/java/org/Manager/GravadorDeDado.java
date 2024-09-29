package org.example;

import java.io.*;
import java.util.HashMap;

public class GravadorDeDado {

    private static final String ARQUIVOCONTATOS = "contatos.dat";


    public HashMap<String, Pergunta> recuperarContat()throws IOException {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(ARQUIVOCONTATOS))) {
            return (HashMap<String, Pergunta>) in.readObject();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Arquivo .dat não encontrado");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public void salvarContatos(HashMap<String, Pergunta> perguntas) throws IOException{
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(ARQUIVOCONTATOS))){
            out.writeObject(perguntas);
        } catch(IOException e){
            throw new IOException(e);
        }

    }


}

