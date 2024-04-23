package p3_gridpane;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class LoginFormExample extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a GridPane
        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(25));

        // Create Labels and TextFields
        Label userNameLabel = new Label("Username:");
        TextField userNameTextField = new TextField();
        Label passwordLabel = new Label("Password:");
        PasswordField passwordField = new PasswordField();
        
        // Add nodes to the GridPane
        gridPane.add(userNameLabel, 0, 0);
        gridPane.add(userNameTextField, 1, 0);
        gridPane.add(passwordLabel, 0, 1);
        gridPane.add(passwordField, 1, 1);

        // Create Login Button
        Button loginButton = new Button("Sign in");
        gridPane.add(loginButton, 1, 2);

        // Set the alignment of the Login Button to right
        GridPane.setHalignment(loginButton, HPos.RIGHT);

        // Create a scene and set it on the stage
        Scene scene = new Scene(gridPane, 300, 275);
        primaryStage.setTitle("JavaFX Login Form");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
