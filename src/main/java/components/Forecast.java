package components;

import java.util.ArrayList;

public class Forecast {
    private ArrayList <ForecastDay> forecastday = new ArrayList<>(); 
    

    public ArrayList <ForecastDay> get_ForecastDays(){
        return this.forecastday; 
    }

    @Override
    public String toString(){
        return "Forecast Day(s) : " + this.forecastday; 
    }
}
