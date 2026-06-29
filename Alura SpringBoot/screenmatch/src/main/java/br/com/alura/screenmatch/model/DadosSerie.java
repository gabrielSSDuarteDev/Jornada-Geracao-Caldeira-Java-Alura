package br.com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;




public record DadosSerie(@JsonAlias("Title") String titulo,
                         @JsonAlias("imdbRating") String avaliacao ,
                         @JsonAlias("totalSeasons") Integer totalTemporada) {
}
