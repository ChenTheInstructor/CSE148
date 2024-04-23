package p7_textInputDialog;

import java.util.Optional;

import javafx.application.Application;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;

public class TextInputDialogExample extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		TextInputDialog dialog = new TextInputDialog("GPA");
		dialog.setTitle("Text Input Dialog");
		dialog.setHeaderText("Look, a text input dialog");
		dialog.setContentText("Please enter your GPA: ");
		Optional<String> result = dialog.showAndWait();
		if(result.isPresent()) {
			System.out.println("The GPA is: " + result.get());
		}
	}

}
