package org.example.schoolmanager.entities;

import javafx.scene.control.Alert;

public class Notification {
        public static void NotifSucces(String title, String msg){
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle(title);
            alert.setContentText(msg);
            alert.showAndWait();
        }

        public static void NotifError(String title, String mgs){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle(title);
            alert.setContentText(mgs);
            alert.showAndWait();
        }


}
