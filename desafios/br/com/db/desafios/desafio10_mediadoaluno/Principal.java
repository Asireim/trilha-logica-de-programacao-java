package br.com.db.desafios.desafio10_mediadoaluno;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        String menu = """
                
                1 - Realizar novo cálculo.
                2 - Encerrar programa.
                
                Digite o número correspondente à opção desejada:
                %n""";

        int opcao = 0;

        while (opcao != 2) {
            System.out.println("Insira a primeira nota do aluno: ");
            double nota1 = leitura.nextDouble();

            System.out.println("Insira a segunda nota do aluno: ");
            double nota2 = leitura.nextDouble();

            double media = ((nota1 + nota2) / 2);

            if (media >= 7) {
                System.out.printf("A média final do aluno foi de %.2f e ele foi aprovado!%n", media);
            } else if (media < 7) {
                System.out.printf("A média final do aluno foi de %.2f e ele foi reprovado!%n", media);
            }

            System.out.printf(menu);
            opcao = leitura.nextInt();

            if (opcao == 2) {
                System.out.println("Encerrando aplicação...");
            }
        }
    }
}
