package Exercicio_09;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a sua idade: ");
        int idade = input.nextInt();
        String mensagem;
        if (idade >= 18) {
             idade = 17;
           mensagem = "Você é maior de idade.";
        } else {
             mensagem = "Você é menor de idade.";
        }

        System.out.println(mensagem);
    }
}
