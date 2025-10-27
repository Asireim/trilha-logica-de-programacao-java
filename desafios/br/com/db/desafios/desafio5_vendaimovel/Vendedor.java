package br.com.db.desafios.desafio5_vendaimovel;

public class Vendedor {
    private String nome;
    private double valor;

    public Vendedor(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    private double calculaComissao(double comissao) {
        double calculo = (this.valor * (comissao / 100));
        return calculo;
    }

    String resumo = """
                    Nome do vendedor: %s
                    Porcentagem de comissão: %d
                    Valor da venda: R$ %.2f
                    Valor da comissão: R$ %.2f
                    Total a receber: R$ %.2f
                    %n""";

    public void verificaComissao() {
        if (this.valor >= 50000.00) {
            System.out.printf(resumo, this.nome, 20, this.valor, calculaComissao(20.00), this.valor + calculaComissao(20.00));
        } if (this.valor >= 30000.00 && this.valor < 50000.00) {
            System.out.printf(resumo, this.nome, 15, this.valor, calculaComissao(15.00), this.valor + calculaComissao(15.00));
        } if (this.valor < 30000.00) {
            System.out.printf(resumo, this.nome, 10, this.valor, calculaComissao(10.00), this.valor + calculaComissao(10.00));
        }
    }
}
