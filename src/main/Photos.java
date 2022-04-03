package main;

import controller.LoginController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Photos extends Application{

	public static void main(String[] args) {
		
		launch(args);
	}
	
	public void start(Stage primaryStage){
		try {		
			FXMLLoader loader = new FXMLLoader();   
			loader.setLocation(getClass().getResource("/views/Login.fxml"));

			AnchorPane root = (AnchorPane)loader.load();

//			LoginController controller = loader.getController();
//			controller.start();
		
		
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
