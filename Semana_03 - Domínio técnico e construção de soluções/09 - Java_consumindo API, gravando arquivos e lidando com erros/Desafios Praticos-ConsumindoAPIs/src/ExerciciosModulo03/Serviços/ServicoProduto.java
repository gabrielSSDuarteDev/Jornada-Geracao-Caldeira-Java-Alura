package ExerciciosModulo03.Serviços;

import ExerciciosModulo03.Execoes.FalhaComunicaoAPI;
import ExerciciosModulo03.Execoes.ProdutoNaoEncontrado;
import ExerciciosModulo03.Modelos.ProdutosRecord;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ServicoProduto {


    public ProdutosRecord buscarProdutoId(int id) throws FalhaComunicaoAPI, IOException, InterruptedException  {
        String url = "https://fakestoreapi.com/products/" + id;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();

        try{
        HttpResponse response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        String jsonBody = response.body().toString();

         if (jsonBody.equals("null") || jsonBody.trim().isEmpty()) {
            throw new ProdutoNaoEncontrado("O produto com ID " + id + "não foi encontrado.");
         }
            Gson gson = new Gson();
            return gson.fromJson(jsonBody, ProdutosRecord.class);
        }catch(IOException | InterruptedException ex){
            System.out.println("[ERRO] -> A conexão Falhou");
            System.out.println(ex.getMessage());
        }


        return null;
    }












}
