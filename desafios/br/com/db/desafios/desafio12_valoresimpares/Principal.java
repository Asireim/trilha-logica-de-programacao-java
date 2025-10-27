package br.com.db.desafios.desafio12_valoresimpares;

public class Principal {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5,6,7,8,9,10};
        int cont = 0;

        System.out.println("Números ímpares:");

        for (int i = 0; i < numeros.length; i++) {
            if (!(numeros[i] % 2 == 0)) {
                System.out.println(numeros[i]);
                cont++;
            }
        }

        System.out.println("Quantidade: " + cont);
    }
}
