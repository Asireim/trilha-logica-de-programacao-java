package br.com.db.desafios.desafio11_bloqueiodeusuario;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        String usuario = "aluno";
        String senha = "segredo";

        int erro = 0;
        int acerto = 0;

        while (acerto < 1 && erro < 3) {
            System.out.println("Insira o usuário: ");
            String user = leitura.nextLine();

            System.out.println("Insira a senha: ");
            String password = leitura.nextLine();

            if (user.equals(usuario) && password.equals(senha)) {
                System.out.println("Bem vindo!");
                acerto++;
            } else if (!user.equals(usuario) && !password.equals(senha)) {
                System.out.println("Usuário e senha incorretos.");
                erro++;
            } else if (!user.equals(usuario)) {
                System.out.println("Usuário incorreto.");
                erro++;
            } else if (!password.equals(senha)) {
                System.out.println("Senha incorreta.");
                erro++;
            }

            if (erro == 3) {
                System.out.println("Usuário bloqueado.");
            }
        }
    }
}
