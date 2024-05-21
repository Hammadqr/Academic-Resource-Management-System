/**
 * Sample Skeleton for 'ContributeMaterial.fxml' Controller Class
 */

package com.example.rms;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
//import javafx.scene.web.WebView;

public class contributeResourceController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="courseName"
    private TextField courseName; // Value injected by FXMLLoader

    @FXML // fx:id="dropDown"
    private ComboBox<?> dropDown; // Value injected by FXMLLoader

    @FXML // fx:id="homeButton"
    private Button homeButton; // Value injected by FXMLLoader

    @FXML // fx:id="listView"
    private ListView<?> listView; // Value injected by FXMLLoader

    @FXML // fx:id="makeContribution"
    private Button makeContribution; // Value injected by FXMLLoader

    @FXML // fx:id="searchLabel"
    private Label searchLabel; // Value injected by FXMLLoader

    @FXML // fx:id="searchLabel1"
    private Label searchLabel1; // Value injected by FXMLLoader

    @FXML // fx:id="uploadButton"
    private Button uploadButton; // Value injected by FXMLLoader

    //@FXML // fx:id="webview"
    //private WebView webview; // Value injected by FXMLLoader

    @FXML
    void couseAction(ActionEvent event) {

    }

    @FXML
    void dropDownAction(ActionEvent event) {

    }

    @FXML
    void homeButtonAction(ActionEvent event) {
        try {
            // Load the FXML file for the new scene
            FXMLLoader loader = new FXMLLoader(getClass().getResource("studentMenu.fxml"));
            Parent root = loader.load();

            // Get the controller instance
            studentMenu_Controller controller = loader.getController();

            // Set up the new scene
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.setTitle("Home Page");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace(); // Handle the exception appropriately
        }
    }

    @FXML
    void makeContributionAction(ActionEvent event) {

    }

    @FXML
    void uploadButtonAction(ActionEvent event) {
        // Create a FileChooser
        FileChooser fileChooser = new FileChooser();

        // Set title for FileChooser dialog
        fileChooser.setTitle("Select File");

        // Show open dialog
        Stage stage = (Stage) uploadButton.getScene().getWindow();
        File selectedFile = fileChooser.showOpenDialog(stage);

        // Check if a file was selected
        if (selectedFile != null) {
            System.out.println("Selected File: " + selectedFile.getAbsolutePath());
            DBHandler.FileToSQL("Lecture Slides","SE", selectedFile.getAbsolutePath());
            // Call another method or perform actions with the selected file here
        } else {
            System.out.println("No file selected.");
        }
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert courseName != null : "fx:id=\"courseName\" was not injected: check your FXML file 'ContributeMaterial.fxml'.";
        assert dropDown != null : "fx:id=\"dropDown\" was not injected: check your FXML file 'ContributeMaterial.fxml'.";
        assert homeButton != null : "fx:id=\"homeButton\" was not injected: check your FXML file 'ContributeMaterial.fxml'.";
        assert listView != null : "fx:id=\"listView\" was not injected: check your FXML file 'ContributeMaterial.fxml'.";
        assert makeContribution != null : "fx:id=\"makeContribution\" was not injected: check your FXML file 'ContributeMaterial.fxml'.";
        assert searchLabel != null : "fx:id=\"searchLabel\" was not injected: check your FXML file 'ContributeMaterial.fxml'.";
        assert searchLabel1 != null : "fx:id=\"searchLabel1\" was not injected: check your FXML file 'ContributeMaterial.fxml'.";
        assert uploadButton != null : "fx:id=\"uploadButton\" was not injected: check your FXML file 'ContributeMaterial.fxml'.";
        //assert webview != null : "fx:id=\"webview\" was not injected: check your FXML file 'ContributeMaterial.fxml'.";

    }

}
