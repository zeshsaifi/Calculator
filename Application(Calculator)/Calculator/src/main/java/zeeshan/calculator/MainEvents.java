package zeeshan.calculator;

import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class MainEvents implements Initializable {

    Double f,s;
    String o,answer;
    @FXML
    private AnchorPane mainpanel;
    @FXML
    private TextField field;
    @FXML
    private Label addNumber;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        FadeTransition t=new FadeTransition(Duration.seconds(2));
        t.setNode(mainpanel);
        t.setFromValue(0.0);
        t.setToValue(1.0);
        t.play();
    }

    public void c(ActionEvent e){
        field.setText("");
        addNumber.setText("");
    }

    public void b(ActionEvent e){
        String bsp = null;
        if(field.getText().length() <= 0) {
            System.out.println("Empty");
        }
        else
        {
            StringBuilder strB = new StringBuilder(field.getText());
            strB.deleteCharAt(field.getText().length() - 1);
            bsp = strB.toString();
            field.setText(bsp);

        }
    }
    public void div(ActionEvent e){
        addNumber.setText(field.getText()+"÷");
        f = Double.parseDouble(field.getText());
        field.setText("");
        o=("/");
    }

    public void mul(ActionEvent e){
        addNumber.setText(field.getText()+"X");
        f = Double.parseDouble(field.getText());
        field.setText("");
        o=("*");
    }

    public void seven(ActionEvent e){
        field.setText(field.getText()+"7");
    }

    public void eight(ActionEvent e){
        field.setText(field.getText()+"8");
    }

    public void nine(ActionEvent e){
        field.setText(field.getText()+"9");
    }

    public void sub(ActionEvent e){
        addNumber.setText(field.getText()+"-");
        f = Double.parseDouble(field.getText());
        field.setText("");
        o=("-");
    }

    public void four(ActionEvent e){
        field.setText(field.getText()+"4");
    }

    public void five(ActionEvent e){
        field.setText(field.getText()+"5");
    }

    public void six(ActionEvent e){
        field.setText(field.getText()+"6");
    }

    public void sum(ActionEvent e){
        addNumber.setText(field.getText()+"+");
        f = Double.parseDouble(field.getText());
        field.setText("");
        o=("+");
    }

    public void one(ActionEvent e){
        field.setText(field.getText()+"1");
    }

    public void two(ActionEvent e){
        field.setText(field.getText()+"2");
    }

    public void three(ActionEvent e){
        field.setText(field.getText()+"3");
    }

    public void pi(ActionEvent e){
        field.setText("3.141592653589793238");
    }

    public void zero(ActionEvent e){
        field.setText(field.getText()+"0");
    }

    public void dot(ActionEvent e){
        if(field.getText().contains(".")){
            System.out.println("null");
        }
        else{
            field.setText(field.getText() + ".");
        }
    }

    public void equalto(ActionEvent e){
        addNumber.setText("");
        if (Objects.equals(o, "+"))
        {
            s = Double.parseDouble(field.getText());
            answer = String.valueOf(f + s);
            field.setText(answer);
        }
        if (Objects.equals(o, "*"))
        {
            s = Double.parseDouble(field.getText());
            answer = String.valueOf(f * s);
            field.setText(answer);
        }
        if (Objects.equals(o, "/"))
        {
            s = Double.parseDouble(field.getText());
            answer = String.valueOf(f / s);
            field.setText(answer);
        }
        if (Objects.equals(o, "-"))
        {
            s = Double.parseDouble(field.getText());
            answer = String.valueOf(f - s);
            field.setText(answer);
        }
    }
}