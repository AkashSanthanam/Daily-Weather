package components;

public class Current {
    
    private float temp_c;
    private float temp_f;
    private float wind_kph;
    private int is_day; 
    private Condition condition; 
    private String wind_dir;
    private float feelslike_c;
    private float feelslike_f;
    private float precip_mm; 
    private float uv; 
    private float humidity; 


    public float get_precipMM(){
        return this.precip_mm; 
    }

    public float get_uv(){
        return this.uv; 
    }

    public float get_humidity(){
        return this.humidity; 
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
}
