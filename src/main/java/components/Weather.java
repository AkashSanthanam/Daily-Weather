package components;



public class Weather {

    private Current current; 
    private Location location; 
    private Forecast forecast; 
 
    public Current get_current(){
        return this.current; 
    }

    public Location get_location(){
        return this.location; 
    }

    public Forecast get_Forecast(){
        return this.forecast; 
    }
    
}
