package Exercicio_04;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o numero que você quer descobrir o fatorial: ");
        int numFatorial = input.nextInt();
        int total = 1;
        for (int i = 1; i <= numFatorial; i++) {
          total *= i;
        }
        System.out.printf("O fatorial de %d é: %d", numFatorial,total);
    }
}
