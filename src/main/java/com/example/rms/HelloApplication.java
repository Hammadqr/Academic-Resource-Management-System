package com.example.rms;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //DBHandler.FileToMySQL();
        //DBHandler.MySQLToFile();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("ContributeMaterial.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}

//import javafx.application.Application;
//import javafx.stage.FileChooser;
//import javafx.stage.Stage;
//import java.io.File;
//
//public class HelloApplication extends Application {
//
//    @Override
//    public void start(Stage primaryStage) {
//        // Create a FileChooser
//        FileChooser fileChooser = new FileChooser();
//
//        // Set title for FileChooser dialog
//        fileChooser.setTitle("Select File");
//
//        // Show open dialog
//        File selectedFile = fileChooser.showOpenDialog(primaryStage);
//
//        // Check if a file was selected
//        if (selectedFile != null) {
//            System.out.println("Selected File: " + selectedFile.getAbsolutePath());
//        } else {
//            System.out.println("No file selected.");
//        }
//    }
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//}