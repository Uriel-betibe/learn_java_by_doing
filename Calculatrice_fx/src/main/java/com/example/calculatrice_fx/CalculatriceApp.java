package com.example.calculatrice_fx;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.lang.reflect.Array;
import java.util.Arrays;


public class CalculatriceApp extends Application {

    public int operation(int a, int b, String operator){

        switch (operator){
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
            default:
                return 0;
        }
    }

    private int firstNumber = 0;
    private String operator = "";

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


        String[][] buttonLabels = {
                {"7", "8", "9", "/"},
                {"4", "5", "6", "*"},
                {"1", "2", "3", "-"},
                {"C", "0", "=", "+"}
        };
        String[] operators = {"+", "-", "*", "/"};


        for (int i =0; i < buttonLabels.length; i++ ){
            for (int j=0; j < buttonLabels[i].length; j++){
                Button newButton = new Button(buttonLabels[i][j]);
                newButton.setPrefSize(50,50);
                newButton.setOnAction(event -> {
                    String btText =  ((Button) event.getSource()).getText();
                    if (btText.equals("=")) {
                        int secondNumber = Integer.parseInt(display.getText());
                        if(operator.equals("/") && secondNumber == 0){
                            display.setText("Error operation");
                        }
                        else {
                            int result = operation(firstNumber, secondNumber, operator);
                            display.setText(String.valueOf(result));
                        }
                    }
                    else if (Arrays.asList(operators).contains(btText)) {
                        firstNumber = Integer.parseInt(display.getText());
                        operator = btText;
                        display.clear();
                    } else if (btText.equals("C")){
                        firstNumber = 0;
                        display.clear();
                    } else {
                        display.setText(display.getText() + btText);
                    }
                });
                buttonGrid.add(newButton, j , i);
            }
        }

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