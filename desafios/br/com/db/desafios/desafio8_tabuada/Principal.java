package br.com.db.desafios.desafio8_tabuada;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int num = 1;

        while (num != 0) {

            System.out.println("Digite zero para sair. Informe um número inteiro entre 1 e 10: ");
            num = leitura.nextInt();

            if (num < 0 || num > 10) {
                System.out.println("Número inválido.");
            } else if (num == 0) {
                System.out.println("Encerrando aplicação...");
            } else {
                for (int i = 1; i <= 10; i++) {
                    System.out.printf("%d x %d = %d%n", num, i, num*i);
                }
            }
        }

    }
}
