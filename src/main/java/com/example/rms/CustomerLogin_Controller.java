/**
 * Sample Skeleton for 'CustomerLogin.fxml' Controller Class
 */

package com.example.rms;

import java.io.IOException;
import java.net.URL;
//<<<<<<< HEAD
//=======
import java.util.Objects;
//>>>>>>> f37d637 (Initial Commit By Ahmad Ali)
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class CustomerLogin_Controller {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    //<<<<<<< HEAD
    @FXML // fx:id="cnic"
    private TextField cnic; // Value injected by FXMLLoader
    //=======
    @FXML // fx:id="Password"
    private TextField Password; // Value injected by FXMLLoader

    @FXML // fx:id="email"
    private TextField email; // Value injected by FXMLLoader
//>>>>>>> f37d637 (Initial Commit By Ahmad Ali)

    @FXML // fx:id="loginButton"
    private Button loginButton; // Value injected by FXMLLoader

    //<<<<<<< HEAD
    @FXML
    void GoToCustomerMenu(ActionEvent event) {

    }



//=======


        public String getPass () {
            return Password.getText();
        }
        public String getEmail () {
            return email.getText();
        }


        @FXML
        void GoToUserMenu (ActionEvent event) throws IOException {
        if(DBHandler.checkUser(getEmail(),getPass())){
            System.out.println("LOGGED IN SUCCESSFULLY");
            BorderPane root = (BorderPane) FXMLLoader.load(this.getClass().getResource("studentMenu.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        }
        else{
            System.out.println("Fail to login");

        }
//>>>>>>> f37d637 (Initial Commit By Ahmad Ali)
        }

        @FXML
        void RegisterCustomer1 (ActionEvent event) throws IOException {
            BorderPane root = (BorderPane) FXMLLoader.load(this.getClass().getResource("Register.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }

//<<<<<<< HEAD
//=======

        @FXML
        void GoToMainPage (ActionEvent event){

        }

//>>>>>>> f37d637 (Initial Commit By Ahmad Ali)
        @FXML
        void validateCnic (KeyEvent event){

        }

        @FXML // This method is called by the FXMLLoader when initialization is complete
        void initialize () {
//<<<<<<< HEAD
            assert cnic != null : "fx:id=\"cnic\" was not injected: check your FXML file 'CustomerLogin.fxml'.";
//=======
            assert Password != null : "fx:id=\"Password\" was not injected: check your FXML file 'CustomerLogin.fxml'.";
            assert email != null : "fx:id=\"email\" was not injected: check your FXML file 'CustomerLogin.fxml'.";
//>>>>>>> f37d637 (Initial Commit By Ahmad Ali)
            assert loginButton != null : "fx:id=\"loginButton\" was not injected: check your FXML file 'CustomerLogin.fxml'.";

        }


    }