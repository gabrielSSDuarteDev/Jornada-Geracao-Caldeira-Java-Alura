package Exercicio_03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Digite o número limite para a soma dos numeros pares: ");
         int limite = input.nextInt();
         int somaPares = 0;
         int numPares = 0;
         List<Integer> list = new ArrayList<>();
         List<Integer> list2 = new ArrayList<>();

         for (int i = 1; i <= limite; i++) {
            if(i % 2 ==0){
                numPares += i;
                list2.add(i);
                somaPares += i;
                list.add(somaPares);
            }
         }
         System.out.println("Os numeros pares que existem até o limite diigitado é:  " + list2);
         System.out.println("A soma fica: " + list );


     }

}
