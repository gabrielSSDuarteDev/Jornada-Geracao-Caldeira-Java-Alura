package Exercicio_05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da compra: ");
        double valorCompra = scanner.nextDouble();

        if (valorCompra >= 100.0) {
            double desconto = valorCompra * 0.10;
            double valorComDesconto = valorCompra - desconto;
            System.out.printf("Desconto de 10%% aplicado.\nNovo valor: R$ %.2f\n", valorComDesconto);
        } else {
            System.out.printf("Desconto não aplicado.\nValor total: R$ %.2f\n", valorCompra);
        }

        scanner.close();
    }
}
