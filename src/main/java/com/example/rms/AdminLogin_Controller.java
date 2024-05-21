/**
 * Sample Skeleton for 'AdminLogin.fxml' Controller Class
 */

package com.example.rms;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class AdminLogin_Controller {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="NameOfUser"
    private TextField NameOfUser; // Value injected by FXMLLoader

    @FXML // fx:id="butLog1"
    private Button butLog1; // Value injected by FXMLLoader

    @FXML // fx:id="passcode"
    private TextField passcode; // Value injected by FXMLLoader

    public String getUsername () {
        return NameOfUser.getText();
    }
    public String getPass () {
        return passcode.getText();
    }

    @FXML
    void Admin_Button_Submit(ActionEvent event) throws IOException {
        if (DBHandler.checkManagerCredentials(getUsername(),getPass())){
            BorderPane root = (BorderPane) FXMLLoader.load(this.getClass().getResource("adminMenu.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        else{
            System.out.println("Wrong Credentials");
        }

    }

    @FXML
    void GoToMainPage(ActionEvent event) {

    }


    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert NameOfUser != null : "fx:id=\"NameOfUser\" was not injected: check your FXML file 'AdminLogin.fxml'.";
        assert butLog1 != null : "fx:id=\"butLog1\" was not injected: check your FXML file 'AdminLogin.fxml'.";
        assert passcode != null : "fx:id=\"passcode\" was not injected: check your FXML file 'AdminLogin.fxml'.";

    }

}
