/**
 * Sample Skeleton for 'adminMenu.fxml' Controller Class
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
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class adminMenu_Controller {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="flaggedContentButton"
    private Button flaggedContentButton; // Value injected by FXMLLoader

    @FXML // fx:id="manageResourcesButton"
    private Button manageResourcesButton; // Value injected by FXMLLoader

    @FXML // fx:id="reportsButton"
    private Button reportsButton; // Value injected by FXMLLoader

    @FXML // fx:id="reviewContributionsButton"
    private Button reviewContributionsButton; // Value injected by FXMLLoader

    @FXML // fx:id="userManagementButton"
    private Button userManagementButton; // Value injected by FXMLLoader

    @FXML
    void flaggedContent(ActionEvent event) {
        try {
            // Load the FXML file for the new scene
            FXMLLoader loader = new FXMLLoader(getClass().getResource("flaggedContent.fxml"));
            Parent root = loader.load();

            // Get the controller instance
            FlaggedContentController controller = loader.getController();

            // Set up the new scene
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.setTitle("Flagged Content");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace(); // Handle the exception appropriately
        }

    }

    @FXML
    void manageResources(ActionEvent event) {
        try {
            // Load the FXML file for the new scene
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Main.fxml"));
            Parent root = loader.load();

            // Get the controller instance
            ReportController controller = loader.getController();

            // Set up the new scene
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.setTitle("Report Management System");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace(); // Handle the exception appropriately
        }

    }

    @FXML
    void reports(ActionEvent event) throws IOException {

        try {
            // Load the FXML file for the new scene
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Reports.fxml"));
            Parent root = loader.load();

            // Get the controller instance
            ReportController controller = loader.getController();

            // Set up the new scene
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.setTitle("Report Management System");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace(); // Handle the exception appropriately
        }

    }

    @FXML
    void reviewContributions(ActionEvent event) {
        try {
            // Load the FXML file for the new scene
            FXMLLoader loader = new FXMLLoader(getClass().getResource("reviewContribution.fxml"));
            Parent root = loader.load();

            // Get the controller instance
            ReviewContributionController controller = loader.getController();

            // Set up the new scene
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.setTitle("Review Contribution");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace(); // Handle the exception appropriately
        }

    }

    @FXML
    void userManagement(ActionEvent event) {
        try {
            // Load the FXML file for the new scene
            FXMLLoader loader = new FXMLLoader(getClass().getResource("userManagement.fxml"));
            Parent root = loader.load();

            // Get the controller instance
            UserManagement controller = loader.getController();

            // Set up the new scene
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.setTitle("User Management");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace(); // Handle the exception appropriately
        }


    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert flaggedContentButton != null : "fx:id=\"flaggedContentButton\" was not injected: check your FXML file 'adminMenu.fxml'.";
        assert manageResourcesButton != null : "fx:id=\"manageResourcesButton\" was not injected: check your FXML file 'adminMenu.fxml'.";
        assert reportsButton != null : "fx:id=\"reportsButton\" was not injected: check your FXML file 'adminMenu.fxml'.";
        assert reviewContributionsButton != null : "fx:id=\"reviewContributionsButton\" was not injected: check your FXML file 'adminMenu.fxml'.";
        assert userManagementButton != null : "fx:id=\"userManagementButton\" was not injected: check your FXML file 'adminMenu.fxml'.";

    }

}
