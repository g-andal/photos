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

public class LoginController {

    @FXML private Button login_btn;
    @FXML private Button signup_btn;
    @FXML private TextField username;

    @FXML void login(ActionEvent event) throws IOException{
    	System.out.println("yep");
    	Parent root = FXMLLoader.load(getClass().getResource("views/HomeScreen.fxml"));
    	Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    	Scene scene = new Scene(root);
    	stage.setScene(scene);
    	stage.show();
    }

    @FXML void signup(ActionEvent event) {
    	System.out.println("yep");
    	Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("views/HomeSceen.fxml"));
	    	Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	    	Scene scene = new Scene(root);
	    	stage.setScene(scene);
	    	stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    public void start() {
    	System.out.println("here");
    }

}
