package org.example.schoolmanager.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.example.schoolmanager.DBConfig.DB;
import org.example.schoolmanager.entities.Notification;
import org.example.schoolmanager.entities.Student;
import org.example.schoolmanager.entities.Tools;
import org.example.schoolmanager.entities.User;


import javax.sql.RowSet;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;

public class UserController {
   /* @FXML
    private TextField Emailtxt;
    @FXML
    private PasswordField passwordtxt;
    public static String userparams;
    private Connection connection;
    User user = new User();
    @FXML
    private TextField usertxt;
    private String userName;
    private String password;


    public  void  onRegister(ActionEvent event){
       try {
           Tools.load(event, "Inscription", "hello-view.fxml");
       }catch (Exception e){
           e.printStackTrace();
       }
    }
    public  void  onLogin(ActionEvent event) throws Exception{
        String user = usertxt.getText();
        String email = Emailtxt.getText();
        String password = passwordtxt.getText();
        if (user.equals(" ") || email.equals("") || password.equals("")) {
            Notification.NotifError("Erreur", "Veuillez saisir tous les champs");
            Tools.load(event, "Incription", "hello-view.fxml");
        } else {
            try {
                Tools.load(event, "Connexion", "user.fxml");
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
    @FXML
    public void onSubmitRegister(ActionEvent event) throws IOException, SQLException {
        String email = Emailtxt.getText().trim();
        String password = passwordtxt.getText();

        if (!email.isEmpty() && !password.isEmpty()){
            Student student = new Student();
            student.setEmail(userName);
            student.setPassword(password);
            student.register(user);
            Tools.load(event, "Accueil", "student.fxml");
        }

    }*/

}
