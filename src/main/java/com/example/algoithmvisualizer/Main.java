package com.example.algoithmvisualizer;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application implements EventHandler<ActionEvent> {
    @Override
    public void start(Stage menuStage) throws IOException {
        //Stage scene = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("Menu.fxml"));

        //Group root = new Group();
        Scene scene = new Scene(root, Color.BLACK);
        menuStage.setHeight(1280);
        menuStage.setWidth(1280);
        menuStage.setTitle("Demo Window");
        menuStage.setScene(scene);
        menuStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void handle(ActionEvent actionEvent) {

    }
}