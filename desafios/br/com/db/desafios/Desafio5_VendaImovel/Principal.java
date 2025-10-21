package br.com.db.desafios.Desafio5_VendaImovel;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Insira o nome do vendedor: ");
        String nome = leitura.nextLine();

        System.out.println("Insira o valor da venda: ");
        double valor = leitura.nextDouble();

        Vendedor vendedor = new Vendedor(nome, valor);
        vendedor.verificaComissao();
    }
}
