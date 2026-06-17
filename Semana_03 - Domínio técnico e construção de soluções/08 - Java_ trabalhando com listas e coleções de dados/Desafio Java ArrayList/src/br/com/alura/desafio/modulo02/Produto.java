package br.com.alura.desafio.modulo02;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
       return "\n==============================="+
                "\nProduto: " + this.getNome() +
                "\nIPreco: " + this.getPreco() +
                "\nQuantidade:  " + this.getQuantidade() +
                "\n===============================";
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
