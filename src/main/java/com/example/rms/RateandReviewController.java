/**
 * Sample Skeleton for 'RateandReview.fxml' Controller Class
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
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class RateandReviewController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="contributorName"
    private TextField contributorName; // Value injected by FXMLLoader

    @FXML // fx:id="dropDown"
    private ComboBox<?> dropDown; // Value injected by FXMLLoader

    @FXML // fx:id="flagContent"
    private RadioButton flagContent; // Value injected by FXMLLoader

    @FXML // fx:id="homeButton"
    private Button homeButton; // Value injected by FXMLLoader

    @FXML // fx:id="ratingBox"
    private TextField ratingBox; // Value injected by FXMLLoader

    @FXML // fx:id="reviewBox"
    private TextArea reviewBox; // Value injected by FXMLLoader

    @FXML // fx:id="searchLabel"
    private Label searchLabel; // Value injected by FXMLLoader

    @FXML // fx:id="searchLabel1"
    private Label searchLabel1; // Value injected by FXMLLoader

    @FXML // fx:id="sendReview"
    private Button sendReview; // Value injected by FXMLLoader

    @FXML // fx:id="tableView"
    private TableView<?> tableView; // Value injected by FXMLLoader

    @FXML
    void contributorNameAction(ActionEvent event) {

    }

    @FXML
    void dropDownAction(ActionEvent event) {

    }

    @FXML
    void flagContentAction(ActionEvent event) {

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
    void ratingBoxAction(ActionEvent event) {

    }

    @FXML
    void sendReviewAction(ActionEvent event) {

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert contributorName != null : "fx:id=\"contributorName\" was not injected: check your FXML file 'RateandReview.fxml'.";
        assert dropDown != null : "fx:id=\"dropDown\" was not injected: check your FXML file 'RateandReview.fxml'.";
        assert flagContent != null : "fx:id=\"flagContent\" was not injected: check your FXML file 'RateandReview.fxml'.";
        assert homeButton != null : "fx:id=\"homeButton\" was not injected: check your FXML file 'RateandReview.fxml'.";
        assert ratingBox != null : "fx:id=\"ratingBox\" was not injected: check your FXML file 'RateandReview.fxml'.";
        assert reviewBox != null : "fx:id=\"reviewBox\" was not injected: check your FXML file 'RateandReview.fxml'.";
        assert searchLabel != null : "fx:id=\"searchLabel\" was not injected: check your FXML file 'RateandReview.fxml'.";
        assert searchLabel1 != null : "fx:id=\"searchLabel1\" was not injected: check your FXML file 'RateandReview.fxml'.";
        assert sendReview != null : "fx:id=\"sendReview\" was not injected: check your FXML file 'RateandReview.fxml'.";
        assert tableView != null : "fx:id=\"tableView\" was not injected: check your FXML file 'RateandReview.fxml'.";

    }

}
