import javax.swing.*;
import javax.swing.border.Border;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Font;


import java.awt.*;
import java.awt.event.*;

public class ColorThread extends Thread{
    protected static String colorNumbers;
    protected static JTextField[] jTextFields;

    ColorThread(String givenNumbers, JTextField[] givenJTextFields){
        super();
        colorNumbers = givenNumbers;
        jTextFields = givenJTextFields;
    }

    public void run(){
        for (int i = 0; i < 6; i++) {
            if (colorNumbers.charAt(i) == '0') {
                jTextFields[i].setBackground(Color.gray);
            }
            if (colorNumbers.charAt(i) == '1') {
                jTextFields[i].setBackground(Color.yellow);
            }
            if (colorNumbers.charAt(i) == '2') {
                jTextFields[i].setBackground(Color.green);
            }

            try{
                TimeKeeper.sleep(600);
            }
            catch(InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}