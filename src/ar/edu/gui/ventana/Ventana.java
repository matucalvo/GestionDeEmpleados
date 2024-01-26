package ar.edu.gui.ventana;

import javax.swing.*;
import java.awt.*;
import org.jdesktop.swingx.prompt.PromptSupport;

public class Ventana {
    JFrame frame;
    
    private void iniciarVentana(){
        frame = new JFrame("Gestion de empleados");
        frame.setSize(600,400);
        frame.setVisible(true);
        JPanel panelPrincial = (JPanel) frame.getContentPane();
        panelPrincial.setLayout(new BorderLayout());
        JPanel menu = new JPanel();
        menu.setLayout(new FlowLayout());


        panelPrincial.add(crearInputs(), BorderLayout.CENTER);



        crearMenu(frame);


        JButton botonCargar = new JButton("Cargar Empleado");
        menu.add(botonCargar);

        panelPrincial.add(menu, BorderLayout.SOUTH);
    }

    public void crearMenu(Object JFrame){
        JMenuBar menuPrincipal = new JMenuBar();
        JMenu menuVer = new JMenu("Ver");
        menuPrincipal.add(menuVer);
        JMenuItem menuEmpleados = new JMenuItem("Empleados");
        menuVer.add((menuEmpleados));
        frame.setJMenuBar(menuPrincipal);
    }

    public JPanel crearInputs(){
        JPanel inputs = new JPanel();
        inputs.setLayout(new BoxLayout(inputs, BoxLayout.Y_AXIS));


        JTextField nombre = new JTextField(10);
        addPlaceholder(nombre, "Ingrese nombre");
        JTextField dni = new JTextField(10);
        addPlaceholder(dni, "Ingrese dni");
        JTextField genero = new JTextField(10);
        addPlaceholder(genero, "Ingrese genero");
        JTextField puesto = new JTextField(10);
        addPlaceholder(puesto, "Ingrese puesto");
        JTextField salario = new JTextField(10);
        addPlaceholder(salario, "Ingrese salario");

        inputs.add(nombre);
        inputs.add(dni);
        inputs.add(genero);
        inputs.add(puesto);
        inputs.add(salario);

        JPanel inputs2 = new JPanel();
        inputs2.setLayout(new FlowLayout());

        inputs2.add(inputs);

        return inputs2;

    }

    private static void addPlaceholder(JTextField textField, String placeholder) {
        PromptSupport.setPrompt(placeholder, textField);
        PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.SHOW_PROMPT, textField);
    }

    public Ventana(){
        iniciarVentana();
    }

}
