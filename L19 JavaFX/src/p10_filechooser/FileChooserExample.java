package p10_filechooser;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class FileChooserExample extends Application {
	private static TextArea textArea;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		textArea = new TextArea();
		textArea.setPrefHeight(200);

		// create two buttons
		Button btnImport = new Button("Import Text File");
		Button btnExport = new Button("Export Text File");

		// set up filechooser
		FileChooser fileChooser = new FileChooser();

		// optionally set up initial directory
		File defaultDirectory = new File("c:/users");
		fileChooser.setInitialDirectory(defaultDirectory);

		fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("Text Files", "*.txt"),
				new FileChooser.ExtensionFilter("All Files", "*.*"));

		// handle importing
		btnImport.setOnAction(e -> {
			File file = fileChooser.showOpenDialog(primaryStage);
			if (file != null) {
				openFile(file);
			}
		});

		// handle exporting
		btnExport.setOnAction(e -> {
			File file = fileChooser.showSaveDialog(primaryStage);
			if (file != null) {
				saveFile(file);
			}
		});
		
		VBox root = new VBox(20);
		root.setPadding(new Insets(50));
		root.setAlignment(Pos.CENTER);
		root.getChildren().addAll(textArea, btnImport, btnExport);
		Scene scene = new Scene(root, 400, 300);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	private void saveFile(File file) {
		try {
			Files.write(Paths.get(file.getPath()), textArea.getText().getBytes());
		} catch(IOException ex) {
			ex.printStackTrace();
		}
	}

	private void openFile(File file) {
		try {
			String content = new String(Files.readAllBytes(file.toPath()));
			textArea.setText(content);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	

}
