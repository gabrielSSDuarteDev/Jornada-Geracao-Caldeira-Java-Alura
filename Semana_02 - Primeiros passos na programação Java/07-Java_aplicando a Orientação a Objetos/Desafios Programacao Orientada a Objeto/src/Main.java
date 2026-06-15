public class Main {
    public static void main() {
        //Classe Pessoa
        Pessoa pessoa = new Pessoa();
        pessoa.saudacao();

        //Classe Aluno
        Aluno aluno = new Aluno();
        aluno.nome = "Gabriel";
        aluno.idade = 19;
        aluno.exibeInformacoes();

        //Classe Carro
        Carro car = new Carro();
        car.modelo = "Ford";
        car.ano = 2000;
        car.cor = "branco";
        car.exibeFichaTecnica();
        car.calculaIdade();


        //calculadora
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.dobrarNumero(5);
        System.out.println(resultado);


        //Musica
        Musica minhaMusica = new Musica();

        minhaMusica.titulo = "Nome da Música";
        minhaMusica.artista = "Nome do Artista";
        minhaMusica.anoLancamento = 2023;

        minhaMusica.exibeFichaTecnica();

        minhaMusica.avalia(4.5);
        minhaMusica.avalia(3.8);
        minhaMusica.avalia(5.0);

        double mediaAvaliacoes = minhaMusica.pegaMedia();
        System.out.println("Média das avaliações: " + mediaAvaliacoes);
    }

    }




