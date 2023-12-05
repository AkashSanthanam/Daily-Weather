package components;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
// import java.net.http.HttpResponse.BodyHandler;
import java.net.http.HttpResponse.BodyHandlers;
import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
// import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class API {

    private final String API_KEY = "c67f2443fc194bee892221925231111";
    private final HttpClient CLIENT = HttpClient.newHttpClient(); 

    // Weather 
    public Weather get_weather(String _q) throws Exception{

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
        Gson gsonP = new GsonBuilder().setPrettyPrinting().create();
        String jsonOuput = gsonP.toJson(jsonElement);
        System.out.println(jsonOuput);
        
        // Storing Json into Java Object using Gson 
        Gson gson = new Gson();
        return gson.fromJson(response.body(), Weather.class); 
    }


    public Weather get_forecast(String _q) throws Exception{

        String url = "http://api.weatherapi.com/v1/forecast.json?key=" + API_KEY + "&q=" + _q + "&days=3&aqi=no&alerts=no"; 

        HttpRequest request = HttpRequest.newBuilder()
                              .GET()
                              .uri(new URI(url))
                              .timeout(Duration.ofSeconds(5))
                              .setHeader("Weather", "GET")
                              .build(); 



        HttpResponse <String> response = CLIENT.send(request, BodyHandlers.ofString()); 
         // Parse JSON string
        // JsonElement jsonElement = JsonParser.parseString(response.body()); 

        // Convert JSON to a pretty-printed string
        // Gson gsonP = new GsonBuilder().setPrettyPrinting().create();
        // String jsonOuput = gsonP.toJson(jsonElement);
        // System.out.println(jsonOuput);
        
        // Storing Json into Java Object using Gson 
        Gson gson = new Gson();
        return gson.fromJson(response.body(), Weather.class); 
    }

     
    
    public static void main(String[] args) throws Exception{

            API test = new API();
            Weather weatherData = test.get_weather("Toronto");
            Weather forecastData = test.get_forecast("Toronto"); 
            System.out.println("Forecast Day 1# Hours " + forecastData.get_Forecast().get_ForecastDays().get(0).get_Hours());
            System.out.println("Hour 1# " + forecastData.get_Forecast().get_ForecastDays().get(0).get_Hours().get(24));
            System.out.println(weatherData.get_location().get_localtime());


   
        
    }

}
