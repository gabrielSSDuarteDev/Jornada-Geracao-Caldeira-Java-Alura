package br.com.alura.screenmatch;

import br.com.alura.screenmatch.model.DadosEpisode;
import br.com.alura.screenmatch.model.DadosSerie;
import br.com.alura.screenmatch.model.DadosTemporada;
import br.com.alura.screenmatch.service.ConsumoAPI;
import br.com.alura.screenmatch.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		ConsumoAPI ombdAPI = new ConsumoAPI();
		var url = "https://www.omdbapi.com/?t=The+Flash&apikey=e9080fa4";
		var saida = ombdAPI.obterDadosSeries(url);
		//System.out.println(saida);

		//Dados Serie
		ConverteDados converteDados = new ConverteDados();
		DadosSerie dados = converteDados.obterDados(saida,DadosSerie.class);
		System.out.println(dados);

		//Dados Episodio
		url = "https://www.omdbapi.com/?t=The+Flash&Season=1&episode=1&apikey=e9080fa4";
		saida = ombdAPI.obterDadosSeries(url);
		DadosEpisode dadosEpisodio = converteDados.obterDados(saida,DadosEpisode.class);
		System.out.println(dadosEpisodio);


		//Dados Temporada
		List<DadosTemporada> temporadas = new ArrayList<>();
		for(int i = 1; i <= dados.totalTemporada(); i++) {
			url = "https://www.omdbapi.com/?t=The+Flash&Season="+ i +"&apikey=e9080fa4";
			saida = ombdAPI.obterDadosSeries(url);
			DadosTemporada dadosTemporada = converteDados.obterDados(saida,DadosTemporada.class);
			temporadas.add(dadosTemporada);
		}
		temporadas.forEach(System.out::println);

	}
}
