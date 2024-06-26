package p9_multiPane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class App extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane root = new BorderPane();
		root.setTop(new MenuBarPane().getMenuBar());
		root.setCenter(new CenterPane().getGridPane());
		
		
		Scene scene = new Scene(root, 800, 800);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
