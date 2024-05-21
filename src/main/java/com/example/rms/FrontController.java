/**
 * Sample Skeleton for 'Main.fxml' Controller Class
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
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class FrontController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="AdminLoginButton"
    private Button AdminLoginButton; // Value injected by FXMLLoader

    @FXML // fx:id="CustomerReg"
    private Button CustomerReg; // Value injected by FXMLLoader

    @FXML
    void LogtheAdmin(ActionEvent event) throws IOException {
        BorderPane root = (BorderPane) FXMLLoader.load(Objects.requireNonNull(this.getClass().getResource("AdminLogin.fxml")));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void LoginCustomer(ActionEvent event) throws IOException {
        BorderPane root = (BorderPane)FXMLLoader.load(this.getClass().getResource("CustomerLogin.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert AdminLoginButton != null : "fx:id=\"AdminLoginButton\" was not injected: check your FXML file 'Main.fxml'.";
        assert CustomerReg != null : "fx:id=\"CustomerReg\" was not injected: check your FXML file 'Main.fxml'.";

    }


    public void homeButtonAction(ActionEvent actionEvent) {
    }
}
