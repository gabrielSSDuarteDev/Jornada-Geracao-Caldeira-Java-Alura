package br.com.alura.desafio.modulo02;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Produto produto1 = new Produto("Camisa",99.99,2);
        Produto produto2 = new Produto("Casaco",149.99,3);
        Produto produto3 = new Produto("Calça",129.99,4);

        ArrayList<Produto> carrinho = new ArrayList<>();
        carrinho.add(produto1);
        carrinho.add(produto2);
        carrinho.add(produto3);

        ProdutoPerecivel produto4 = new ProdutoPerecivel("Luvas",12.99,5,2026);
        carrinho.add(produto4);
        System.out.println(carrinho.size());
        for (Produto produto : carrinho) {
            System.out.println(produto);
        }
    }
}
