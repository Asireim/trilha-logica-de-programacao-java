package br.com.db.desafios.desafio3_notafinaldoaluno;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Insira a primeira nota do aluno: ");
        double nota1 = leitura.nextDouble();

        System.out.println("Insira a segunda nota do aluno: ");
        double nota2 = leitura.nextDouble();

        System.out.println("Insira a terceira nota do aluno: ");
        double nota3 = leitura.nextDouble();

        Aluno aluno = new Aluno(nota1, nota2, nota3);
        aluno.calcularMedia();
    }
}
