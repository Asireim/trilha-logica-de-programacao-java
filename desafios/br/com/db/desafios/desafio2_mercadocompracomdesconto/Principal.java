package br.com.db.desafios.desafio2_mercadocompracomdesconto;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Insira o nome do produto: ");
        String nome = leitura.nextLine();

        System.out.println("Insira o preço do produto: ");
        double preco = leitura.nextDouble();

        System.out.println("Insira a quantidade: ");
        int quantidade = leitura.nextInt();

        Produto produto = new Produto(nome, preco, quantidade);
        produto.calcularDesconto();
    }
}
