package src.Exercicio_04;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
      Temperatura tempLocal = new Temperatura("Setor Bancario",33.4);
      Temperatura tempLocal2 = new Temperatura("Setor Comercial",39.6);

      tempLocal.exibirRealatorio();
      tempLocal2.exibirRealatorio();
    }
}
