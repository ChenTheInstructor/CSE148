package p4_flowpane;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class FlowPaneExample extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a FlowPane
        FlowPane flowPane = new FlowPane();
        flowPane.setPadding(new Insets(50));
        flowPane.setVgap(4);
        flowPane.setHgap(4);
        flowPane.setPrefWrapLength(250); // Preferred width allows for two columns

        // Add buttons to the FlowPane
        for (int i = 1; i <= 15; i++) {
            Button button = new Button("Button " + i);
            flowPane.getChildren().add(button);
        }

        // Create a scene and set it on the stage
        Scene scene = new Scene(flowPane, 300, 250);
        primaryStage.setTitle("FlowPane Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
