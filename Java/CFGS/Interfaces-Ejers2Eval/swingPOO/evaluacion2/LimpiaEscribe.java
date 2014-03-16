package evaluacion2;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LimpiaEscribe{
	JFrame frame;
	JLabel label;
	JButton btnLimpia, btnEscribe;
	
	public LimpiaEscribe() {

		frame = new JFrame("Primer evento");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		label = new JLabel(" NO SE HA PULSADO NINGUN BOTON");
		
		btnLimpia = new JButton("Limpia");
		btnLimpia.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				label.setText("");
			}
		});
		
		btnEscribe = new JButton("Escribe");
		btnEscribe.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				label.setText("Hola Mundo");
			}
		});
		
		JPanel panel = new JPanel(new FlowLayout());
		panel.add(label);
		panel.add(btnLimpia);
		panel.add(btnEscribe);
		frame.add(panel, BorderLayout.CENTER);
		frame.setSize(300,400);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		LimpiaEscribe obj1 = new LimpiaEscribe();
	}
	
	
}
