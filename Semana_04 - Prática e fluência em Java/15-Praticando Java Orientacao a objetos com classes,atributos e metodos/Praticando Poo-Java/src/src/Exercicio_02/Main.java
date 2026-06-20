package src.Exercicio_02;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
      Livro l1 = new Livro("O pequeno Principe","Jorge Muller", 350);
      Livro l2 = new Livro("Biblia","Jesus",1200);

      l1.exibirInformacoes();
      l2.exibirInformacoes();
    }
}
