package p6_listview;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ListViewExample extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create an ObservableList which backs the ListView
        ObservableList<String> items = FXCollections.observableArrayList(
                "Item 1", "Item 2", "Item 3", "Item 4", "Item 5"
        );
        
        // Create the ListView and add the items
        ListView<String> listView = new ListView<>(items);

        // Set a preferred size
        listView.setPrefSize(200, 150);

        // Handle ListView selection changes
        listView.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                showAlert("You selected: " + newValue);
            }
        });

        // Layout the main scene with a VBox
        VBox layout = new VBox(10); // 10 pixels spacing between components
        layout.getChildren().add(listView);

        // Set up the scene and stage
        Scene scene = new Scene(layout, 300, 200);
        primaryStage.setTitle("ListView Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Utility method to show alert dialog
    private void showAlert(String message) {
        Alert alert = new Alert(AlertType.WARNING);
        alert.setTitle("Information");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
