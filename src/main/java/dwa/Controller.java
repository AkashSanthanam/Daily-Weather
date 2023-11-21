package dwa;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.InputEvent;
import javafx.scene.input.InputMethodEvent;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;


public class Controller implements Initializable {

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
    private ImageView refereshLogo;

    @FXML
    private Button refreshBtn;

    @FXML
    private Button searchBtn;

    @FXML
    private ImageView searchLogo;

    @FXML
    private ImageView sunLogo;

    @FXML
    private TextField tSearch;

    @FXML
    private VBox tempHourEight;

    @FXML
    private VBox tempHourEleven;

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
    private VBox tempHourTwelve;

    @FXML
    private Text tempHourTwo;

    @FXML
    private Text tempTxt;

    @FXML
    private Text uvTxt;

    @FXML
    private Text vTempHourEight;

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
    void enterKeyHit(KeyEvent event) {
    
    }

    @FXML
    void handleButtonClicks(ActionEvent event) {
        
    }

    @FXML
    void searchTextChanged(KeyEvent event) {
        if (event instanceof KeyEvent) {
            KeyEvent keyEvent = (KeyEvent) event;
            if (keyEvent.getCode() == KeyCode.ENTER && tSearch.isFocused()) {
                // Enter key is pressed, cursor is in the text field, and text was modified
                String searchText = tSearch.getText();
                
                // Now you can use the 'searchText' variable as needed
                System.out.println(searchText);

                // Add your logic to handle the retrieved text here
            }
        }
    }


    // @FXML
    // void searchTextChanged(InputEvent event) {
        
    // }

    @FXML
    void searchTextMenu(MouseEvent event) {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // TODO Auto-generated method stub
        
    }

}


