package br.com.db.desafios.Desafio3_NotaFinalDoAluno;

public class Aluno {
    private double nota1;
    private double nota2;
    private double nota3;

    public Aluno(double nota1, double nota2, double nota3) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public void calcularMedia() {
        double media = ((nota1 + nota2 + nota3) / 3);

        if (media >= 7) {
            System.out.printf("Média final: %.1f%n", media);
            System.out.println("O aluno foi aprovado!");
        } else if (media >= 5) {
            System.out.printf("Média final: %.1f%n", media);
            System.out.println("O aluno está de recuperação.");
        } else if (media < 5) {
            System.out.printf("Média final: %.1f%n", media);
            System.out.println("O aluno foi reprovado!");
        }
    }
}
