package main.java.com.VanessaNeves.desafio;

import main.java.com.VanessaNeves.desafio.services.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nDesafio Técnico - Java");
            System.out.println("1 - Executar Desafio 1");
            System.out.println("2 - Executar Desafio 2 (Sequência de Fibonacci)");
            System.out.println("3 - Executar Desafio 3 (Faturamento Diário)");
            System.out.println("4 - Executar Desafio 4 (Percentual de Faturamento por Estado)");
            System.out.println("5 - Executar Desafio 5 (Inversão de String)");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    Desafio1.executar();
                    break;
                case 2:
                    System.out.print("Informe um número para verificar na sequência de Fibonacci: ");
                    int numero = scanner.nextInt();
                    Desafio2.executar(numero);
                    break;
                case 3:
                    Desafio3.executar();
                    break;
                case 4:
                    Desafio4.executar();
                    break;
                case 5:
                    System.out.print("Informe uma string para inverter: ");
                    String texto = scanner.nextLine();
                    Desafio5.executar(texto);
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();

        }

}
