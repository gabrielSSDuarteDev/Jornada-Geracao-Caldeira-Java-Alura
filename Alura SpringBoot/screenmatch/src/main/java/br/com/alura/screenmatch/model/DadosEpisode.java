package br.com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosEpisode(@JsonAlias("Title") String titulo
                          ,@JsonAlias("Episode") Integer numeroEp
                          ,@JsonAlias("Rating") String avaliacao
                          ,@JsonAlias("Released")String dataLancamento
                          ,@JsonAlias("Runtime")String duaracao  ) {
}
