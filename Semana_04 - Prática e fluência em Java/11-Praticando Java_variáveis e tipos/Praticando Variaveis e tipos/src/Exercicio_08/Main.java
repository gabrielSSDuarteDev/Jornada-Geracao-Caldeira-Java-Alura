package Exercicio_08;

public class Main {

    public static void main(String[] args) {

        double valorReais = 451.50;
        double taxaCambio = 5.25;

        double valorDolares = valorReais / taxaCambio;

        System.out.println("O valor em dólares é: US$ " + valorDolares);
    }
}
