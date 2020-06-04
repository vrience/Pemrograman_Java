/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu13_juvrience;

import javax.swing.*;
import java.awt.*;

/**
 * Nama : Juvrience Marcius Lim
 * NIM : 50170035
 */
public class Kasus1 {

    public static void main(String args[]) {
        JFrame frame = new JFrame("GUI Swing");
        
        JLabel label1 = new JLabel("String I");
        JLabel label2 = new JLabel("String II");
        JLabel label3 = new JLabel("Hasil");
        JTextArea txt1 = new JTextArea("    ");
        JTextArea txt2 = new JTextArea("        ");
        JTextArea txt3 = new JTextArea("            ");
        JButton btn1 = new JButton("PROSES");
        JButton btn2 = new JButton("HAPUS");
        
        GridLayout layout = new GridLayout(4,2);
        layout.setHgap(5);
        layout.setVgap(10);
        
        frame.getContentPane().setLayout(layout);
        frame.getContentPane().add(label1);
        frame.getContentPane().add(txt1);
        frame.getContentPane().add(label2);
        frame.getContentPane().add(txt2);
        frame.getContentPane().add(label3);
        frame.getContentPane().add(txt3);
        frame.getContentPane().add(btn1);
        frame.getContentPane().add(btn2);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.show();
    }
}
