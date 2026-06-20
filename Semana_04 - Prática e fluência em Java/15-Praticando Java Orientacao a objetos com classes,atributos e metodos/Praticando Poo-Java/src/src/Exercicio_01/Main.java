package src.Exercicio_01;


public class Main {
    public static void main(String[] args) {
       Produto produto1 = new Produto("Mouse",150.99,2);
       Produto produto2 = new Produto("Teclado",180.99,1);

      produto1.exibirInformacoes();
      produto2.exibirInformacoes();
    }
}
