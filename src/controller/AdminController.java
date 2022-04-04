package controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AdminController {

	@FXML private Button add_btn;
    @FXML private Button search_btn;
    @FXML private Button delete_btn;
    @FXML private Button logout_btn;
    @FXML private TextField username;
    
    @FXML
    void logout(ActionEvent event) throws IOException{
//    	System.out.println("logout");
    	Parent root = FXMLLoader.load(getClass().getResource("/views/Login.fxml"));
    	Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    	Scene scene = new Scene(root);
    	
    	stage.setScene(scene);
    	stage.show();
	}
	
}
