package Exercicio_05;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDate dataVencimentoOriginal = LocalDate.of(2025, 3, 20);
        int adiamentoMeses = 1;
        LocalDate novaDataVencimento = dataVencimentoOriginal.plusMonths(adiamentoMeses);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String dataFormatada = novaDataVencimento.format(formatter);

        System.out.println("Nova data de vencimento: " + dataFormatada);
    }

}
