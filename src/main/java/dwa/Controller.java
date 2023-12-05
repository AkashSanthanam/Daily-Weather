package dwa;


import components.API;
import components.Weather;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextField;
import javafx.scene.effect.BlurType;
import javafx.scene.effect.Glow;
import javafx.scene.effect.InnerShadow;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Shape;
import javafx.scene.text.Font;
import javafx.scene.text.Text;



public class Controller implements Initializable {

    private Weather weatherData;
    private Weather forecastData; 
    
    @FXML
    private Text tempHourTen;

    @FXML
    private Text currentConditionTxt; 

    @FXML
    private Text currentDateTxt;

    @FXML
    private Text currentMaxLowTemp;

    @FXML
    private Text dayFiveTxt;

    @FXML
    private Text dayFourTxt;

    @FXML
    private Text dayOneTxt;

    @FXML
    private HBox daySixTxt;

    @FXML
    private Text dayThreeTxt;

    @FXML
    private Text dayTwoTxt;

    @FXML
    private MenuButton favLocationsBtn;

    @FXML
    private ImageView favLogo;

    @FXML
    private Text feelsLikeTxt;

    @FXML
    private Text celciusTxt; 

    @FXML
    private Text hourEightTxt;

    @FXML
    private Text hourElevenTxt;

    @FXML
    private Text hourFiveTxt;

    @FXML
    private Text hourFourTxt;

    @FXML
    private Text hourNineTxt;

    @FXML
    private Text hourOneTxt;

    @FXML
    private Text hourSevenTxt;

    @FXML
    private Text hourSixTxt;

    @FXML
    private Text hourTenTxt;

    @FXML
    private Text hourThreeTxt;

    @FXML
    private Text hourTwelveTxt;

    @FXML
    private Text hourTwoTxt;

    @FXML
    private ImageView humLogo;

    @FXML
    private Text humidityTxt;

    @FXML
    private Text locationTxt;


    @FXML
    private Text avgTempDayFive;

    @FXML
    private Text avgTempDayFour;

    @FXML
    private Text avgTempDayOne;

    @FXML
    private Text avgTempDaySix;

    @FXML
    private Text avgTempDayThree;

    @FXML
    private Text avgTempDayTwo;

    @FXML
    private ImageView precipLogo;

    @FXML
    private Text precipitationTxt;

    @FXML
    private ImageView refreshLogo;

    @FXML
    private ImageView searchLogo;

    @FXML
    private ImageView sunLogo;

    @FXML
    private TextField tSearch;

    @FXML
    private Text tempHourEight;

    @FXML
    private VBox vTempHourEleven;

    @FXML
    private Text tempHourEleven;
    
    @FXML
    private Text tempHourFive;

    @FXML
    private Text tempHourFour;

    @FXML
    private Text tempHourNine;

    @FXML
    private Text tempHourOne;

    @FXML
    private Text tempHourSeven;

    @FXML
    private Text tempHourSix;

    @FXML
    private Text tempHourThree;

    @FXML
    private Text tempHourTwelve;

    @FXML
    private Text tempHourTwo;

    @FXML
    private Text tempTxt;

    @FXML
    private Text uvTxt;

    @FXML
    private VBox vTempHourEight;

    @FXML
    private VBox vTempHourFive;

    @FXML
    private VBox vTempHourFour;

    @FXML
    private VBox vTempHourNine;

    @FXML
    private VBox vTempHourOne;

    @FXML
    private VBox vTempHourSeven;

    @FXML
    private VBox vTempHourSix;

    @FXML
    private VBox vTempHourTen;

    @FXML
    private VBox vTempHourThree;

    @FXML
    private VBox vTempHourTwo;

    @FXML
    private VBox vTempHourTwelve;

    @FXML
    private ImageView weatherAppLogo;

    @FXML
    private Label weatherAppTxt;

    @FXML
    private ImageView weatherLogo;

    @FXML
    private ImageView weatherLogoDayFive;

    @FXML
    private ImageView weatherLogoDayFour;

    @FXML
    private ImageView weatherLogoDayOne;

    @FXML
    private ImageView weatherLogoDaySix;

    @FXML
    private ImageView weatherLogoDayThree;

    @FXML
    private ImageView weatherLogoDayTwo;

    @FXML
    private ImageView hourOneImg;

    @FXML
    private ImageView hourTwoImg;

    @FXML
    private ImageView hourThreeImg;

    @FXML
    private ImageView hourFourImg;

    @FXML
    private ImageView hourFiveImg;

