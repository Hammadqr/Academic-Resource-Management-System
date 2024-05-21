/**
 * Sample Skeleton for 'ProjectCollaboration.fxml' Controller Class
 */

package com.example.rms;

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
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class collaborateResourceController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="dropDown"
    private ComboBox<?> dropDown; // Value injected by FXMLLoader

    @FXML // fx:id="homeButton"
    private Button homeButton; // Value injected by FXMLLoader

    @FXML // fx:id="listView"
    private ListView<?> listView; // Value injected by FXMLLoader

    @FXML // fx:id="makeCollaboration"
    private Button makeCollaboration; // Value injected by FXMLLoader

    @FXML // fx:id="pane1"
    private Pane pane1; // Value injected by FXMLLoader

    @FXML // fx:id="partnerName"
    private TextField partnerName; // Value injected by FXMLLoader

    @FXML // fx:id="searchLabel"
    private Label searchLabel; // Value injected by FXMLLoader

    @FXML // fx:id="searchLabel1"
    private Label searchLabel1; // Value injected by FXMLLoader

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

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert dropDown != null : "fx:id=\"dropDown\" was not injected: check your FXML file 'ProjectCollaboration.fxml'.";
        assert homeButton != null : "fx:id=\"homeButton\" was not injected: check your FXML file 'ProjectCollaboration.fxml'.";
        assert listView != null : "fx:id=\"listView\" was not injected: check your FXML file 'ProjectCollaboration.fxml'.";
        assert makeCollaboration != null : "fx:id=\"makeCollaboration\" was not injected: check your FXML file 'ProjectCollaboration.fxml'.";
        assert pane1 != null : "fx:id=\"pane1\" was not injected: check your FXML file 'ProjectCollaboration.fxml'.";
        assert partnerName != null : "fx:id=\"partnerName\" was not injected: check your FXML file 'ProjectCollaboration.fxml'.";
        assert searchLabel != null : "fx:id=\"searchLabel\" was not injected: check your FXML file 'ProjectCollaboration.fxml'.";
        assert searchLabel1 != null : "fx:id=\"searchLabel1\" was not injected: check your FXML file 'ProjectCollaboration.fxml'.";

    }

    public void ActionUploadMaterial(ActionEvent actionEvent) {
    }
}
