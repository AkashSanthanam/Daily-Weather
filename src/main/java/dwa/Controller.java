package dwa;


import components.API;
import components.Weather;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
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
import javafx.scene.text.Font;
import javafx.scene.text.Text;



public class Controller implements Initializable {

    private Weather weatherData;
    
    @FXML
    private Text TempHourTen;

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
    private Text lowTempDayFive;

    @FXML
    private Text lowTempDayFour;

    @FXML
    private Text lowTempDayOne;

    @FXML
    private Text lowTempDaySix;

    @FXML
    private Text lowTempDayThree;

    @FXML
    private Text lowTempDayTwo;

    @FXML
    private Text maxTempDayFive;

    @FXML
    private Text maxTempDayFour;

    @FXML
    private Text maxTempDayOne;

    @FXML
    private Text maxTempDaySix;

    @FXML
    private Text maxTempDayThree;

    @FXML
    private Text maxTempDayTwo;

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
    private ImageView windLogo;

    @FXML
    private Text windTxt;


    

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
        System.out.println(searchText); 
        processSearch(searchText);
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
            processSearch(searchText);
        }
    }



    @FXML
    void searchTextChanged(KeyEvent event) throws Exception {
        if (event instanceof KeyEvent) {
            KeyEvent keyEvent = (KeyEvent) event;
            if (keyEvent.getCode() == KeyCode.ENTER && tSearch.isFocused()) {
                // Enter key is pressed, cursor is in the text field, and text was modified
                String searchText = tSearch.getText();
                
                // Now you can use the 'searchText' variable as needed
                System.out.println(searchText);
                processSearch(searchText);

                // Add your logic to handle the retrieved text here
            }
        }
    }

    @FXML 
    void handleButtonClicks(Button Event) {

    }


    @FXML
    void searchTextMenu(MouseEvent event) {

    }


    private void processSearch(String _q) throws Exception{
        API requestHandler = new API(); 
        this.weatherData = requestHandler.get_weather(_q); 
        UpdateWeather(); 
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
        

        if((int) this.weatherData.get_current().get_tempc() < 10){
            this.tempTxt.setWrappingWidth(37);
            this.celciusTxt.setX(0);
        }else if ((int) this.weatherData.get_current().get_tempc() >= 10){
            this.tempTxt.setWrappingWidth(67);
            this.celciusTxt.setX(this.celciusTxt.getX() + 30); 
        }

        System.out.println(this.celciusTxt.getX());
        
        this.tempTxt.setText(String.valueOf((int) this.weatherData.get_current().get_tempc()) );

        

        this.feelsLikeTxt.setText("Feels like " + String.valueOf((int) this.weatherData.get_current().get_feelslikec()) + " °C");

        this.precipitationTxt.setText("Precipitation: " + String.valueOf((int) this.weatherData.get_current().get_precipMM()) + "mm");

        this.humidityTxt.setText("Humidity: " + String.valueOf((int) this.weatherData.get_current().get_humidity()) + "%");

        this.uvTxt.setText("UV: " + String.valueOf((int) this.weatherData.get_current().get_uv()));

        this.windTxt.setText("Wind: " + String.valueOf((int) this.weatherData.get_current().get_windkph()) + "km/h");

        if(this.weatherData.get_current().get_tempc() > 25){
            // this.weatherLogo
        }

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


