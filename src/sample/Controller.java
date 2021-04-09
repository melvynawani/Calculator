package sample;
/*
       AUTHOR: ORITSETSEYI MELVYN AWANI
       PROJECT DETAILS: A CALCULATOR TO HANDLE BASIC MATHEMATICAL COMPUTATIONS
 */

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class Controller {

    @FXML
    private Button button1;

    @FXML
    private Button button2;

    @FXML
    private Button button3;

    @FXML
    private Button button4;

    @FXML
    private Button button5;

    @FXML
    private Button button6;

    @FXML
    private Button button7;

    @FXML
    private Button button8;

    @FXML
    private Button button9;

    @FXML
    private Button button0;

    @FXML
    private Button buttonAdd;

    @FXML
    private Button buttonSubtract;

    @FXML
    private Button buttonEquals;

    @FXML
    private TextArea textArea;

    @FXML
    private Button resetButton;

    double result;
    double value;
    double value1;
    String valueAsString="";
    String value1AsString="";
    char operation='z';
    private static final long serialVersionUID = 4085088731926701167L;

    //Function to handle inputs (When buttons are pressed)
    public void onPressButton1() {
        System.out.println("1 was pressed");
        valueAsString+="1";
        value= Double.parseDouble(valueAsString);
        textArea.setText(valueAsString);
        System.out.println(value);
    }
    public void onPressButton2() {
        System.out.println("2 was pressed");
        valueAsString+="2";
        value= Double.parseDouble(valueAsString);
        textArea.setText(valueAsString);
        System.out.println(value);
    }
    public void onPressButton3() {
        System.out.println("3 was pressed");
        valueAsString+="3";
        value= Double.parseDouble(valueAsString);
        textArea.setText(valueAsString);
        System.out.println(value);
    }
    public void onPressButton4() {
        System.out.println("4 was pressed");
        valueAsString+="4";
        value= Double.parseDouble(valueAsString);
        textArea.setText(valueAsString);
        System.out.println(value);
    }
    public void onPressButton5() {
        System.out.println("5 was pressed");
        valueAsString+="5";
        value= Double.parseDouble(valueAsString);
        textArea.setText(valueAsString);
        System.out.println(value);
    }
    public void onPressButton6() {
        System.out.println("6 was pressed");
        valueAsString+="6";
        value= Double.parseDouble(valueAsString);
        textArea.setText(valueAsString);
        System.out.println(value);
    }
    public void onPressButton7() {
        System.out.println("7 was pressed");
        valueAsString+="7";
        value= Double.parseDouble(valueAsString);
        textArea.setText(valueAsString);
        System.out.println(value);
    }
    public void onPressButton8() {
        System.out.println("8 was pressed");
        valueAsString+="8";
        value= Double.parseDouble(valueAsString);
        textArea.setText(valueAsString);
        System.out.println(value);
    }
    public void onPressButton9() {
        System.out.println("9 was pressed");
        valueAsString+="9";
        value= Double.parseDouble(valueAsString);
        textArea.setText(valueAsString);
        System.out.println(value);
    }
    public void onPressButton0() {
        System.out.println("0 was pressed");
        valueAsString+="0";
        value= Double.parseDouble(valueAsString);
        textArea.setText(valueAsString);
        System.out.println(value);
    }

    //Buttons to handle Mathematical Operations
    public void onPressAddButton() {
        System.out.println("+ button was pressed.");
        value1 = value;
        value=0;
        valueAsString="";
        operation='+';
        textArea.setText("+");
    }
    public void onPressSubtractButton(){
        System.out.println("- button was pressed.");
        operation='-';
        value1 = value;
        value=0;
        valueAsString="";
        textArea.setText("-");
    }
    public void onPressDivideButton(){
        System.out.println("// button was pressed.");
        operation='/';
        value1 = value;
        value=0;
        valueAsString="";
        textArea.setText("/");
    }
    public void onPressMultiplyButton(){
        System.out.println("x button was pressed.");
        operation='x';
        value1 = value;
        value=0;
        valueAsString="";
        textArea.setText("x");
    }
    public void onPressEqualButton(){
        System.out.println("= button was pressed.");

        switch (operation){
            case '+':
                System.out.println("Addition was carried out");
                result= value1 + value;
                System.out.println(result);
                textArea.setText(""+result);
                value=result;
                operation='z';
                valueAsString="";
                break;

            case '-':
                System.out.println("Subtraction was carried out");
                result= value1 - value;
                System.out.println(result);
                textArea.setText(""+result);
                value=result;
                valueAsString="";
                operation='z';

                break;

            case 'x':
                System.out.println("Multiplication was carried out");
                result= value1 * value;
                System.out.println(result);
                textArea.setText(""+result);
                value=result;
                valueAsString="";
                operation='z';
                break;

            case '/':
                System.out.println("Division was carried out");
                result= value1 / value;
                System.out.println(result);
                textArea.setText(""+result);
                value=result;
                valueAsString="";
                operation='z';
                break;

            case 'z':
                valueAsString="";
                break;

            default:
                System.out.println("Default.");
                valueAsString="";
                break;
        }
        if(operation =='z'){
            System.out.println("Do nothing");
        }
        else{
            textArea.setText(""+result);
        }
    }
    public void onPressResetButton(){
        System.out.println("The C (Reset) button was pressed");
        value1AsString="";
        valueAsString="";
        valueAsString="";
        value=0;
        value1=0;
        textArea.setText("");
    }


}
