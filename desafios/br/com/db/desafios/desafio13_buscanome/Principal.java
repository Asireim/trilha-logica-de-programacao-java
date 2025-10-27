package br.com.db.desafios.desafio13_buscanome;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int cont = 0;
        ArrayList<String> nomes = new ArrayList<>();

        while (cont < 10) {
            System.out.println("Insira um nome a ser adicionado na lista: ");
            String nome = leitura.nextLine();
            nomes.add(nome);
            cont++;
        }

        System.out.println("Insira o nome a ser verificado: ");
        String achaNome = leitura.nextLine();

        if (nomes.contains(achaNome)) {
            System.out.println("Achei");
        } else {
            System.out.println("Não achei");
        }
    }
}
