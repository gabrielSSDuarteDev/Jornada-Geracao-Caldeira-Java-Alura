package Exercicio_08;

import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int positivos = 0;
            int negativos = 0;

            while (true) {
                System.out.print("Digite um número (ou 'fim' para encerrar): ");
                String entrada = scanner.nextLine();

                if (entrada.equals("fim")) {
                    break;
                }

                int numero = Integer.parseInt(entrada);

                if (numero > 0) {
                    positivos++;
                } else if (numero < 0) {
                    negativos++;
                }
            }

            System.out.println("Números positivos: " + positivos);
            System.out.println("Números negativos: " + negativos);

            scanner.close();
        }
    }

