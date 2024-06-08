package edu.operadores;

public class operadores {
    
    public static void main(String[] args) {
        String nomeUm = "Matheus";
        String nomeDois = new String ("Matheus");

        System.out.println(nomeUm == nomeDois);
        System.out.println(nomeUm.equals(nomeDois));


        int numero1 = 1;
        int numero2 = 2;
        boolean simNao = numero1 != numero2;

        if (numero1 < numero2) {
            System.out.println("Nossa condição é verdadeira");
        }
        
        System.out.println(simNao);
    }
    
}
