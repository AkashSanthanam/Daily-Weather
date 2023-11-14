package components;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandler;
import java.net.http.HttpResponse.BodyHandlers;
import java.time.Duration;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class API {
    private final String API_KEY = "c67f2443fc194bee892221925231111";
    private final HttpClient CLIENT = HttpClient.newHttpClient(); 

    // Weather 
    public void get_weather(String _q) throws Exception{

        String url = "http://api.weatherapi.com/v1/current.json?key=" + API_KEY + "&q=" + _q + "&aqi=no"; 

        HttpRequest request = HttpRequest.newBuilder()
                              .GET()
                              .uri(new URI(url))
                              .timeout(Duration.ofSeconds(5))
                              .setHeader("Weather", "GET")
                              .build(); 



        HttpResponse <String> response = CLIENT.send(request, BodyHandlers.ofString()); 
         // Parse JSON string
        JsonElement jsonElement = JsonParser.parseString(response.body()); 
        
        // Convert JSON to a pretty-printed string
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String jsonOuput = gson.toJson(jsonElement);

        // Print the formatted JSON
        System.out.println(jsonOuput);

    }
    
    public static void main(String[] args) throws Exception{

            API test = new API();
            test.get_weather("London"); 
        
    }

}
