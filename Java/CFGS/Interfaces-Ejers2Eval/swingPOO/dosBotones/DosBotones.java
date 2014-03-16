package dosBotones;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DosBotones{
	JFrame frame;
	JPanel panel, panelBotones;
	JButton btnElegir1, btnElegir2;
	JLabel label;

	public DosBotones() {
		JFrame.setDefaultLookAndFeelDecorated(true);
		frame = new JFrame("Dos Botones");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panelBotones = new JPanel(new FlowLayout());
		panelBotones.setBorder(BorderFactory.createEmptyBorder(10, 20, 30, 20));
		btnElegir1 = new JButton("Elegir 1");
		btnElegir1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				label.setText("Has elegido la opcion 1");
			}
		});
		btnElegir2 = new JButton("Elegir 2");
		btnElegir2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText("Has elegido la opcion 2");
			}
		});
		panelBotones.add(btnElegir1);
		panelBotones.add(btnElegir2);
		
		panel = new JPanel(new BorderLayout());
		panel.setBorder(BorderFactory.createEmptyBorder(10, 40, 30, 20));
		label = new JLabel("No has elegido nada");
		panel.add(label);
		
		frame.add(panel, BorderLayout.SOUTH);
		frame.add(panelBotones, BorderLayout.NORTH);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		
	}
	
	
	public static void main(String[] args) {
		DosBotones obj1 = new DosBotones();
	}

}
