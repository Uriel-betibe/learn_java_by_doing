package com.example.calculatrice_fx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class CalculatriceApp extends Application {
    @Override
    public void start(Stage primaryStage) {

        VBox root = new VBox();
        root.setSpacing(10);

        TextField display = new TextField();
        display.setEditable(false);
        display.setPrefHeight(50);

        GridPane buttonGrid = new GridPane();
        buttonGrid.setHgap(5);
        buttonGrid.setVgap(5);

        Button button1 = new Button("1");
        Button button2 = new Button("2");
        Button buttonPlus = new Button("+");

        buttonGrid.add(button1, 0, 0); // (col=0, row=0)
        buttonGrid.add(button2, 1, 0); // (col=1, row=0)
        buttonGrid.add(buttonPlus, 2, 0); // (col=2, row=0)

        root.getChildren().addAll(display, buttonGrid);

        Scene scene = new Scene(root, 300, 400);

        primaryStage.setTitle("Calculatrice");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}