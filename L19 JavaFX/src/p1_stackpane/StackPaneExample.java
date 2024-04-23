package p1_stackpane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class StackPaneExample extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a rectangle
        Rectangle rectangle = new Rectangle(200, 100);
        rectangle.setFill(Color.LIGHTBLUE);

        // Create a label
        Label label = new Label("Hello, StackPane!");
        
        // Create a StackPane
        StackPane stackPane = new StackPane();
        stackPane.getChildren().addAll(rectangle, label); // Add rectangle and label to the StackPane

        // Create a scene with the stack pane
        Scene scene = new Scene(stackPane, 300, 200);

        // Set the scene on the stage
        primaryStage.setTitle("StackPane Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
