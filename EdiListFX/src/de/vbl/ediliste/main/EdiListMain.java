package de.vbl.ediliste.main;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


public class EdiListMain extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			System.out.println("start");
			BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("../view/EdiListe.fxml"));
			Scene scene = new Scene(root); 
			scene.getStylesheets().add(getClass().getResource("../view/application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
