package org.example.schoolmanager.interfaces;

import org.example.schoolmanager.entities.User;

import java.sql.SQLException;

public interface IUser {
    public boolean signIn(User user);
}
