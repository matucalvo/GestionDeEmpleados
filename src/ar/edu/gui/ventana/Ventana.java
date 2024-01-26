package ar.edu.gui.ventana;

import javax.swing.*;

public class Ventana {
    JFrame frame;
    
    private void iniciarVentana(){
        frame = new JFrame("Gestion de empleados");
        frame.setSize(400,100);
        frame.setVisible(true);
        JButton botonCargar = new JButton("Cargar Empleado");
        JPanel panelPrincial = (JPanel) frame.getContentPane();
    }

    public Ventana(){
        iniciarVentana();
    }

}
