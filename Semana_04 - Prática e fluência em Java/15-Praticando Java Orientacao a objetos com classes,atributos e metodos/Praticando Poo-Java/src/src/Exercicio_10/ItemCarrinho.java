package src.Exercicio_10;

class ItemCarrinho {
    String nome;
    double preco;
    int quantidade;

    double calcularTotal() {
        return preco * quantidade;
    }
}
