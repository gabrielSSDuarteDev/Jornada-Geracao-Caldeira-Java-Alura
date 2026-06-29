package ExerciciosModulo03.Operacoes;

import ExerciciosModulo03.Modelos.ProdutosRecord;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<ProdutosRecord>  produtos;


    public Carrinho(List<ProdutosRecord> produtos) {
        this.produtos = new ArrayList<>();
    }


    public void AdicionarProduto(ProdutosRecord produto){
        if(produtos != null){
            this.produtos.add(produto);
        }

    }
     public double calcularTotalUSD(){
        double total = 0;
        for(ProdutosRecord produto: this.produtos){
            total += produto.price();
        }
        return total;
     }

    public List<ProdutosRecord> getProdutos(){
        return this.produtos;
    }
}
