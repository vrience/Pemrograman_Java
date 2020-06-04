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
public class Kasus2 {

    public static void main(String args[]) {
        JFrame frame = new JFrame("Program Latihan 2");
        
        JTextField txtfield = new JTextField("");
        String html="<html>\n"+"<ul>\n"+
                "<li>aku\n"+
                "<li>sedang\n"+
                "<li>belajar\n"+
                "<li>pemrograman jav\n"+
                "<li>bersama\n"+
                "<li>teman-teman"+
                "</ul>\n";
        
        JLabel label = new JLabel(html);
        JButton btn1 = new JButton("ADD");
        JButton btn2 = new JButton("CLEAR");
        
        GridLayout layout = new GridLayout(4,2);
        layout.setHgap(5);
        layout.setVgap(10);
        
        frame.getContentPane().setLayout(layout);
        frame.getContentPane().add(label);
        frame.getContentPane().add(txtfield);
        frame.getContentPane().add(btn1);
        frame.getContentPane().add(btn2);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.show();
    }
}
