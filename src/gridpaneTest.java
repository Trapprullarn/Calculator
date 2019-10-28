import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

import javax.swing.*;
import java.awt.*;

public class gridpaneTest extends Application implements EventHandler<ActionEvent> {

    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button button10;
    Button buttonPlus;
    Button buttonMinus;
    Button buttonDivide;
    Button buttonMultiply;
    Button buttonCalc;

    public TextArea textInput = new TextArea();
    public TextArea textOutput = new TextArea();

    textOutput.setEditable(false);

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) {

        button1 = new Button("1");
        button1.setOnAction(this);
        GridPane.setConstraints(button1, 0,0);

        button2 = new Button("2");
        button2.setOnAction(this);
        GridPane.setConstraints(button2, 1,0);

        button3 = new Button("3");
        button3.setOnAction(this);
        GridPane.setConstraints(button3, 2,0);

        button4 = new Button("4");
        button4.setOnAction(this);
        GridPane.setConstraints(button4, 0,1);

        button5 = new Button("5");
        button5.setOnAction(this);
        GridPane.setConstraints(button5, 1,1);

        button6 = new Button("6");
        button6.setOnAction(this);
        GridPane.setConstraints(button6, 2,1);

        button7 = new Button("7");
        button7.setOnAction(this);
        GridPane.setConstraints(button7, 0,2);

        button8 = new Button("8");
        button8.setOnAction(this);
        GridPane.setConstraints(button8, 1,2);

        button9 = new Button("9");
        button9.setOnAction(this);
        GridPane.setConstraints(button9, 2,2);

        button10 = new Button("0");
        button10.setOnAction(this);
        GridPane.setConstraints(button10, 1,3);

        buttonPlus = new Button("+");
        buttonPlus.setOnAction(this);
        GridPane.setConstraints(buttonPlus, 3,0);

        buttonMinus = new Button("-");
        buttonMinus.setOnAction(this);
        GridPane.setConstraints(buttonMinus, 3,1);

        buttonDivide = new Button("/");
        buttonDivide.setOnAction(this);
        GridPane.setConstraints(buttonDivide, 3, 2);

        buttonMultiply = new Button("*");
        buttonMultiply.setOnAction(this);
        GridPane.setConstraints(buttonMultiply,3,3);

        buttonCalc = new Button ("=");
        buttonCalc.setOnAction(this);
        GridPane.setConstraints(buttonCalc, );


        BorderPane root = new BorderPane();

        GridPane grid = new GridPane();

        grid.setTranslateX(125);

        grid.getChildren().add(button1);
        grid.getChildren().add(button2);
        grid.getChildren().add(button3);
        grid.getChildren().add(button4);
        grid.getChildren().add(button5);
        grid.getChildren().add(button6);
        grid.getChildren().add(button7);
        grid.getChildren().add(button8);
        grid.getChildren().add(button9);
        grid.getChildren().add(button10);
        grid.getChildren().add(buttonPlus);
        grid.getChildren().add(buttonMinus);
        grid.getChildren().add(buttonDivide);
        grid.getChildren().add(buttonMultiply);

        root.setCenter(grid);
        root.setTop(textOutput);
        Scene scene = new Scene(root, 300, 300);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    @Override
    public void handle(ActionEvent event) {
        if (event.getSource() == button1){
            System.out.println("1");
        } else if (event.getSource() == button2){
            System.out.println("2");
        }else if (event.getSource() == button3){
            System.out.println("3");
        }else if (event.getSource() == button4){
            System.out.println("4");
        }else if (event.getSource() == button5){
            System.out.println("5");
        }else if (event.getSource() == button6){
            System.out.println("6");
        }else if (event.getSource() == button7){
            System.out.println("7");
        }else if (event.getSource() == button8){
            System.out.println("8");
        }else if (event.getSource() == button9){
            System.out.println("9");
        }else if (event.getSource() == button10) {
            System.out.println("0");
        }else if (event.getSource() == buttonPlus) {
            System.out.println("+");
        }else if (event.getSource() == buttonMinus) {
            System.out.println("-");
        }else if (event.getSource() == buttonDivide) {
            System.out.println("/");
        }else if (event.getSource() == buttonMultiply) {
            System.out.println("*");
        }
    }
}
