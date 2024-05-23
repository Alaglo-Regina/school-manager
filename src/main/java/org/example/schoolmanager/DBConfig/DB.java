package org.example.schoolmanager.DBConfig;

import java.sql.*;

public class DB {
    public static Connection getConnection;
    private Connection cnx;
    private ResultSet rs;
    private PreparedStatement pstm;
    private int ok;
    static String host = "localhost";
    static String port = "3306";
    static String username = "root";
    static String password = "";
    static String database = "school_manager";
    static String URL = "jdbc:mysql://" + host + ":" + port + "/" + database;

    public static Connection getConnection(){
        try{
            DriverManager.getConnection(URL, username, password);
            System.out.println("Connexion à la base de données effectuée");
            return DriverManager.getConnection(URL, username, password);
        } catch (Exception e){
            System.out.println("Connexion à la base de données échouée");
            return null;
        }
    }
    public void initPrepar(String sql){
        try {
            getConnection();
            pstm = cnx.prepareStatement(sql);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public ResultSet executeSelect(){
        try {
            rs = pstm.executeQuery();
        }catch (Exception e){
            e.printStackTrace();
        }
        return rs;
    }

    public int executeMaj(){
        try {
            ok = pstm.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
        return ok;
    }

    public void closeConnection(){
        try {
            if (cnx != null){
                cnx.close();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public PreparedStatement getPstm() throws SQLException {
        return pstm;
    }

}