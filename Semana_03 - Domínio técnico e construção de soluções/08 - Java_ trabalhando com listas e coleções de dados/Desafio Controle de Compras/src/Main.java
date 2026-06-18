import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Produto> carrinho = new LinkedList<>();
        int res = 0;
        boolean continuar = true;

        System.out.println("==========================================");
        System.out.println("           Cadastro de Compras            ");
        System.out.println("==========================================");
        System.out.print(" -----> Digite o limite do cartão para poder adicionar itens ao carrinho: ");
        double limiteDigitado = sc.nextDouble();
        sc.nextLine();


        CartaoCredito cartao = new CartaoCredito(limiteDigitado);

        while (continuar) {
            System.out.println("\nDigite o nome do produto: ");
            String nome = sc.nextLine();

            System.out.println("Digite o valor do produto: ");
            double valor = sc.nextDouble();
            sc.nextLine(); // Limpa o buffer do teclado

            Produto produto = new Produto(nome, valor);


            if (cartao.lancaCompra(produto)) {
                carrinho.add(produto);
                System.out.println("Produto adicionado com sucesso!");
            } else {
                System.out.println(" Limite insuficiente para este produto!");
            }

            System.out.println("\nDeseja continuar comprando? Digite 1 : Sim | Digite 0 : Não");
            res = sc.nextInt();
            sc.nextLine(); // Limpa o buffer do teclado

            if (res == 0) {
                continuar = false;
            }
            System.out.println("=============================================");
        }


        Collections.sort(carrinho);

        System.out.println("\n=== SEU CARRINHO DE COMPRAS (Ordenado por Preço) ===");
        for (Produto p : carrinho) {
            System.out.printf("- %s: R$ %.2f%n", p.getDescricao(), p.getPreco());
        }

        System.out.println("=============================================");
        System.out.printf("Total final da compra: R$ %.2f%n", cartao.getTotalFinalCompra());
        System.out.printf("Saldo restante no cartão: R$ %.2f%n", cartao.getSaldo());
        System.out.println("=============================================");

        sc.close();
    }
}