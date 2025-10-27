package br.com.db.desafios.desafio6_encerraprograma;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int num = 1;

        while (num != 10) {
            System.out.println("Insira um número de 1 a 10: ");
            num = leitura.nextInt();

            if (num <= 0 || num > 10) {
                System.out.println("Número inválido.");
            }

            if (num == 10) {
                System.out.println("Encerrando aplicação...");
            }
        }
    }
}
