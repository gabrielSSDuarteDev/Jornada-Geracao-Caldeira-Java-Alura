package br.com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosEpisode(@JsonAlias("Title") String titulo
                          ,@JsonAlias("Episode") Integer numeroEp
                          ,@JsonAlias("imbRating") String avaliacao
                          ,@JsonAlias("")String dataLancamento) {
}
