package com.example.algoithmvisualizer;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FRACTAL extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Group fractal = new Group();
        Scene fractalScene = new Scene(fractal);
        stage.setWidth(1080);
        stage.setHeight(1080);
        stage.setTitle("3D Fractal World");


    }
}
