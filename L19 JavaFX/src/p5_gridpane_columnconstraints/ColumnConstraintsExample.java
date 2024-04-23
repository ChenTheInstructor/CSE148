package p5_gridpane_columnconstraints;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;

public class ColumnConstraintsExample extends Application {

    @Override
    public void start(Stage primaryStage) {
        GridPane gridPane = new GridPane();

        // Using different constructors for different columns
        ColumnConstraints col1 = new ColumnConstraints(50, 50, 50); // Preferred width only
        ColumnConstraints col2 = new ColumnConstraints(350, 350, Double.MAX_VALUE); // Min, Pref, Max width
        col2.setHgrow(Priority.ALWAYS);
        gridPane.getColumnConstraints().addAll(col1, col2);

        // Add some buttons to demonstrate the layout
        Button btn1 = new Button("Button in Col 1");
        Button btn2 = new Button("Button in Col 2 fasfsafdsafdsaf adfdsafda guyguho huoyoho");
        gridPane.add(btn1, 0, 0);
        gridPane.add(btn2, 1, 0);

        Scene scene = new Scene(gridPane, 500, 200);
        primaryStage.setTitle("ColumnConstraints Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
