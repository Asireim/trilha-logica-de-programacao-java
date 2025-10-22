package br.com.db.desafios.Desafio7_SomaDeValores;

public class Principal {
    public static void main(String[] args) {
        int soma = 0;

        for (int i = 0; i <= 100; i++) {
            soma += i;
        }

        System.out.println("A soma dos números de 1 a 100 é: " + soma);
    }
}
