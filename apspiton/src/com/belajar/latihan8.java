package com.belajar;
import javax.swing.JOptionPane;
public class latihan8 {
    public static void main(String[] args) {
        String nama = "";
        nama = JOptionPane.showInputDialog("masukkan nama anda: ");
        String msg = "Hello! " + nama + "!";
        JOptionPane.showMessageDialog(null, msg);
        
        
    }
}
