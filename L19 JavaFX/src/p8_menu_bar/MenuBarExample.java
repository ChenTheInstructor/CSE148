package p8_menu_bar;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MenuBarExample extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("My App with a menu bar");
		BorderPane root = new BorderPane();
		Scene scene = new Scene(root, 300, 250);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		MenuBar menuBar = new MenuBar();
		menuBar.prefWidthProperty().bind(primaryStage.widthProperty());
		root.setTop(menuBar);
		
		Menu fileMenu = new Menu("File");
		MenuItem openItem = new MenuItem("Open");
		
		Menu importMenu = new Menu("Import");
		MenuItem studentItem = new MenuItem("Students");
		MenuItem instructorItem = new MenuItem("Instructors");
		importMenu.getItems().addAll(studentItem, instructorItem);
		
		MenuItem exportItem = new MenuItem("Export");
		MenuItem backupItem = new MenuItem("Backup");
		MenuItem restoreItem = new MenuItem("Restore");
		MenuItem exitItem = new MenuItem("Exit");
		exitItem.setOnAction(e -> Platform.exit());
		
		fileMenu.getItems().addAll(openItem,new SeparatorMenuItem(), importMenu, exportItem, new SeparatorMenuItem(),backupItem, restoreItem, new SeparatorMenuItem(),exitItem);
		
		menuBar.getMenus().add(fileMenu);
		
	}

}
