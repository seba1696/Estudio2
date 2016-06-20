/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author Casa
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MarcoVentana miMarco = new MarcoVentana();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MarcoVentana miMarco2 = new MarcoVentana();
        miMarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        miMarco.setTitle("Ventana 1");
        miMarco2.setTitle("Ventana 2");
        miMarco.setBounds(300,350,500,350);
        miMarco2.setBounds(500,500,500,500);

    }

}

class MarcoVentana extends JFrame {

    public MarcoVentana() {
        //setTitle("Respondiendo");
        //setBounds(300, 300, 500, 350);
        setVisible(true);
        M_Ventana OyenteVentana = new M_Ventana();
        addWindowListener(OyenteVentana);
    }

}

class M_Ventana implements WindowListener {

    public void windowActivated(WindowEvent e) {
        System.out.println("Ventana activada");
    }

    public void windowClosed(WindowEvent e) {
        System.out.println("La ventana a sido cerrada");
    }

    public void windowClosing(WindowEvent e) {
        System.out.println("Ventada cerrada");
    }

    public void windowDeactivated(WindowEvent e) {

    }

    public void windowDeiconified(WindowEvent e) {
        System.out.println("Ventana reustarada");
    }

    public void windowIconified(WindowEvent e) {
        System.out.println("Ventana minimizada");
    }

    public void windowOpened(WindowEvent e) {
    }
}
