package org.example.schoolmanager.entities;

import org.example.schoolmanager.DBConfig.DB;
import org.example.schoolmanager.interfaces.IStudent;

import java.sql.*;
import java.time.LocalDate;

public class Student extends User implements IStudent {
    private int id;
    private String firstname;
    private String lastname;
    private LocalDate dateOfBirth;
    private String placeOfBirth;
    private int state;
    private int classroom_id;

    public int getClassroom_id() {
        return classroom_id;
    }

    public void setClassroom_id(int classroom_id) {
        this.classroom_id = classroom_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public  LocalDate getDateOfBirth() {

        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPlaceOfBirth() {

        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    @Override
    public Student read(int id) {
        return null;
    }

    @Override
    public void update(String student) {

    }

    @Override
    public void delete(int id) {

    }
    @Override
    public void register(User user) throws SQLException {
        Connection connection = DB.getConnection();
        if (connection != null) {

            String req = "INSERT INTO student (firstname, lastname, dateOfBirth, placeOfBirth, state, classroom_id) VALUES (?, ?, ?, ?, ?, ?);";
            PreparedStatement preparedStatement = connection.prepareStatement(req);
            preparedStatement.setString(1, getFirstname());
            preparedStatement.setString(2, getLastname());
            preparedStatement.setDate(3, Date.valueOf(getDateOfBirth()));
            preparedStatement.setString(4, getPlaceOfBirth());
            preparedStatement.setInt(5, getState());
            preparedStatement.setInt(6, getClassroom_id());

            preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();

        }

    }


}
