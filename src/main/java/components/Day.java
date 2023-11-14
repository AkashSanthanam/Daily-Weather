package components;

public class Day {
    private float avgtemp_c;
    private float avgtemp_f; 
    private float totalprecip_mm;
    private Condition condition; 


    public float get_avgtempc(){
        return this.avgtemp_c; 
    }

    public float get_avgtempf(){
        return this.avgtemp_f; 
    }


    public float get_totalprecipmm(){
        return this.totalprecip_mm; 
    }


    public Condition get_Condition(){
        return this.condition;
    }

    @Override
    public String toString(){
        return "avgtempc : " + this.avgtemp_c + "\n" + 
               "avgtempf : " + this.avgtemp_c + "\n" + 
               "totalprecipmm : " + this.avgtemp_c + "\n"; 
    }
}
