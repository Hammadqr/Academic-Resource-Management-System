/**
 * Sample Skeleton for 'studentMenu.fxml' Controller Class
 */

package com.example.rms;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class studentMenu_Controller {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="browseResourcesButton"
    private Button browseResourcesButton; // Value injected by FXMLLoader

    @FXML // fx:id="downloadExamPapersButton"
    private Button downloadExamPapersButton; // Value injected by FXMLLoader

    @FXML
    void browseResourcesAction(ActionEvent event) throws IOException {
        try {
            // Load the FXML file for the new scene
            FXMLLoader loader = new FXMLLoader(getClass().getResource("browseResource.fxml"));
            Parent root = loader.load();

            // Get the controller instance
            BrowseResourceController controller = loader.getController();

            // Set up the new scene
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.setTitle("Browse Resource");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace(); // Handle the exception appropriately
        }
    }

    @FXML
    void collaborateProjectsAction(ActionEvent event) {
        try {
            // Load the FXML file for the new scene
            FXMLLoader loader = new FXMLLoader(getClass().getResource("ProjectCollaboration.fxml"));
            Parent root = loader.load();

            // Get the controller instance
             collaborateResourceController controller = loader.getController();

            // Set up the new scene
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.setTitle("Collaboration");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace(); // Handle the exception appropriately
        }

    }

    @FXML
    void contributeMaterialsAction(ActionEvent event) throws IOException {
        try {
            // Load the FXML file for the new scene
            FXMLLoader loader = new FXMLLoader(getClass().getResource("ContributeMaterial.fxml"));
            Parent root = loader.load();

            // Get the controller instance
            contributeResourceController controller = loader.getController();

            // Set up the new scene
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.setTitle("Contribution");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace(); // Handle the exception appropriately
        }
    }


    @FXML
    void downloadExamPapersAction(ActionEvent event) {

        //DBHandler.checkFileStorage(2,"C:\\Program Files\\MySQL\\MySQL Server 8.0\\Uploads\\CPS pre.PNG");
        //DBHandler.RetrieveFileFromDatabase();
        try {
            // Load the FXML file for the new scene
            FXMLLoader loader = new FXMLLoader(getClass().getResource("browseResource.fxml"));
            Parent root = loader.load();

            // Get the controller instance
            BrowseResourceController controller = loader.getController();

            // Set up the new scene
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.setTitle("Browse Resource");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace(); // Handle the exception appropriately
        }

    }

    @FXML
    void favoritesAction(ActionEvent event) {
        try {
            // Load the FXML file for the new scene
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Favourites.fxml"));
            Parent root = loader.load();

            // Get the controller instance
            FavouritesController controller = loader.getController();

            // Set up the new scene
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.setTitle("Favourites");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace(); // Handle the exception appropriately
        }

    }

    @FXML
    void rateReviewAction(ActionEvent event) {
        try {
            // Load the FXML file for the new scene
            FXMLLoader loader = new FXMLLoader(getClass().getResource("RateandReview.fxml"));
            Parent root = loader.load();

            // Get the controller instance
            RateandReviewController controller = loader.getController();

            // Set up the new scene
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.setTitle("Rate and Review");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace(); // Handle the exception appropriately
        }

    }

    @FXML
    void requestResourcesAction(ActionEvent event) {
        try {
            // Load the FXML file for the new scene
            FXMLLoader loader = new FXMLLoader(getClass().getResource("RequestResources.fxml"));
            Parent root = loader.load();

            // Get the controller instance
            RequestResourceController controller = loader.getController();

            // Set up the new scene
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.setTitle("Request Resources");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace(); // Handle the exception appropriately
        }

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert browseResourcesButton != null : "fx:id=\"browseResourcesButton\" was not injected: check your FXML file 'studentMenu.fxml'.";
        assert downloadExamPapersButton != null : "fx:id=\"downloadExamPapersButton\" was not injected: check your FXML file 'studentMenu.fxml'.";

    }

}
