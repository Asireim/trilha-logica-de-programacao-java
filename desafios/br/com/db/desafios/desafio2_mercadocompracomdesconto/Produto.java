package br.com.db.desafios.desafio2_mercadocompracomdesconto;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void calcularDesconto() {
        if (this.quantidade <= 10) {
            System.out.printf("Não há descontos. O valor integral de R$ %.2f deve ser pago.", (this.preco * this.quantidade));
        } else if (this.quantidade >= 11 && this.quantidade <= 20) {
            double total = (this.preco * this.quantidade);
            double calculo = (total * (10.0 / 100));
            System.out.printf("Desconto de 10 por cento concedido! O valor total da compra é: R$ %.2f", total - calculo);
        } else if (this.quantidade >= 21 && this.quantidade <= 50) {
            double total = (this.preco * this.quantidade);
            double calculo = (total * (20.0 / 100));
            System.out.printf("Desconto de 20 por cento concedido! O valor total da compra é: R$ %.2f", total - calculo);
        } else if (this.quantidade > 50) {
            double total = (this.preco * this.quantidade);
            double calculo = (total * (25.0 / 100));
            System.out.printf("Desconto de 25 por cento concedido! O valor total da compra é: R$ %.2f", total - calculo);
        }
    }
}
