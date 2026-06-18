package br.com.alura.desafio.modulo04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();
        numeros.add(4);
        numeros.add(6);
        numeros.add(2);
        numeros.add(9);
        numeros.add(0);
        numeros.add(1);
        numeros.add(3);
        numeros.add(8);
        System.out.println("Antes da Ordenação: " + numeros);
        Collections.sort(numeros);
        System.out.println("Depois da ordenação: " +  numeros);


        List<String> listaTitulos = new LinkedList<>();
        listaTitulos.add("Gabriel");
        listaTitulos.add("Lucas");
        listaTitulos.add("Yasmin");
        listaTitulos.add("Isabela");
        listaTitulos.add("Rodrigues");
        listaTitulos.add("Juanito");
        System.out.println("Antes da ordenação: " +  listaTitulos);
        Collections.sort(listaTitulos);
        System.out.println("Depois da Ordenação: " +   listaTitulos);


    }
}
