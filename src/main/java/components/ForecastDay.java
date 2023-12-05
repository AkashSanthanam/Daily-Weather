package components;


import java.util.ArrayList;

public class ForecastDay {
    private String date; 
    private Day day; 
    private ArrayList <Hour> hour = new ArrayList<>();;


    public String get_date(){
        return this.date; 
    }

    public Day get_day(){
        return this.day; 
    }

    public ArrayList <Hour> get_Hours(){
        return this.hour; 
    }

    @Override
    public String toString(){
        return "date : " +  this.date + "\n" +
               "day  : " + this.day + "\n" +
               "hour : " + this.hour + "\n"; 
    }
}
