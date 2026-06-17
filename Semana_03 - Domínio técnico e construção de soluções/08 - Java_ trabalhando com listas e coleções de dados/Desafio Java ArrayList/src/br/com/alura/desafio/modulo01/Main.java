package br.com.alura.desafio.modulo01;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Person pessoa = new Person();
        Person pessoa2 = new Person();
        Person pessoa3 = new Person();

        pessoa.setNome("Pedro");
        pessoa.setIdade(18);
        pessoa.setSexo("M");
        pessoa.setCpf(098.308);

        pessoa2.setNome("Maria");
        pessoa2.setIdade(18);
        pessoa2.setSexo("F");
        pessoa2.setCpf(098.309);

        pessoa3.setNome("Antonio");
        pessoa3.setSexo("M");
        pessoa3.setIdade(18);
        pessoa3.setCpf(098.3010);


        ArrayList<Person> pessoas = new ArrayList <Person>();
        pessoas.add(pessoa);
        pessoas.add(pessoa2);
        pessoas.add(pessoa3);
        pessoas.size();
        System.out.println(pessoas);
    }
}
