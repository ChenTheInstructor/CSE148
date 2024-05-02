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
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import model.StringBag;

public class SecondController implements Initializable {
	private static StringBag theBag;
	private static int nElems;

    @FXML
    private Button changeToScene1Btn;

    @FXML
    private TextArea outputArea;

    @FXML
    private Button showBagBtn;

    @FXML
    void changeSceneButtonClicked(ActionEvent event) {
    	try {
			Parent firstRoot = FXMLLoader.load(getClass().getResource("/view/FirstFXML.fxml"));
			Scene firstScene = new Scene(firstRoot);
			Stage primaryStage = (Stage)((Node)event.getSource()).getScene().getWindow();
			primaryStage.setScene(firstScene);
			primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }

    @FXML
    void showBag(ActionEvent event) {
    	for(int i  = 0; i < nElems; i++) {
    		outputArea.appendText(theBag.get(i) + "\n");
    	}
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		theBag = StringBag.getInstance();
		nElems = StringBag.getNElems();
	}

}
