package controller;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.StringBag;

public class FirstController implements Initializable {
	private static StringBag theBag;

    @FXML
    private Button changeToScene2Btn;

    @FXML
    private TextField inputField;

    @FXML
    private Button insertBtn;

    @FXML
    private TextField outputField;

    @FXML
    void changeSceneButtonClicked(ActionEvent event) {
    	try {
			Parent secondRoot = FXMLLoader.load(getClass().getResource("/view/SecondFXML.fxml"));
			Scene secondScene = new Scene(secondRoot);
			Stage primaryStage = (Stage)((Node)event.getSource()).getScene().getWindow();
			primaryStage.setScene(secondScene);
			primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }

    @FXML
    void insert(ActionEvent event) {
    	theBag.insert(inputField.getText());
    	outputField.setText("You inserted " + inputField.getText());
    	inputField.clear();
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		theBag = StringBag.getInstance(100);
	}

}
