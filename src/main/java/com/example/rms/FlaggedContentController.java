/**
 * Sample Skeleton for 'flaggedContent.fxml' Controller Class
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
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class FlaggedContentController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="flaggingUsers"
    private TextArea flaggingUsers; // Value injected by FXMLLoader

    @FXML // fx:id="homeButton"
    private Button homeButton; // Value injected by FXMLLoader

    @FXML // fx:id="removeFavourite"
    private Button removeFavourite; // Value injected by FXMLLoader

    @FXML // fx:id="removeFlag"
    private AnchorPane removeFlag; // Value injected by FXMLLoader

    @FXML // fx:id="scrollPane"
    private ScrollPane scrollPane; // Value injected by FXMLLoader

    @FXML // fx:id="table"
    private TableView<?> table; // Value injected by FXMLLoader

    @FXML
    void homeButtonAction(ActionEvent event) {
        try {
            // Load the FXML file for the new scene
            FXMLLoader loader = new FXMLLoader(getClass().getResource("adminMenu.fxml"));
            Parent root = loader.load();

            // Get the controller instance
            adminMenu_Controller controller = loader.getController();

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
        assert flaggingUsers != null : "fx:id=\"flaggingUsers\" was not injected: check your FXML file 'flaggedContent.fxml'.";
        assert homeButton != null : "fx:id=\"homeButton\" was not injected: check your FXML file 'flaggedContent.fxml'.";
        assert removeFavourite != null : "fx:id=\"removeFavourite\" was not injected: check your FXML file 'flaggedContent.fxml'.";
        assert removeFlag != null : "fx:id=\"removeFlag\" was not injected: check your FXML file 'flaggedContent.fxml'.";
        assert scrollPane != null : "fx:id=\"scrollPane\" was not injected: check your FXML file 'flaggedContent.fxml'.";
        assert table != null : "fx:id=\"table\" was not injected: check your FXML file 'flaggedContent.fxml'.";

    }

}
