package components;

public class Hour {
    private String time; 
    private float temp_c;
    private float temp_f;
    private float wind_kph;
    private int is_day; 
    private Condition condition; 
    private String wind_dir;
    private float feelslike_c;
    private float feelslike_f;


    public String get_time(){
        return this.time; 
    }

    public float get_tempc(){
        return this.temp_c;
    }

    public float get_tempf(){
        return this.temp_f;
    }

    public float get_windkph(){
        return this.wind_kph;
    }

    public int get_isday(){
        return this.is_day; 
    }

    public Condition get_condition(){
        return this.condition; 
    }

    public String get_winddir(){
        return this.wind_dir; 
    }

    public float get_feelslikec(){
        return this.feelslike_c;
    }

    public float get_feelslikef(){
        return this.feelslike_f;
    }

    @Override
    public String toString(){
        return "time: " + this.time + "\n" + 
               "temp_c: " + this.temp_c + "\n" + 
               "temp_f: " + this.temp_f + "\n" + 
               "wind_kph: " + this.wind_kph + "\n" + 
               "is_day: " + this.is_day + "\n" + 
               "condition: " + this.condition + "\n" + 
               "wind_dir: " + this.wind_dir + "\n" + 
               "feelslike_c: " + this.feelslike_c + "\n" + 
               "feelslike_f: " + this.feelslike_f + "\n";
    }
    
}
