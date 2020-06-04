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
public class Latihan11 {
    public static void main (String args[]){
        JFrame frame = new JFrame ("demo html");
        
        String html="<html>\n"+"contoh penggunaan HTML demo label:\n"+"<ul>\n"+
                "<li><font color=red>merah</font>\n"+
                "<li><font color=green>hijau</font>\n"+
                "<li><font color=yellow>kuning</font>\n"+
                "<li><font size=-2>dilangit yang</font>\n"+
                "<li><font color=blue>biru</font>\n"+
                
                "<li><font size=-2>bintang kecil ??</font>\n"+
                "<li><font size=+2>Besar ??</font>\n"+
                "<li><i>italic</font>\n"+
                "<li><b>blod</font>\n"+
                "</ul>\n";
        
        JLabel label = new JLabel(html);
        frame.getContentPane().add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.show();
    }  
}
