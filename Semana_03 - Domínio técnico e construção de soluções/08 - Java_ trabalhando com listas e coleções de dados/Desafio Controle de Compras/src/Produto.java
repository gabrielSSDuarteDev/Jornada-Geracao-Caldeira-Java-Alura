public class Produto implements Comparable<Produto> {
    private String descricao;
    private double preco;

    public Produto(String descricao, double preco) {
        this.descricao = descricao;
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }


    @Override
    public int compareTo(Produto outroProduto) {
        return Double.compare(this.preco, outroProduto.getPreco());
    }
}