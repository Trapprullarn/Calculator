import javafx.application.Application;
import javafx.stage.Stage;

import java.util.ArrayList;

public class asdf extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {


        //Ruta som innehåller string

        String eq = "10+2-3+4";

        String[] arr = eq.split("");
        //{"1","2","3","4"}

        ArrayList<String> list = new ArrayList<String>();
        String number = "";
        for (int i = 0; i < arr.length; i++) {
            if(isNumeric(arr[i])){
                number += arr[i];

            } else{
                list.add(number);
                number = "";
                list.add(arr[i]);
            }

        }
        list.add(number);
        System.out.println(list);

        int tal1 = 0;
        for (int i = 0; i < list.size(); i++) {

            if(i%2 == 0){
                tal1 = Integer.parseInt(list.get(i));
            }
            else {
                if(list.get(i).equals("+")){
                    tal1 = tal1 + Integer.parseInt(list.get(i+1));
                }
                if(list.get(i).equals("-")){
                    tal1 = tal1 - Integer.parseInt(list.get(i+1));
                }
                if(list.get(i).equals("*")){
                    tal1 = tal1 * Integer.parseInt(list.get(i+1));
                }
                if(list.get(i).equals("/")){
                    tal1 = tal1 / Integer.parseInt(list.get(i+1));
                }

            }

            System.out.println(tal1);
        }
    }

    private boolean isNumeric(String s) {
        if ("1234567890".contains(s)){
            return true;
        } else{
            return false;
        }
    }
}
