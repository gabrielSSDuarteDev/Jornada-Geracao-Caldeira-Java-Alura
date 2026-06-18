package Exercicio_02;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Locale;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite a quantidade de notas do aluno: ");
        int number = sc.nextInt();
        Double soma = 0.0;
        List<Double> notasArray = new ArrayList<>();
        for ( int i = 0; i < number; i++) {
            System.out.println("Nota " + (i+1) + ":" );
            double nota =  sc.nextDouble();
             notasArray.add(nota);
             soma += nota;
        }

        Double media =  soma / number;

        System.out.println("\n--- Resultados ---");
        for(Double nota : notasArray) {
            System.out.printf("A nota do aluno foi: %.2f \n", nota);
        }

        System.out.printf("\nA media final do aluno foi: %.2f ", media);
        if (media >= 7.0) {
            System.out.println("\nO aluno teve média " + media + " e foi aprovado.");
        } else if (media >= 5.0) {
            System.out.println("\nO aluno teve média " + media + " e está de recuperação.");
        } else {
            System.out.println("\nO aluno teve média " + media + " e foi reprovado.");
        }

    }
}
