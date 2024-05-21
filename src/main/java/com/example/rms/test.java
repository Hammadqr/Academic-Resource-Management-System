/**
 * Sample Skeleton for 'TestFIleupload.fxml' Controller Class
 */

package com.example.rms;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.FileChooser;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;



import javafx.application.Application;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import java.io.File;

public class test extends Application {


        // Create a FileChooser



    // Method to open file chooser dialog
    private File openFileChooser(Stage primaryStage) {
        // Create a FileChooser
        FileChooser fileChooser = new FileChooser();

        // Set title for FileChooser dialog
        fileChooser.setTitle("Select File");

        // Show open dialog
        return fileChooser.showOpenDialog(primaryStage);
    }


    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML
    private Button chooseButton;

    @FXML
    void chooseFile(ActionEvent event) {
        // Create a FileChooser
        FileChooser fileChooser = new FileChooser();

        // Set title for FileChooser dialog
        fileChooser.setTitle("Select File");

        // Show open dialog
        Stage stage = (Stage) chooseButton.getScene().getWindow();
        File selectedFile = fileChooser.showOpenDialog(stage);

        // Check if a file was selected
        if (selectedFile != null) {
            System.out.println("Selected File: " + selectedFile.getAbsolutePath());
            // Call another method or perform actions with the selected file here
        } else {
            System.out.println("No file selected.");
        }

    }


    private Connection connection; // Initialize your database connection



//    private void uploadFile(File file) {
//        try (PreparedStatement pstmt = connection.prepareStatement("INSERT INTO files (name, content) VALUES (?, ?)")) {
//            pstmt.setString(1, file.getName());
//            pstmt.setBinaryStream(2, new FileInputStream(file));
//            pstmt.executeUpdate();
//        } catch (SQLException | FileNotFoundException e) {
//            e.printStackTrace();
//        }
//    }


    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        System.out.println("Controller initialized.");

    }

    @Override
    public void start(Stage primaryStage) throws Exception {

    }

}
