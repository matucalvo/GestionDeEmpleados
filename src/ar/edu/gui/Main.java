package ar.edu.gui;

import ar.edu.gui.ventana.Ventana;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Ventana ventana = new Ventana();
            }
        });

    }
}