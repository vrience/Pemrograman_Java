/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu13_juvrience;

/**
 * Nama : Juvrience Marcius Lim
 * NIM : 50170035
 */
import javax.swing.*;
import java.awt.*;

public class Latihan12 {

    public static void main(String args[]) {
        JFrame frame = new JFrame("textfield");
        JTextField text1, text2, text3, text4;
        text1=new JTextField("text 1");
        text2=new JTextField("text 2");
        text3=new JTextField("text 3");
        text4=new JTextField("text 4");
        
        Box panel = new Box (BoxLayout.Y_AXIS);
        panel.add(text1);
        panel.add(text2);
        panel.add(text3);
        panel.add(text4);

        frame.getContentPane().setLayout(new FlowLayout(FlowLayout.LEFT));
        frame.getContentPane().add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.show();
    }
}
