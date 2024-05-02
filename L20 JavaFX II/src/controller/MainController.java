package controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class MainController {
	@FXML
    private TextField majorField;

    @FXML
    private TextField nameField;

    @FXML
    private Button insertBtn;

    @FXML
    private Button removeBtn;

    @FXML
    private Button searchBtn;

    @FXML
    private Button updateBtn;

    @FXML
    void insert(ActionEvent event) {
    	String name = nameField.getText();
    	String major = majorField.getText();
    	System.out.println("Name: " + name + ", Major: " + major);
    }

    @FXML
    void remove(ActionEvent event) {

    }

    @FXML
    void search(ActionEvent event) {

    }

    @FXML
    void update(ActionEvent event) {

    }

}
