package br.com.alura.screenmatch;

import br.com.alura.screenmatch.service.ConsumoAPI;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		ConsumoAPI ombdAPI = new ConsumoAPI();
		var url= "https://www.omdbapi.com/?t=Rick+and+Morty&Season=1&apikey=e9080fa4";
		var saida = ombdAPI.obterDadosSeries(url);
		System.out.println(saida);
		url= "https://coffee.alexflipnote.dev/random.json";
		saida = ombdAPI.obterDadosSeries(url);
		System.out.println(saida);
	}
}
