package Exercicio_01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de Degraus que carla deseja subir: ");
        int quantidade = sc.nextInt();

        for (int i = 1; i <= quantidade; i++) {
            System.out.println("Subindo o degrau: " + i);
        }
        System.out.println("Você chegou ao topo, Carla!! Parabéns! ");
    }




}
