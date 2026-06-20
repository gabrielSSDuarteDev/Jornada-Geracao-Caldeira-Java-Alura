package src.Exercicio_07;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Tarefa t1 = new Tarefa();
        t1.descricao = "Estudar Java";
        t1.concluida = false;

        Tarefa t2 = new Tarefa();
        t2.descricao = "Fazer exercícios";
        t2.concluida = true;

        List<Tarefa> lista = new ArrayList<>();
        lista.add(t1);
        lista.add(t2);

        for (Tarefa t : lista) {
            t.exibir();
        }
    }
}
