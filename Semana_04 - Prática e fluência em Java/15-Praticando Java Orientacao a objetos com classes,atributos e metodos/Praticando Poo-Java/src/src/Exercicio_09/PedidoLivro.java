package src.Exercicio_09;

class PedidoLivro {
    String titulo;
    int diasAtraso;

    double calcularMulta() {
        return diasAtraso * 2.50;
    }

    void exibirDetalhes() {
        double multa = calcularMulta();
        System.out.printf("Livro: %s | Multa por %d dias de atraso: R$ %.2f%n",
                titulo, diasAtraso, multa);
    }

}
