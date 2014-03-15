package com.oracle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginController {
    Logger logger = LoggerFactory.getLogger(LoginController.class);
    @FXML private Text actiontarget;
    @FXML private TextField nameField;
    @FXML private PasswordField passwordField;

    @FXML protected void handleSubmitButtonAction(ActionEvent event) {
        logger.info("name[password] : {}[{}]", nameField.getText(), passwordField.getText());
        actiontarget.setText("Sign in button pressed");
    }
}
