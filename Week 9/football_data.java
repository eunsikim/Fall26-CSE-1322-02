import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class football_data {
    public static void main(String[] args) {
        String HOST = "https://api.football-data.org";
        String API_KEY = "b0e0b22c38284c74a65c62724edbe981";
        String REQUEST_PATH = "/v4/matches";

        try{
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                                            .uri(URI.create(HOST + REQUEST_PATH))
                                            .header("X-Auth-Token", API_KEY)
                                            .GET()
                                            .build();

            HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
            System.out.println(response.statusCode());
            System.out.println(response.body());
        }
        catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
