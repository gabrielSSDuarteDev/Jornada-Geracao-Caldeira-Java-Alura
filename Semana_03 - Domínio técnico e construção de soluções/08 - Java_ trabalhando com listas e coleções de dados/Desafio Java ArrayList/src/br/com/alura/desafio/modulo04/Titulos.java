package br.com.alura.desafio.modulo04;

public class Titulos {
    private String nome;

    public Titulos(String nome) {
        this.nome = nome;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public int compareTo(Titulos subTitulo) {
        return  this.getNome().compareTo(subTitulo.getNome());
    }
}
