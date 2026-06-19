package Exercicio_02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite quantos numeros você quer somar: ");
        int quantos = input.nextInt();
        int total= 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < quantos; i++) {
            System.out.println("Digite o numero que você quer somar: ");
             int numSomar = input.nextInt();
             list.add(numSomar);
              total += numSomar;
        }

        System.out.println("O total da soma dos numeros digitados é: " + total);
    }
}
