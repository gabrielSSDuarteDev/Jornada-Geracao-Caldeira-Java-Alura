package ExerciciosModulo01;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class CriptoMoeda {

    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite as criptomoedas separadas por vírgula (ex: bitcoin,ethereum): ");
        String criptomoedas = scan.nextLine().toLowerCase().replace("","");
        System.out.println("Digite a moeda local a ser convertida (ex: usd,brl,eur,gbp): ");
        String moedaLocal = scan.nextLine().toLowerCase().replace("","");

        String apiKey = "CG-EykwSrCfLaWwstz77BsqJGhC";

        String endereco = "https://api.coingecko.com/api/v3/simple/price?vs_currencies=" + moedaLocal + "&ids=" +  criptomoedas + "&x_cg_demo_api_key=" + apiKey;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());




    }
}
