package br.com.alura.desafio.modulo03;

public class Cachorro extends Animal{
    private String cor;
    private String tamanho;


    public Cachorro(String nome, String raca, int idade) {
        super(nome, raca, idade);
        this.cor = nome;
        this.tamanho = raca;
    }

    public void latir(){
        System.out.println("Latindo....Au...AU...Au");
    }

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getTamanho() {
        return tamanho;
    }
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

}
