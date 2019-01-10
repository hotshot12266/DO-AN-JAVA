/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uilt;

import javax.swing.JOptionPane;

/**
 *
 * @author nhuta
 */
public class Alert {
    // yes = 0; 
    // no = 1; 

    public static int showConfirmDialog(String Title, String Messages) {
        return JOptionPane.showConfirmDialog(null, Messages, Title, JOptionPane.YES_NO_OPTION);
    }

    public static void showMessages(String Messages) {
        JOptionPane.showMessageDialog(null, Messages);
    }
}
