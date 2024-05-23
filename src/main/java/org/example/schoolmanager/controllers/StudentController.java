package org.example.schoolmanager.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.AccessibleAction;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import org.example.schoolmanager.DBConfig.DB;
import org.example.schoolmanager.entities.Student;
import org.example.schoolmanager.entities.Tools;
import org.example.schoolmanager.entities.User;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class StudentController {

    @FXML
    private TableColumn<?, ?> idColumn;

    @FXML
    private TableColumn<?, ?> nomColumn;

    @FXML
    private TextField nomTxt;

    @FXML
    private TableColumn<?, ?> prenomColumn;

    @FXML
    private TextField prenomTxt;

    @FXML
    private Button supprimerBt;

    @FXML
    private TableColumn<?, ?> telColumn;
    @FXML
    private TextField telTxt;

    @FXML
    private DatePicker Bithtxt;
    @FXML
    private TextField placetxt;
    @FXML
    private TextField classtxt;
    @FXML
    private TextField statetxt;
    @FXML
    private TableColumn<?, ?> classColum;




    public void onSubmitUser() throws SQLException {
        String firstname = nomTxt.getText().trim();
        String lastname = prenomTxt.getText();
        LocalDate dateOfBirth = Bithtxt.getValue();
        String placeOfBirth = placetxt.getText();
        int state = Integer.parseInt(statetxt.getText());
        int classroom_id = Integer.parseInt(classtxt.getText());


        /*if (!firstname.isEmpty() && !lastname.isEmpty() && !dateOfBirth.isEmpty() && !placeOfBirth.isEmpty()){
            Student student = new Student();
            student.setFirstname(firstname);
            student.setLastname(lastname);
            student.setDateOfBirth(dateOfBirth);
            student.setPlaceOfBirth(placeOfBirth);
            student.setState(state);


            student.register(user);
            Tools.load(event, "Accueil", "student.fxml");
        }*/
        Student student = new Student();
        student.setFirstname(firstname);
        student.setLastname(lastname);
        student.setDateOfBirth(dateOfBirth);
        student.setPlaceOfBirth(placeOfBirth);
        student.setState(state);
        student.setClassroom_id(classroom_id);
        student.register(student);

    }

}

    /*public void initialize(URL url, ResourceBundle resourceBundle) {
        /*idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        nomColumn.setCellValueFactory(new PropertyValueFactory<>("nom"));
        prenomColumn.setCellValueFactory(new PropertyValueFactory<>("prenom"));
        classColum.setCellValueFactory(new PropertyValueFactory<>("classe"));

        load();

    }
    @FXML
    public void insert(Student student) throws SQLException {
        Connection connection = DB.getConnection();
        if (connection != null) {
            String req = "INSERT INTO student (firstname, lastname, dateOfBirth, placeOfBirth, state) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement prepareStatement = connection.prepareStatement(req);
            prepareStatement.setString(1, student.getFirstname());
            prepareStatement.setString(2, student.getLastname());
            prepareStatement.setDate(3, Date.valueOf(student.getDateOfBirth()));
            prepareStatement.setString(4, student.getPlaceOfBirth());
            prepareStatement.setInt(5, student.getState());

            int row = prepareStatement.executeUpdate();
            System.out.printf(String.valueOf(row));
            prepareStatement.close();
            connection.close();
        }
    }

    @FXML
    public void onSubmitRegister(ActionEvent event) throws IOException, SQLException {
        String firstname = nomTxt.getText().trim();
        String lastname = prenomTxt.getText();
        String classe = classtxt.getText();
        String dateOfBirth = Bithtxt.getText();
        String placeOfBirth = placetxt.getText();

        if (!firstname.isEmpty() && !lastname.isEmpty() && !classe.isEmpty() && !dateOfBirth.isEmpty() && !placeOfBirth.isEmpty()){
            Student student = new Student();
            student.setFirstname(firstname);
            student.setLastname(lastname);
            student.setDateOfBirth(LocalDate.parse(dateOfBirth));
            student.setPlaceOfBirth(placeOfBirth);
            student.insert(student);
        }

    }


    public  void onSubmit(ActionEvent event){
        try {
            Tools.load(event,"Accueil", "student.fxml");
        }catch (Exception e){
            e.printStackTrace();
        }
    }


    @FXML
    void delete(ActionEvent event) {

    }

    @FXML
    void update(ActionEvent event) {

    }

}*/
