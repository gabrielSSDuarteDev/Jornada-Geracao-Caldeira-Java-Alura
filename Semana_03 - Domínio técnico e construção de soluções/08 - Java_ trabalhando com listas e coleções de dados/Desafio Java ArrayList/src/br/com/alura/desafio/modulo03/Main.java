package br.com.alura.desafio.modulo03;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //Foreach Array
        ArrayList<String> listaStrings = new ArrayList<>();
        listaStrings.add("Java");
        listaStrings.add("C++");
        listaStrings.add("Python");
        for (String elemento : listaStrings) {
            System.out.println(elemento);
    }


        //Instancia animal
        Animal animal = new Cachorro("Bolt","Golden",4);
        ArrayList<Animal> listaAnimal = new ArrayList<>();

        for (Animal elemento : listaAnimal) {
            if(elemento instanceof Cachorro cachorro){
                cachorro.latir();
                System.out.println(cachorro.getNome());
            }else {
                System.out.println(elemento);
            }
        }


        //Instancia Verificação de Produto
        Produto produto1 = new Produto("Ar condicionado", 2000.0,1);
        Produto produto2 = new Produto("Aquecedor", 800.0,1);
        Produto produto3 = new Produto("Ventilador", 150.0,1);

        ArrayList<Produto> listaProdutos = new ArrayList<>();
        listaProdutos.add(produto1);
        listaProdutos.add(produto2);
        listaProdutos.add(produto3);

        double somaPrecos = 0;
        for (Produto produto : listaProdutos) {
            somaPrecos += produto.getPreco();
        }

        double precoMedio = somaPrecos / listaProdutos.size();
        System.out.println("Preço médio dos produtos: " + precoMedio);




    }
}
