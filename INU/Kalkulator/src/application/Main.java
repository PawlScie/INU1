package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;



public class Main extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws IOException{
		
		Parent root = FXMLLoader.load(getClass().getResource("Kalkulator.fxml"));
	    Scene scene = new Scene(root);
	    
	    primaryStage.setTitle("Kalkulator");
	    primaryStage.setScene(scene);
	    primaryStage.show();
	    }
	 

}