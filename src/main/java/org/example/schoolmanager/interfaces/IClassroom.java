package org.example.schoolmanager.interfaces;

import org.example.schoolmanager.entities.Classroom;
import org.example.schoolmanager.entities.Student;

public interface IClassroom {
    public void create(String classroom);
    public Classroom read(int id);
    public void update(String classroom);
    public void delete(int id);
}
