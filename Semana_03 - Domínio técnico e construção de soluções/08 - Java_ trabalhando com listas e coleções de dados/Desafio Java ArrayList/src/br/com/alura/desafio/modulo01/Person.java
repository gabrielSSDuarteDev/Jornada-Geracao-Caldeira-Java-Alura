package br.com.alura.desafio.modulo01;

public class Person {
    private String nome;
    private int idade;
    private String sexo;
    private Double cpf;


    @Override
    public String toString() {

        return  "\n==============================="+
                "\nNome: " + this.getNome() +
                "\nIdade: " + this.getIdade() +
                "\nSexo: " +  this.getSexo() +
                "\nCPF: " + this.getCpf()+
                "\n===============================";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Double getCpf() {
        return cpf;
    }

    public void setCpf(Double cpf) {
        this.cpf = cpf;
    }
}
