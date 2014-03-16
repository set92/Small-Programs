package es.reutilizable;

import javax.swing.*;

import java.awt.*;

public class Main extends JFrame{
	
//	Contructor de la clase
	public Main() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException{
		super("Titulo de la ventana");
		setSize(696, 416);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
		
		FlowLayout flotante = new FlowLayout();
		getContentPane().setLayout(flotante);
		
		JTextPane textPane = new JTextPane();
		getContentPane().add(textPane);
		
		JButton btnNewButton = new JButton("New button");
		getContentPane().add(btnNewButton);
		
		setVisible(true);
	}
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		Main ventana = new Main();
		Reloj reloj = new Reloj();
		
		
		JButton boton1 = new JButton("Aceptar");
		JTextField campo1 = new JTextField(15);
		JButton boton2 = new JButton("Cancelar");
		
		ventana.getContentPane().add(reloj);
		ventana.getContentPane().add(campo1);
		ventana.getContentPane().add(boton1);
		ventana.getContentPane().add(boton2);
		
		ventana.getContentPane().setBackground(new Color(255, 100, 100));
		ventana.setLocationRelativeTo(null);
//		Hay que poner el setvisible tambien al final puesto que algunos objetos no se muestran correctamente al inicio
//		aunque al agrandar la ventana del programa suelen aparecer.
		ventana.setVisible(true);
		
	}
}
