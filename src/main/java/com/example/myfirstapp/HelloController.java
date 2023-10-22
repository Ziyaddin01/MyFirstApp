package com.example.myfirstapp;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;


public class HelloController {

    @FXML
    private PasswordField password_field;

    @FXML
    private Button authSigInButton;

    @FXML
    private TextField login_field;

    @FXML
    private Button loginSignUpButton;

    @FXML
    void initialize() {
        authSigInButton.setOnAction(actionEvent -> {
            System.out.println("Siz daxil ol düyməsinə kliklədiz");
        });
    }

}
