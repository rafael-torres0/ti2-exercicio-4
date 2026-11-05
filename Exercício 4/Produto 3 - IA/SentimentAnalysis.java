
package app;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.Duration;

public class SentimentAnalysis {

    private static final String ENDPOINT =
        "https://language-ti2-rafa26.cognitiveservices.azure.com/";

    public static void main(String[] args) {
        String apiKey = System.getenv("AZURE_LANGUAGE_KEY");

        if (apiKey == null || apiKey.isBlank()) {
            System.out.println("Erro: chave de API não configurada.");
            return;
        }

        String json = """
            {
              "kind": "SentimentAnalysis",
              "parameters": {
                "modelVersion": "latest"
              },
              "analysisInput": {
                "documents": [
                  {
                    "id": "1",
                    "language": "pt",
                    "text": "Eu adorei esse jogo, foi uma experiência incrível!"
                  }
                ]
              }
            }
            """;

        try {
            HttpClient client = HttpClient.newHttpClient();

            HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(ENDPOINT +
                    "language/:analyze-text?api-version=2024-11-01"))
                .timeout(Duration.ofSeconds(30))
                .header("Ocp-Apim-Subscription-Key", apiKey)
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(
                    json, StandardCharsets.UTF_8))
                .build();

            HttpResponse<String> response = client.send(
                request,
                HttpResponse.BodyHandlers.ofString()
            );

            System.out.println("Status HTTP: " + response.statusCode());
            System.out.println("Resposta da IA:");
            System.out.println(response.body());

        } catch (Exception e) {
            System.out.println("Erro na requisição: " + e.getMessage());
        }
    }
}
