package Exercicio_10;

public class Main {
    public static void main(String[] args) {

        double consumoMedio = 12.5;
        double capacidadeTanque = 50;
        double combustivelAtual = 20;
        double distanciaViagem = 200;

        double autonomiaMaxima = consumoMedio * capacidadeTanque;
        double autonomiaAtual = consumoMedio * combustivelAtual;

        System.out.printf("Autonomia máxima do veículo: %.1f km%n", autonomiaMaxima);
        System.out.printf("Autonomia atual: %.1f km%n", autonomiaAtual);

        if (autonomiaAtual >= distanciaViagem) {
            System.out.println("Você conseguirá completar a viagem sem precisar abastecer.");
        } else {
            System.out.println("Atenção! Você precisará abastecer antes de concluir a viagem.");
        }
    }
}
