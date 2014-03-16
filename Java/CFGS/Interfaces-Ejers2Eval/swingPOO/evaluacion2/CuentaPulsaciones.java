package evaluacion2;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CuentaPulsaciones implements ActionListener {
	private int numPulsaciones=0;
	JFrame frame;
	JLabel label;
	JButton boton;
	
	public CuentaPulsaciones() {
		JFrame.setDefaultLookAndFeelDecorated(true);
		frame = new JFrame("Primer evento");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		boton = new JButton("Pulsa este boton");
		boton.addActionListener(this);
		
		label = new JLabel("Sin pulsar: ");
		JPanel panel = new JPanel(new GridLayout(0,1));
		
		panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
		panel.add(boton);
		panel.add(label);
		frame.add(panel, BorderLayout.CENTER);
		frame.setSize(300,400);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		numPulsaciones++;
		label.setText("Nº de pulsaciones: "+ numPulsaciones);
	}
	
	public static void main(String[] args) {
		CuentaPulsaciones obj1 = new CuentaPulsaciones();
	}

}
