package dwa;


import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
// import javafx.event.ActionEvent;
// import javafx.event.EventHandler;
// import javafx.scene.Scene;
// import javafx.scene.control.Button;
// import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class App extends Application {
    

    double x, y = 0; 
    
    public static void main(String[] args) {
        // Method from Application class
        // Sets up program as a JavaFX application 
        // Calls start()
        launch(args);
    }


    // Overriden as we are implementing it from Application class
    // Primary stage is the main window 
    @Override
    public void start(Stage primaryStage) throws Exception {


        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("resources/gui_template.fxml"));
        Parent root = fxmlLoader.load();

        // Parent root = FXMLLoader.load(getClass().getResource("main.fxml")); 
        primaryStage.setScene(new Scene(root)); 
        // primaryStage.initStyle(StageStyle.UNDECORATED); 

        
        // Allows Window to Move
        root.setOnMousePressed(evt -> {
            x = evt.getSceneX(); 
            y = evt.getSceneY(); 
        });

        root.setOnMouseDragged(evt -> {
            primaryStage.setX(evt.getSceneX() - x);
            primaryStage.setY(evt.getScreenY() - y);
        });

        primaryStage.show(); 


    }
}