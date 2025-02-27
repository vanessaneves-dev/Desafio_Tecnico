package main.java.com.VanessaNeves.desafio.services;

public class Desafio2 {
    public static void executar(int numero) {
        int a = 0, b = 1, temp;
        while (b < numero) {
            temp = a + b;
            a = b;
            b = temp;
        }
        if (b == numero || numero == 0) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }
    }
}
