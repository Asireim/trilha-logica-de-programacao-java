package br.com.db.desafios.Desafio4_Calculadora;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("--- CALCULADORA ---");
        System.out.println("Insira o primeiro número: ");
        int num1 = leitura.nextInt();

        System.out.println("Insira o segundo número: ");
        int num2 = leitura.nextInt();

        System.out.printf("""
                Operações disponíveis:
                
                1 - Adição
                2 - Subtração
                3 - Multiplicação
                4 - Divisão
                
                Insira o número correspondente à operação desejada.
                """);
        int operacao = leitura.nextInt();

        switch (operacao) {
            case 1:
                System.out.printf("Resultado da adição %d + %d: %d", num1, num2, (num1 + num2));
                break;
            case 2:
                System.out.printf("Resultado da subtração %d - %d: %d", num1, num2, (num1 - num2));
                break;
            case 3:
                System.out.printf("Resultado da multiplicação %d x %d: %d", num1, num2, (num1 * num2));
                break;
            case 4:
                System.out.printf("Resultado da divisão %d / %d: %.2f", num1, num2, (double)(num1 / num2));
                break;
            default:
                System.out.println("Operação inválida.");
        }
    }
}
