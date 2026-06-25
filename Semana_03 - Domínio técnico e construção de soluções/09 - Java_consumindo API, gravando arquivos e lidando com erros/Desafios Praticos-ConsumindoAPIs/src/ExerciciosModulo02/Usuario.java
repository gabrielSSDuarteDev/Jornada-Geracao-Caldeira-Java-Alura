package ExerciciosModulo02;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Usuario {

    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Digite o numero do ID do Usuário:  " );
        int id = sc.nextInt();



        String endereco = "https://jsonplaceholder.typicode.com/users/" + id;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        Gson gson = new Gson();
        UsuarioDTO usuario = gson.fromJson(response.body(), UsuarioDTO.class);
        System.out.println(usuario);


    }
}
