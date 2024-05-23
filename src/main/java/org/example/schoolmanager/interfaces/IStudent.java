package org.example.schoolmanager.interfaces;

import org.example.schoolmanager.entities.Student;
import org.example.schoolmanager.entities.User;

import java.sql.SQLException;

public interface IStudent {

    public Student read(int id);
    public void update(String student);
    public void delete(int id);
    public void register(User user) throws SQLException;



}
