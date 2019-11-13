import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import java.util.ArrayList;

public class Calculator extends Application implements EventHandler<ActionEvent> {

    //initierar knappar så att det går att använda dem i hela klassen
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
    Button buttonClear;
    Button buttonPoint;

    //skapar 2 textareas
    public static TextField textArea = new TextField();
    public static TextField textOutput = new TextField();


    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) {

        //Gör så att man inte kan skriva in via tangentbordet
        textArea.setDisable(true);
        textOutput.setDisable(true);

        textArea.setMinSize(100, 50);
        //Skapar knappar och ger dem en storlek och action. Delar även ut position i GridPane.
        button1 = new Button("1");
        button1.setOnAction(this);
        button1.setMinSize(50,50);
        button1.setMaxSize(50,50);
        GridPane.setConstraints(button1, 0,0);

        button2 = new Button("2");
        button2.setOnAction(this);
        button2.setMinSize(50,50);
        button2.setMaxSize(50,50);
        GridPane.setConstraints(button2, 1,0);

        button3 = new Button("3");
        button3.setOnAction(this);
        button3.setMinSize(50,50);
        button3.setMaxSize(50,50);
        GridPane.setConstraints(button3, 2,0);

        button4 = new Button("4");
        button4.setOnAction(this);
        button4.setMinSize(50,50);
        button4.setMaxSize(50,50);
        GridPane.setConstraints(button4, 0,1);

        button5 = new Button("5");
        button5.setOnAction(this);
        button5.setMinSize(50,50);
        button5.setMaxSize(50,50);
        GridPane.setConstraints(button5, 1,1);

        button6 = new Button("6");
        button6.setOnAction(this);
        button6.setMinSize(50,50);
        button6.setMaxSize(50,50);
        GridPane.setConstraints(button6, 2,1);

        button7 = new Button("7");
        button7.setOnAction(this);
        button7.setMinSize(50,50);
        button7.setMaxSize(50,50);
        GridPane.setConstraints(button7, 0,2);

        button8 = new Button("8");
        button8.setOnAction(this);
        button8.setMinSize(50,50);
        button8.setMaxSize(50,50);
        GridPane.setConstraints(button8, 1,2);

        button9 = new Button("9");
        button9.setOnAction(this);
        button9.setMinSize(50,50);
        button9.setMaxSize(50,50);
        GridPane.setConstraints(button9, 2,2);

        button10 = new Button("0");
        button10.setOnAction(this);
        button10.setMinSize(50,50);
        button10.setMaxSize(50,50);
        GridPane.setConstraints(button10, 1,3);

        buttonPlus = new Button("+");
        buttonPlus.setOnAction(this);
        buttonPlus.setMinSize(50,50);
        buttonPlus.setMaxSize(50,50);
        GridPane.setConstraints(buttonPlus, 3,0);

        buttonMinus = new Button("-");
        buttonMinus.setOnAction(this);
        buttonMinus.setMinSize(50,50);
        buttonMinus.setMaxSize(50,50);
        GridPane.setConstraints(buttonMinus, 3,1);

        buttonDivide = new Button("/");
        buttonDivide.setOnAction(this);
        buttonDivide.setMaxSize(50,50);
        GridPane.setConstraints(buttonDivide, 3, 2);

        buttonMultiply = new Button("*");
        buttonMultiply.setOnAction(this);
        buttonMultiply.setMinSize(50,50);
        buttonMultiply.setMaxSize(50,50);
        GridPane.setConstraints(buttonMultiply,3,3);

        buttonCalc = new Button ("=");
        buttonCalc.setOnAction(this);
        buttonCalc.setMinSize(50,50);
        buttonCalc.setMaxSize(50,50);
        GridPane.setConstraints(buttonCalc, 4,1);

        buttonClear = new Button ("C");
        buttonClear.setOnAction(this);
        buttonClear.setMinSize(50,50);
        buttonClear.setMaxSize(50,50);
        GridPane.setConstraints(buttonClear,4,0);

        buttonPoint = new Button (".");
        buttonPoint.setOnAction(this);
        buttonPoint.setMinSize(50,50);
        buttonPoint.setMaxSize(50,50);
        GridPane.setConstraints(buttonPoint,2,3);

        //Initierar BorderPane och GridPane
        BorderPane root = new BorderPane();

        GridPane grid = new GridPane();

        //Gör så att alla knappar visas i grid.
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
        grid.getChildren().add(buttonCalc);
        grid.getChildren().add(buttonClear);
        grid.getChildren().add(buttonPoint);

        //Sätter ut platser i BorderPane
        root.setCenter(grid);
        root.setTop(textArea);
        root.setRight(textOutput);

        Scene scene = new Scene(root, 500, 500);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @Override
    //Den här metoden skriver ut något av 1234567890+-/* i textArea.
    // = kör calc, vilket gör att den räknar ut vad som står i textArea
    // C tar bort allt som är skrivet i textArea och textOutput
    public void handle(ActionEvent event) {
        if (event.getSource() == button1){
            textArea.appendText("1");
        } else if (event.getSource() == button2){
            textArea.appendText("2");
        }else if (event.getSource() == button3){
            textArea.appendText("3");
        }else if (event.getSource() == button4){
            textArea.appendText("4");
        }else if (event.getSource() == button5){
            textArea.appendText("5");
        }else if (event.getSource() == button6){
            textArea.appendText("6");
        }else if (event.getSource() == button7){
            textArea.appendText("7");
        }else if (event.getSource() == button8){
            textArea.appendText("8");
        }else if (event.getSource() == button9){
            textArea.appendText("9");
        }else if (event.getSource() == button10) {
            textArea.appendText("0");
        }else if (event.getSource() == buttonPlus) {
            textArea.appendText("+");
        }else if (event.getSource() == buttonMinus) {
            textArea.appendText("-");
        }else if (event.getSource() == buttonDivide) {
            textArea.appendText("/");
        }else if (event.getSource() == buttonMultiply) {
            textArea.appendText("*");
        } else if (event.getSource() == buttonCalc) {
            calc();
        } else if (event.getSource() == buttonClear){
            textArea.clear();
            textOutput.clear();
        } else if (event.getSource() == buttonPoint){
            textArea.appendText(".");
        }
    }
    //Tagen från genomgång med Joakim
    //metod för att räkna
    public static void calc() {

        //eq = det som är inskrivet i textArea
        String eq = textArea.getText();

        //arr = alla splittade tecken
        String[] arr = eq.split("");

        ArrayList<String> list = new ArrayList<String>();

        //number används för att räkna i loopen
        String number = "";

        //Loopen kallar på metoden "isNumeric" vilket kollar om tecknet i arrayen är en siffra eller inte.
        for (int i = 0; i < arr.length; i++) {
            if(isNumeric(arr[i]) || arr[i].contains(".")){
                number += arr[i];
            } else{
                list.add(number);
                number = "";
                list.add(arr[i]);
            }
        }
        list.add(number);

        //Kollar vilken symbol man har använt. Räknar med samma räknesätt som är inskrivet.
        //räknar inte enligt prioriteringsreglerna
        double tal1 = 0;

        for (int i = 0; i < list.size(); i++) {

            if(i%2 == 0){
                tal1 = Double.parseDouble(list.get(i));
            }
            else {
                if(list.get(i).equals("+")){
                    tal1 = tal1 + Double.parseDouble(list.get(i+1));
                }
                if(list.get(i).equals("-")){
                    tal1 = tal1 - Double.parseDouble(list.get(i+1));
                }
                if(list.get(i).equals("*")){
                    tal1 = tal1 * Double.parseDouble(list.get(i+1));
                }
                if(list.get(i).equals("/")){
                    tal1 = tal1 / Double.parseDouble(list.get(i+1));
                }
                String result = String.valueOf(tal1);
                textOutput.appendText(result);
            }
        }
    }
    //metod som kollar om ett tecken är numeriskt eller inte.
    private static boolean isNumeric(String s) {
        if ("1234567890".contains(s)){
            return true;
        } else{
            return false;
        }
    }
}
