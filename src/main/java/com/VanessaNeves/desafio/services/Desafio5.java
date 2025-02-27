package main.java.com.VanessaNeves.desafio.services;

public class Desafio5 {
    public static void executar(String texto) {
        String invertida = "";
        for (int i = texto.length() - 1; i >= 0; i--) {
            invertida += texto.charAt(i);
        }
        System.out.println("String invertida: " + invertida);
    }
}
