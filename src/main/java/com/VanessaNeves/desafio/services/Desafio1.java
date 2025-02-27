package main.java.com.VanessaNeves.desafio.services;

public class Desafio1 {
    public static void executar() {
        int INDICE = 13, SOMA = 0, K = 0;
        while (K < INDICE) {
            K = K + 1;
            SOMA = SOMA + K;
        }
        System.out.println("Resultado do Desafio 1: " + SOMA);
    }
}
