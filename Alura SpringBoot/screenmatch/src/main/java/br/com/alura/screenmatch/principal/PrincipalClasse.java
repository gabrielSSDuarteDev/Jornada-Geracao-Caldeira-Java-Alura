package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.model.DadosEpisode;
import br.com.alura.screenmatch.model.DadosSerie;
import br.com.alura.screenmatch.model.DadosTemporada;
import br.com.alura.screenmatch.model.Episodio;
import br.com.alura.screenmatch.service.ConsumoAPI;
import br.com.alura.screenmatch.service.ConverteDados;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class PrincipalClasse {
    private Scanner sc = new Scanner(System.in);
    private ConsumoAPI consumoAPI = new ConsumoAPI();
    private ConverteDados converteDados = new ConverteDados();

    private final String ENDERECO = "https://www.omdbapi.com/?t=";
    private final String APIKEY = "&apikey=e9080fa4";

    public void exibeMenu() throws IOException, InterruptedException {
         System.out.println("Digite o nome da série para busca: ");
         var nomeSerie = sc.nextLine();
         var enderecoCompleto = ENDERECO+nomeSerie.replace(" ","+")+APIKEY;
         var json = consumoAPI.obterDadosSeries(enderecoCompleto);
         DadosSerie dados = converteDados.obterDados(json, DadosSerie.class);
         System.out.println(dados);


        List<DadosTemporada> temporadas = new ArrayList<>();

        for (int i = 1 ; i <= dados.totalTemporada(); i++){
            json = consumoAPI.obterDadosSeries(ENDERECO+nomeSerie.replace(" ","+")+"&Season="+i+APIKEY);
            DadosTemporada dadosTemporada = converteDados.obterDados(json, DadosTemporada.class);
            temporadas.add(dadosTemporada);
        }
       //temporadas.forEach(System.out::println);


       temporadas.forEach(t -> t.episodios().forEach(e -> System.out.println(e.titulo())));

       List<DadosEpisode> dadosEpisodes = temporadas.stream()
               .flatMap(t -> t.episodios().stream())
               .toList();
        System.out.println("\n Melhores 05 episodios: ");
       dadosEpisodes.stream()
               .filter(e -> !e.avaliacao().equalsIgnoreCase("N/A"))
               .sorted(Comparator.comparing(DadosEpisode::avaliacao).reversed())
               .limit(5)
              .forEach(System.out::println);


       List<Episodio> episodios = temporadas.stream()
               .flatMap(t-> t.episodios().stream()
                       .map(d -> new Episodio(t.numeroTemp(), d))
                       ).toList();

            episodios.forEach(System.out::println);



}






}
