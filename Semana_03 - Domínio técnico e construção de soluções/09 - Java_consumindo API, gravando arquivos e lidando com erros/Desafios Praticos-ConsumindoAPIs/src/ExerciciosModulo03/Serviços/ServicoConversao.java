package ExerciciosModulo03.Serviços;

import ExerciciosModulo03.Execoes.FalhaComunicaoAPI;
import ExerciciosModulo03.Modelos.CambioRecord;
import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ServicoConversao {



    public CambioRecord buscarCambio() throws IOException, FalhaComunicaoAPI, InterruptedException {
        String url = "https://open.er-api.com/v6/latest/USD";


        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();

        try{
            HttpResponse response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            String resposta =  response.body().toString();

            if (resposta.isEmpty() || resposta.equals("null")) {
                throw new FalhaComunicaoAPI("A conversão está vazia: [ERRO]");
            }
            Gson gson = new Gson();
            return gson.fromJson(resposta, CambioRecord.class);


        }
        catch (IOException | InterruptedException e){
            throw new FalhaComunicaoAPI("A conexão falhou: [ERRO]");
        }
    }






}
