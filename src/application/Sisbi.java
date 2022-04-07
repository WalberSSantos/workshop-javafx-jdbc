package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Sisbi extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
        
    }

    @Override
    public void start(Stage stage) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/gui/telaPrincipal.fxml"));
            Parent parent = fxmlLoader.load();
            Scene scene = new Scene(parent);
            stage.setTitle("Sistema de Biblioteca");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
