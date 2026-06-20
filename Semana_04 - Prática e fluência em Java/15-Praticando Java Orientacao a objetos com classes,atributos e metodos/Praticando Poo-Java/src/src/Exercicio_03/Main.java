package src.Exercicio_03;

import java.time.Duration;
import java.time.LocalTime;

public class Main {
        public static void main(String[] args) {
          ContaBancaria Nu1 = new ContaBancaria("Gabriel", 5000.00);
          ContaBancaria Nu2 = new ContaBancaria("Yngrid", 2000.00);

          Nu1.exibirSaldo();
          Nu2.exibirSaldo();
          Nu2.zerarSaldo();
          Nu2.exibirSaldo();
          Nu1.depositar(2000.00);
          Nu2.depositar(5000.00);
          Nu1.depositar(5000.00);
          Nu1.exibirSaldo();
          Nu2.exibirSaldo();
        }
    }

