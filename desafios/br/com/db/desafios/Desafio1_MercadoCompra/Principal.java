package br.com.db.desafios.Desafio1_MercadoCompra;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        String menu = """
                --- BEM-VINDO AO MERCADO ---
                
                Opções disponíveis:
                
                1 - Cerveja
                2 - Refrigerante
                3 - Água
                
                Digite o número da opção desejada:
                """;

        System.out.println(menu);
        int opcao = leitura.nextInt();

        if (opcao == 1) {
            System.out.println("Informe sua idade: ");
            int idade = leitura.nextInt();

            if (idade < 18) {
                System.out.println("Compra negada!");
            } else {
                System.out.println("Compra efetuada com sucesso!");
            }
        } else if (opcao == 2 || opcao == 3) {
            System.out.println("Compra efetuada com sucesso!");
        } else {
            System.out.println("Opção inválida.");
        }
    }
}
