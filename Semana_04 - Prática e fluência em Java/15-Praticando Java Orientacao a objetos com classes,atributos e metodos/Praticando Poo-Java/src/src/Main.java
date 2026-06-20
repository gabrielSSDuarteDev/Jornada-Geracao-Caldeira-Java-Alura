package src;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        LocalDate data = LocalDate.now();
        LocalDate dataParcela = LocalDate.of(2025,6,13);
        LocalDate DataSgundaParcela = dataParcela.plusDays(2);
        LocalDate DataTerceiraParcela = DataSgundaParcela.plusMonths(1);
        System.out.println("Data de Compra: " + dataParcela);
        System.out.println("Data da primeira parcela: " +  DataSgundaParcela);
        System.out.println("Data da segunda parcela: " +  DataTerceiraParcela);


        if(dataParcela.isBefore(DataSgundaParcela)) {
            System.out.println("A primeira parcela foi emitida na data: " + dataParcela);
        }else if(dataParcela.isAfter(DataSgundaParcela)) {
            System.out.println("A primeira parcela foi emitida da data: " + DataSgundaParcela);
        }

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Data da primeira parcela: " +  DataSgundaParcela.format(formatter));


        ZonedDateTime dataCompra = ZonedDateTime.now();
        System.out.println("Data da compra no Brasil: " + dataCompra);
        ZonedDateTime dataCompraJapao = dataCompra.withZoneSameInstant(ZoneId.of("Asia/Tokyo"));
        System.out.println("Data da compra no Japão: " + dataCompraJapao);


        LocalTime inicioExpediente = LocalTime.of(3,0);
        LocalTime fimExpediente = LocalTime.of(17,23);
        Duration duracao = Duration.between(inicioExpediente, fimExpediente);
        System.out.printf("A duração total do tempo de estudo foi %d Horas e %d Minutos", duracao.toHours(),duracao.toMinutes());


        LocalDate dataDeChegada = LocalDate.parse("2026-11-12");
        LocalDate dataDeHoje = LocalDate.now();
        Period previsao = Period.between(dataDeHoje,dataDeChegada);
        int previsaoEmDias = (previsao.getMonths() * 31) +  previsao.getDays();
        System.out.println("\nA previsão de chegada do produto é igual a: " + previsao.getMonths() + " Meses e " + previsao.getDays() + " Dias");
        System.out.println("O total de dias até o o produto chegar é de: " + previsaoEmDias);
    }
}
