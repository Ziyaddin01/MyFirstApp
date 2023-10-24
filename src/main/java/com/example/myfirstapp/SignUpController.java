package com.example.myfirstapp;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class SignUpController {

    @FXML
    private PasswordField password_field;

    @FXML
    private TextField signUpLastName;

    @FXML
    private TextField signUpName;

    @FXML
    private TextField login_field;

    @FXML
    private CheckBox signUpCheckBoxMale;

    @FXML
    private Button signUpButton;

    @FXML
    private TextField signUpCountry;

    @FXML
    private CheckBox signUpCheckBoxFemale;

    @FXML
    void initialize(){
        signUpButton.setOnAction(actionEvent -> {

        signUpNewUser();

        });
    }

    private void signUpNewUser() {
        DatabaseHandler dbHandler = new DatabaseHandler();

        String firstName = signUpName.getText();
        String lastName = signUpLastName.getText();
        String userName = login_field.getText();
        String password = password_field.getText();
        String location = signUpCountry.getText();
        String gender = "";
        if(signUpCheckBoxMale.isSelected())
            gender = "Kişi";
        else
            gender = "Qadin";

        User user = new User(firstName,lastName, userName ,password, location, gender);

        dbHandler.signUpUser(user);

    }

}

