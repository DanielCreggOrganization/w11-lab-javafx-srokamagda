package ie.atu.testpackage;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class HelloJavaFX extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        // Create the main content node
        Label welcomeLabel = new Label("Welcome to JavaFX!");
        welcomeLabel.setStyle("-fx-font-size: 20px;");
        
        // Create a container to hold our label
        StackPane root = new StackPane();
        root.getChildren().add(welcomeLabel);
        
        // Create and configure the scene
        Scene scene = new Scene(root, 300, 200);
        
        // Configure and show the stage
        primaryStage.setTitle("Hello JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}