    @FXML
    private ImageView hourSixImg;

    @FXML
    private ImageView hourSevenImg;

    @FXML
    private ImageView hourEightImg;

    @FXML
    private ImageView hourNineImg;

    @FXML
    private ImageView hourTenImg;

    @FXML
    private ImageView hourElevenImg;

    @FXML
    private ImageView hourTwelveImg;


    @FXML
    private ImageView windLogo;

    @FXML
    private Text windTxt;

    @FXML
    private Shape Circle1; 

    @FXML
    private Shape Circle2;
    
    @FXML
    private Shape Circle3; 

    @FXML
    private Shape Circle4;

    @FXML
    private Shape Circle5;
    
    @FXML
    private Shape Circle6;

    @FXML
    private Shape Circle7;

    @FXML
    private Shape Circle8;

    @FXML
    private Shape Circle9;

    @FXML
    private Shape Circle10;

    @FXML
    private Shape Circle11;

    @FXML
    private Shape Circle12;




    

    @FXML
    void handleSearchLogoMouseEntered(MouseEvent event) {
        searchLogo.setOpacity(0.9);
        searchLogo.setEffect(new InnerShadow(BlurType.GAUSSIAN, Color.web("#5BA2F3"), 10, 0, 0, 0));
    }

    @FXML
    void handleSearchLogoMouseExited(MouseEvent event) {
        searchLogo.setOpacity(0.8);
        searchLogo.setEffect(new Glow()); // Remove the effect on exit
        
    }

    @FXML
    void handleSearchLogoMousePressed(MouseEvent event) throws Exception {
        String searchText = tSearch.getText(); 
        try{
            processSearch(searchText);
        }catch(Exception e){
            showAlert(Alert.AlertType.ERROR, "Invalid Location", "Please enter a valid location.");
        }
        
        searchLogo.setOpacity(0.6);
    }

    @FXML
    void handleRefreshLogoMouseEntered(MouseEvent event) {
        refreshLogo.setOpacity(0.9);
        refreshLogo.setEffect(new InnerShadow(BlurType.GAUSSIAN, Color.web("#5BA2F3"), 10, 0, 0, 0));
    }

    @FXML
    void handleRefreshLogoMouseExited(MouseEvent event) {
        refreshLogo.setOpacity(0.8);
        refreshLogo.setEffect(new Glow()); // Remove the effect on exit
        
    }

    @FXML
    void handleRefreshLogoMousePressed(MouseEvent event) throws Exception {
        if(tSearch.getText() != null){
            String searchText = tSearch.getText(); 

            try{
                processSearch(searchText);
            }catch (Exception e){
                showAlert(Alert.AlertType.ERROR, "Invalid Location", "Please enter a valid location.");
            }
            
        }
    }



    @FXML
    void searchTextChanged(KeyEvent event) throws Exception {
        if (event instanceof KeyEvent) {
            KeyEvent keyEvent = (KeyEvent) event;
            if (keyEvent.getCode() == KeyCode.ENTER && tSearch.isFocused()) {
                // Enter key is pressed, cursor is in the text field, and text was modified
                String searchText = tSearch.getText();

                try{
                    processSearch(searchText);
                }catch (Exception e){
                    // Exception logic goes here
                    showAlert(Alert.AlertType.ERROR, "Invalid Location", "Please enter a valid location.");
                }
            }
        }
    }




  


    @FXML 
    void handleButtonClicks(Button Event) {

    }


    @FXML
    void searchTextMenu(MouseEvent event) {

    }


