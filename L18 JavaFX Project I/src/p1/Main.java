package p1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		VBox vBoxLeft = new VBox(20);
		vBoxLeft.setAlignment(Pos.CENTER);
		TextField textFieldLeft = new TextField();

		VBox vBoxRight = new VBox(20);
		vBoxRight.setAlignment(Pos.CENTER);
		TextField textFieldRight = new TextField();

		Button btn1 = new Button("Hi");
		btn1.setPrefSize(50, 20);

//		btn1.setOnAction(new EventHandler<ActionEvent>() {
//
//			@Override
//			public void handle(ActionEvent arg0) {
//				System.out.println("Hi from JavaFX project");
//			}
//
//		});

		Label lbl1 = new Label();

		btn1.setOnAction(e -> {
			String txt = textFieldLeft.getText();
			lbl1.setText("Hi, " + txt);
			textFieldLeft.clear();
		});

		vBoxLeft.getChildren().addAll(btn1, lbl1, textFieldLeft);

		Button btn2 = new Button("Bye");
		btn2.setPrefSize(50, 20);

		Label lbl2 = new Label();

		vBoxRight.getChildren().addAll(btn2, lbl2, textFieldRight);

		btn2.setOnAction(e -> {
			String txt = textFieldRight.getText();
			lbl2.setText("Bye, " + txt);
			textFieldRight.clear();
		});

//		HBox root = new HBox(50);
		BorderPane root = new BorderPane();
		root.setLeft(vBoxLeft);
		root.setRight(vBoxRight);
		root.setMargin(vBoxLeft, new Insets(50));
		root.setMargin(vBoxRight, new Insets(50));
		
		Button btnBackup = new Button("BACKUP");
		Button btnRestore = new Button("RESTORE");
		Button btnImport = new Button("IMPORT");
		Button btnExport = new Button("EXPORT");
		btnBackup.setPrefSize(100, 30);
		btnRestore.setPrefSize(100, 30);
		btnImport.setPrefSize(100, 30);
		btnExport.setPrefSize(100, 30);
		HBox menuBox = new HBox(30);
		menuBox.setAlignment(Pos.CENTER);
		menuBox.getChildren().addAll(btnImport, btnExport, btnBackup, btnRestore);
		root.setTop(menuBox);
		root.setMargin(menuBox, new Insets(50));
//		root.setAlignment(Pos.CENTER);
//		root.getChildren().addAll(vBoxLeft, vBoxRight);
		Scene scene = new Scene(root, 500, 500);
		primaryStage.setScene(scene);
		primaryStage.show();
//		System.out.println("Hello");
	}

}
