package org.example.schoolmanager.entities;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.example.schoolmanager.Main;

import java.io.IOException;
import java.util.Objects;

public class Tools {
    private void loadPage(ActionEvent event, String title, String url) throws IOException{

        ((Node) event.getSource()).getScene().getWindow().hide();

        Parent root = FXMLLoader.load(Objects.requireNonNull(Main.class.getResource(url)));
        Scene scene = new Scene(root);

        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle(title);

        stage.show();
    }
    private void loadSubPage(ActionEvent event, String title, String url) throws IOException {

        Parent root = FXMLLoader.load(Objects.requireNonNull(Main.class.getResource(url)));
        Scene scene = new Scene(root);

        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle(title);

        stage.showAndWait();

    }

    public static void load(ActionEvent event, String title, String url) throws IOException {

        Tools outils = new Tools();
        outils.loadPage(event, title, url);
    }

    public static void loadSub(ActionEvent event, String title, String url) throws IOException {

        Tools outils = new Tools();
        outils.loadSubPage(event, title, url);
    }

}
