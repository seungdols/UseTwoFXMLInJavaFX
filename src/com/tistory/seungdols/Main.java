package com.tistory.seungdols;

import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {
	
	private static BorderPane root = new BorderPane();
	@Override
	public void start(Stage primaryStage) throws Exception {
		 
		primaryStage.setTitle("Text JavaFx");
		
		URL menubarURL = getClass().getResource("./resource/menubar.fxml");//get path of fxml file
		MenuBar menubar = FXMLLoader.load(menubarURL);//load fxml
		
		root.setTop(menubar);
		
		URL paneURL = getClass().getResource("./resource/pane.fxml");//get path of fxml file
		Parent pane = FXMLLoader.load(paneURL);
		
		root.setCenter(pane);
		
		Scene main_view  = new Scene(root);
		
		primaryStage.setScene(main_view);
		primaryStage.setResizable(false);
		primaryStage.centerOnScreen();
		primaryStage.show();
		

	}
	public static void main(String[] args) {
		launch(args);
	}
}
