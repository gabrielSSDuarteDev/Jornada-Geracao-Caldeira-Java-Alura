package Exercicio_01;


import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int number = sc.nextInt();
        if (number% 2 == 0) {
            System.out.println("O número " + number+ " é par.");
        } else {
            System.out.println("O número " + number+ " é ímpar.");
        }
    }
}
