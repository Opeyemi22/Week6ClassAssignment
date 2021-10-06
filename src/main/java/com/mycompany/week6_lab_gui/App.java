package com.mycompany.week6_lab_gui;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {
Label label;
TextField tf; 
    @Override
    public void start(Stage stage) {

        label = new Label("Hello, Opey The King");
        
        Button btnl = new Button("Click On Me Please !! "); 
        btnl.setLayoutX(50); 
        btnl.setLayoutY(50); 
        btnl.setOnAction ((v) -> {
        label.setText("I Clicked The Button !!" + ((Button)v.getSource()).getText()); 
        });
        
        Button btn2 = new Button("Button #2 "); 
        btn2.setLayoutX(250);
        btn2.setLayoutY(50);
        btn2.setOnAction(this::processBttn2);
        
        
        tf = new TextField(" "); 
        tf.setLayoutX(250);
        tf.setLayoutY(250);
        
        Group gp = new Group(label,btnl,btn2,tf);
        var scene = new Scene(gp, 640, 480);
        stage.setScene(scene);
        stage.setTitle("GUI Demonstration");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    private void processBttn2(ActionEvent arg0){
    
    String cntn = tf.getText().trim(); 
    int nm = Integer.parseInt(cntn); 
    tf.setText("" + (nm  * 1000)); 
    label.setTextFill(Color.RED);
    
    
    }
}