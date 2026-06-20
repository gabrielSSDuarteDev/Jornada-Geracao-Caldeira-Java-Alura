package src.Exercicio_08;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        ItemEstoque item = new ItemEstoque();
        item.nome = "Camiseta";
        item.quantidade = 10;

        item.vender(3);
        item.vender(8);
    }
}
