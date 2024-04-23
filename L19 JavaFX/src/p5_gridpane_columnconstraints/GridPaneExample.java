package p5_gridpane_columnconstraints;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridPaneExample extends Application {

    @Override
    public void start(Stage primaryStage) {
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10));
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        // Create ColumnConstraints
        ColumnConstraints column1 = new ColumnConstraints();
        column1.setPercentWidth(50); // Set the first column to take 50% of the grid width
        ColumnConstraints column2 = new ColumnConstraints();
        column2.setPercentWidth(50); // Set the second column to take 50% of the grid width

        // Add ColumnConstraints to the GridPane
        gridPane.getColumnConstraints().addAll(column1, column2);

        // Add buttons to the grid
        Button btn1 = new Button("Button 1");
        Button btn2 = new Button("Button 2");
        gridPane.add(btn1, 0, 0);
        gridPane.add(btn2, 1, 0);

        Scene scene = new Scene(gridPane, 300, 100);
        primaryStage.setTitle("GridPane Example with Column Constraints");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
