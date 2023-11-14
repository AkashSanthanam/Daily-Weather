package dwa;


import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
// import javafx.event.ActionEvent;
// import javafx.event.EventHandler;
// import javafx.scene.Scene;
// import javafx.scene.control.Button;
// import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application {
    

    Button button; 
    
    public static void main(String[] args) {
        // Method from Application class
        // Sets up program as a JavaFX application 
         // Calls start 
        launch(args);
    }


    // Overriden as we are implementing it from Application class
    // Primary stage is the main window 
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Daily Weather");


        // Creating a button 
        button = new Button();
        button.setText("Click Me"); 
        

    }
}