    private void showAlert(Alert.AlertType alertType, String title, String content) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }


    private void processSearch(String _q) throws Exception{
        API requestHandler = new API(); 
        this.weatherData = requestHandler.get_weather(_q); 
        this.forecastData = requestHandler.get_forecast(_q);
        UpdateWeather(); 
        UpdateForecast();
    }

    private void UpdateWeather(){
        
 
        
        try{
            this.currentDateTxt.setText(new SimpleDateFormat("MMMM dd").format(new SimpleDateFormat("yyyy-MM-dd HH:mm").parse(this.weatherData.get_location().get_localtime())));
        }catch(ParseException e){
            e.printStackTrace();
        }

        this.currentConditionTxt.setText(this.weatherData.get_current().get_condition().get_text());

        this.locationTxt.setText(this.weatherData.get_location().get_name() + ", " + this.weatherData.get_location().get_country());

        // boolean check = false; 
        

        if(String.valueOf((int) this.weatherData.get_current().get_tempc()).length() == 1){
            this.tempTxt.setWrappingWidth(37);
            this.celciusTxt.setX(0);
        }else if(String.valueOf((int) this.weatherData.get_current().get_tempc()).length() == 2){
            this.tempTxt.setWrappingWidth(67);
            this.celciusTxt.setX(30); 
        }else if (String.valueOf((int) this.weatherData.get_current().get_tempc()).length() == 3){
            this.tempTxt.setWrappingWidth(95);
            this.celciusTxt.setX(49);
        }   

        
        this.tempTxt.setText(String.valueOf((int) this.weatherData.get_current().get_tempc()) );

        

        this.feelsLikeTxt.setText("Feels like " + String.valueOf((int) this.weatherData.get_current().get_feelslikec()) + " °C");

        this.precipitationTxt.setText("Precipitation: " + String.valueOf((int) this.weatherData.get_current().get_precipMM()) + "mm");

        this.humidityTxt.setText("Humidity: " + String.valueOf((int) this.weatherData.get_current().get_humidity()) + "%");

        this.uvTxt.setText("UV: " + String.valueOf((int) this.weatherData.get_current().get_uv()));

        this.windTxt.setText("Wind: " + String.valueOf((int) this.weatherData.get_current().get_windkph()) + "km/h");

        updateImages(this.weatherLogo, this.weatherData.get_current().get_condition().get_text());    

    }


    private void updateImages(ImageView img, String condition){
        if(condition.toLowerCase().contains("clear") || condition.toLowerCase().contains("sunny")){
            img.setImage(new javafx.scene.image.Image("dwa/resources/icons/sunny.png"));
        }else if(condition.toLowerCase().contains("cloudy") || condition.toLowerCase().contains("overcast")){
            img.setImage(new javafx.scene.image.Image("dwa/resources/icons/cloudy.png"));
        }else if(condition.toLowerCase().contains("rain")){
            img.setImage(new javafx.scene.image.Image("dwa/resources/icons/raining.png"));
        }else if(condition.toLowerCase().contains("snow")){
            img.setImage(new javafx.scene.image.Image("dwa/resources/icons/snowing.png"));
        }else if(condition.toLowerCase().contains("thunder")){
            img.setImage(new javafx.scene.image.Image("dwa/resources/icons/rainwithlightning.png"));
        }else if(condition.toLowerCase().contains("fog") || condition.toLowerCase().contains("mist")){
            img.setImage(new javafx.scene.image.Image("dwa/resources/icons/Fog.png"));
        }       
    }


    private void UpdateForecast(){
        
        ArrayList <Text> hoursTexts = new ArrayList<Text>();
        hoursTexts.add(this.tempHourOne);
        hoursTexts.add(this.tempHourTwo);
        hoursTexts.add(this.tempHourThree);
        hoursTexts.add(this.tempHourFour);
        hoursTexts.add(this.tempHourFive);
        hoursTexts.add(this.tempHourSix);
        hoursTexts.add(this.tempHourSeven);
        hoursTexts.add(this.tempHourEight);
        hoursTexts.add(this.tempHourNine);
        hoursTexts.add(this.tempHourTen);
        hoursTexts.add(this.tempHourEleven);
        hoursTexts.add(this.tempHourTwelve);

        ArrayList <Text> hourTimes = new ArrayList<Text>();
        hourTimes.add(this.hourOneTxt);
        hourTimes.add(this.hourTwoTxt);
        hourTimes.add(this.hourThreeTxt);
        hourTimes.add(this.hourFourTxt);
        hourTimes.add(this.hourFiveTxt);
        hourTimes.add(this.hourSixTxt);
        hourTimes.add(this.hourSevenTxt);
        hourTimes.add(this.hourEightTxt);
        hourTimes.add(this.hourNineTxt);
        hourTimes.add(this.hourTenTxt);
        hourTimes.add(this.hourElevenTxt);
        hourTimes.add(this.hourTwelveTxt);


        ArrayList <ImageView> hourImages = new ArrayList<>();
        hourImages.add(this.hourOneImg);
        hourImages.add(this.hourTwoImg);
        hourImages.add(this.hourThreeImg);
        hourImages.add(this.hourFourImg);
        hourImages.add(this.hourFiveImg);
        hourImages.add(this.hourSixImg);
        hourImages.add(this.hourSevenImg);
        hourImages.add(this.hourEightImg);
        hourImages.add(this.hourNineImg);
        hourImages.add(this.hourTenImg);
        hourImages.add(this.hourElevenImg);
        hourImages.add(this.hourTwelveImg);

        ArrayList <Text> dayTemps = new ArrayList<Text>();
        dayTemps.add(this.avgTempDayOne);
        dayTemps.add(this.avgTempDayTwo);
        dayTemps.add(this.avgTempDayThree);
        dayTemps.add(this.avgTempDayFour);
        dayTemps.add(this.avgTempDayFive);
        dayTemps.add(this.avgTempDaySix);


        ArrayList <ImageView> dayImages = new ArrayList<>();
        dayImages.add(this.weatherLogoDayOne);
        dayImages.add(this.weatherLogoDayTwo);
        dayImages.add(this.weatherLogoDayThree);
        dayImages.add(this.weatherLogoDayFour);
        dayImages.add(this.weatherLogoDayFive);
        dayImages.add(this.weatherLogoDaySix);



        ArrayList <Shape> circles = new ArrayList<>();
        circles.add(this.Circle1);
        circles.add(this.Circle2);
        circles.add(this.Circle3);
        circles.add(this.Circle4);
        circles.add(this.Circle5);
        circles.add(this.Circle6);
        circles.add(this.Circle7);
        circles.add(this.Circle8);
        circles.add(this.Circle9);
        circles.add(this.Circle10);
        circles.add(this.Circle11);
        circles.add(this.Circle12);


        
        // Hours
        int startHour = 0; 

        if(this.weatherData.get_location().get_localtime().contains("00:")){
            startHour = 0; 
        }else if(this.weatherData.get_location().get_localtime().contains("01:")){
            startHour = 1; 
        }else if(this.weatherData.get_location().get_localtime().contains("02:")){
            startHour = 2;
        }else if(this.weatherData.get_location().get_localtime().contains("03:")){
            startHour = 3;
        }else if(this.weatherData.get_location().get_localtime().contains("04:")){
            startHour = 4;
        }else if(this.weatherData.get_location().get_localtime().contains("05:")){
            startHour = 5;
        }else if(this.weatherData.get_location().get_localtime().contains("06:")){
            startHour = 6;
        }else if(this.weatherData.get_location().get_localtime().contains("07:")){
            startHour = 7;
        }else if(this.weatherData.get_location().get_localtime().contains("08:")){
            startHour = 8;
        }else if(this.weatherData.get_location().get_localtime().contains("09:")){
            startHour = 9;
        }else if(this.weatherData.get_location().get_localtime().contains("10:")){
            startHour = 10;
        }else if(this.weatherData.get_location().get_localtime().contains("11:")){
            startHour = 11;
        }else if(this.weatherData.get_location().get_localtime().contains("12:")){
            startHour = 12;
        }else if(this.weatherData.get_location().get_localtime().contains("13:")){
            startHour = 13;
        }else if(this.weatherData.get_location().get_localtime().contains("14:")){
            startHour = 14;
        }else if(this.weatherData.get_location().get_localtime().contains("15:")){
            startHour = 15;
        }else if(this.weatherData.get_location().get_localtime().contains("16:")){
            startHour = 16;
        }else if(this.weatherData.get_location().get_localtime().contains("17:")){
            startHour = 17;
        }else if(this.weatherData.get_location().get_localtime().contains("18:")){
            startHour = 18;
        }else if(this.weatherData.get_location().get_localtime().contains("19:")){
            startHour = 19;
        }else if(this.weatherData.get_location().get_localtime().contains("20:")){
            startHour = 20;
        }else if(this.weatherData.get_location().get_localtime().contains("21:")){
            startHour = 21;
        }else if(this.weatherData.get_location().get_localtime().contains("22:")){
            startHour = 22;
        }else if(this.weatherData.get_location().get_localtime().contains("23:")){
            startHour = 23;
        }


        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("hh:mm a");
        int nextHour = 0; 
        int x = 20; 

        for(int i = 0; i < 12; i++){

            String time; 
            LocalDateTime dateTime; 
            
            

            if(startHour > 23){

                if (nextHour == 0){
                    if((int) this.forecastData.get_Forecast().get_ForecastDays().get(1).get_Hours().get(nextHour).get_tempc() > (int) this.forecastData.get_Forecast().get_ForecastDays().get(0).get_Hours().get(23).get_tempc()){
                        if(x != 10){
                           x -= 5;     
                        }
                         
                        circles.get(i).setTranslateY(x);  
                    }else if((int) this.forecastData.get_Forecast().get_ForecastDays().get(1).get_Hours().get(nextHour).get_tempc() < (int) this.forecastData.get_Forecast().get_ForecastDays().get(0).get_Hours().get(23).get_tempc()){
                        if(x != 30){
                            x += 5; 
                        }
                        circles.get(i).setTranslateY(x);
                    }
                }else{
                    if((int) this.forecastData.get_Forecast().get_ForecastDays().get(1).get_Hours().get(nextHour).get_tempc() > (int) this.forecastData.get_Forecast().get_ForecastDays().get(1).get_Hours().get(nextHour - 1).get_tempc()){
                        if(x != 10){
                           x -= 5;     
                        }
                         
                        circles.get(i).setTranslateY(x);  
                    }else if((int) this.forecastData.get_Forecast().get_ForecastDays().get(1).get_Hours().get(nextHour).get_tempc() < (int) this.forecastData.get_Forecast().get_ForecastDays().get(1).get_Hours().get(nextHour - 1).get_tempc()){
                        if(x != 30){
                            x += 5; 
                        }
                        circles.get(i).setTranslateY(x);
                    }
                        
                }

                time = this.forecastData.get_Forecast().get_ForecastDays().get(1).get_Hours().get(nextHour).get_time();
                dateTime = LocalDateTime.parse(time, inputFormatter);
                hourTimes.get(i).setText(dateTime.format(outputFormatter));
                hoursTexts.get(i).setText(String.valueOf((int) this.forecastData.get_Forecast().get_ForecastDays().get(1).get_Hours().get(nextHour).get_tempc()) + "°C");
                nextHour += 1;
                updateImages(hourImages.get(i), this.forecastData.get_Forecast().get_ForecastDays().get(1).get_Hours().get(nextHour).get_condition().get_text());
                
            }else{
                
                hoursTexts.get(i).setText(String.valueOf((int) this.forecastData.get_Forecast().get_ForecastDays().get(0).get_Hours().get(startHour).get_tempc()) + "°C");
                time = this.forecastData.get_Forecast().get_ForecastDays().get(0).get_Hours().get(startHour).get_time();
                dateTime = LocalDateTime.parse(time, inputFormatter);
                hourTimes.get(i).setText(dateTime.format(outputFormatter));
                updateImages(hourImages.get(i), this.forecastData.get_Forecast().get_ForecastDays().get(0).get_Hours().get(startHour).get_condition().get_text());
                startHour += 1; 

                if (startHour < 23){
                    if((int) this.forecastData.get_Forecast().get_ForecastDays().get(0).get_Hours().get(startHour).get_tempc() > (int) this.forecastData.get_Forecast().get_ForecastDays().get(0).get_Hours().get(startHour - 1).get_tempc()){
                        if(x != 30){
                            x += 5; 
                        }
                        circles.get(i).setTranslateY(x);
                    }else if((int) this.forecastData.get_Forecast().get_ForecastDays().get(0).get_Hours().get(startHour).get_tempc() < (int) this.forecastData.get_Forecast().get_ForecastDays().get(0).get_Hours().get(startHour - 1).get_tempc()){


                         if(x != 10){
                            x -= 5;     
                        }
                        circles.get(i).setTranslateY(x); 
                    }
                }
            }
        
        }


        for(int i = 0; i < 3; i++){
            dayTemps.get(i).setText(String.valueOf((int) this.forecastData.get_Forecast().get_ForecastDays().get(i).get_day().get_avgtempc()) + "°C");
            updateImages(dayImages.get(i), this.forecastData.get_Forecast().get_ForecastDays().get(i).get_day().get_condition().get_text());
        }

        this.currentMaxLowTemp.setText( "Highs to " + String.valueOf((int) this.forecastData.get_Forecast().get_ForecastDays().get(0).get_day().get_maxtempc()) + "°C and lows to " + String.valueOf((int) this.forecastData.get_Forecast().get_ForecastDays().get(0).get_day().get_mintempc()) + "°C");



    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // TODO Auto-generated method stub
    
        searchLogo.setOnMouseEntered(this::handleSearchLogoMouseEntered);
        searchLogo.setOnMouseExited(this::handleSearchLogoMouseExited);
        searchLogo.setOnMousePressed(event -> {
            try {
                handleSearchLogoMousePressed(event);
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        });

        refreshLogo.setOnMouseEntered(this::handleRefreshLogoMouseEntered);
        refreshLogo.setOnMouseExited(this::handleRefreshLogoMouseExited);
        refreshLogo.setOnMousePressed(event -> {
            try {
                handleRefreshLogoMousePressed(event);
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        });

      
    }

}


