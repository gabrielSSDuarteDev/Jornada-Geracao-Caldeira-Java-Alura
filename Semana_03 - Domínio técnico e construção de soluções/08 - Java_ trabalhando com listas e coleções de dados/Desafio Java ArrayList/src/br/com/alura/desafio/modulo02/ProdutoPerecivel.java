package br.com.alura.desafio.modulo02;

public class ProdutoPerecivel extends Produto {
    private int AnodataValidade;


    public ProdutoPerecivel(String nome, double preco, int quantidade, int AnodataValidade) {
        super(nome, preco, quantidade);
        this.AnodataValidade = AnodataValidade;
    }

    @Override
    public String toString() {
         return "\n==============================="+
                 "\nProduto: " + this.getNome() +
                 "\nIPreco: " + this.getPreco() +
                 "\nQuantidade:  " + this.getQuantidade() +
                 "\nAnodataValidade: " + AnodataValidade +
                 "\n===============================";

    }

    public int getAnodataValidade() {
        return AnodataValidade;
    }
}
