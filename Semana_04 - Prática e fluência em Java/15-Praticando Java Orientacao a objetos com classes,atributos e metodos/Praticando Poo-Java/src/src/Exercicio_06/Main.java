package src.Exercicio_06;


public class Main {
    public static void main(String[] args) {
        Colaborador colaborador = new Colaborador();
        colaborador.nome = "Júlia Oliveira";
        colaborador.cargo = "Desenvolvedor Júnior";
        colaborador.nivelAcesso = 1;

        colaborador.atualizarDados("Desenvolvedor Pleno", 2);
    }
}
