package p2_swap_panes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class PaneSwapExample extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create the main layout pane
        BorderPane borderPane = new BorderPane();
        
        // Create the two panes to swap
        StackPane stackPane = new StackPane();
        stackPane.setStyle("-fx-background-color: lightblue; -fx-padding: 10px;");
        
        AnchorPane anchorPane = new AnchorPane();
        anchorPane.setStyle("-fx-background-color: lightgreen; -fx-padding: 10px;");

        // Create a button to swap the panes
        Button swapButton = new Button("Swap Panes");
        borderPane.setTop(swapButton);

        // Initially, add the stackPane to the center
        borderPane.setCenter(stackPane);

        // Set up a click event on the button to swap panes
        swapButton.setOnAction(event -> {
            if (borderPane.getCenter().equals(stackPane)) {
                borderPane.setCenter(anchorPane);
            } else {
                borderPane.setCenter(stackPane);
            }
        });

        // Create the scene and show the stage
        Scene scene = new Scene(borderPane, 300, 200);
        primaryStage.setTitle("Pane Swap Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
