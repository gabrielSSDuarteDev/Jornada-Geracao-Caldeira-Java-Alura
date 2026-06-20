package src.Exercicio_08;

class ItemEstoque {
    String nome;
    int quantidade;

    void vender(int qtdVendida) {
        if (qtdVendida <= quantidade) {
            quantidade -= qtdVendida;
            System.out.printf("Venda realizada. Estoque restante de %s: %d%n", nome, quantidade);
        } else {
            System.out.println("Estoque insuficiente");
        }
    }
}
