package org.example.schoolmanager.entities;

import org.example.schoolmanager.DBConfig.DB;
import org.example.schoolmanager.interfaces.IUser;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class User {
    private   int id;
    private  String email;
    private String password;
    private Student student;

    /*public Student getStudent() {
        return student;
    }

    public User() {
    }
    public User(int id, String email, String password) {
        this.id = id;
        this.email = email;
        this.password = password;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public boolean signIn(User user) throws SQLException {
        Connection connection = DB.getConnection();
        int rows = 0;
        if (connection != null) {
            String req = "SELECT * FROM users WHERE username = ? AND password = ?";
            PreparedStatement prepareStatement = connection.prepareStatement(req);
            prepareStatement.setString(1, user.getEmail());
            prepareStatement.setString(2, user.getPassword());
            ResultSet resultSet = prepareStatement.executeQuery();
            while (resultSet.next()) {
                rows++;
            }
            prepareStatement.close();
            connection.close();
        }
        return rows > 0;
    }*/

}
