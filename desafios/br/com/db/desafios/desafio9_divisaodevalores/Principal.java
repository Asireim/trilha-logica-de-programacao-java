package br.com.db.desafios.desafio9_divisaodevalores;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int num1 = 0;
        int num2 = 1;

        for (int i = 1; i <= 1; i++) {
            System.out.println("Informe o primeiro número para a divisão: ");
            num1 = leitura.nextInt();
        }

        for (int i = 1; i <= 1; i++) {
            System.out.println("Informe o segundo número para a divisão: ");
            num2 = leitura.nextInt();

            if (num2 == 0) {
                i--;
            }
        }

        double divisao = (double) num1 / num2;

        if (num2 != 0) {
            System.out.printf("A divisão do número %d pelo número %d é: %.2f %n", num1, num2, divisao);
        }
    }
}
