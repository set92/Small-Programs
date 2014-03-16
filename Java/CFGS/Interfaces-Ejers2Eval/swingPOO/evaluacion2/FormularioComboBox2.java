package evaluacion2;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class FormularioComboBox2 extends JFrame {

	private JPanel contentPane;
	private JTextArea textArea;
	private JComboBox<String> comboBox;
	private JComboBox<String> comboBox_1;
	private JComboBox<String> comboBox_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormularioComboBox2 frame = new FormularioComboBox2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FormularioComboBox2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRojo = new JLabel("Rojo");
		lblRojo.setBounds(10, 52, 40, 14);
		contentPane.add(lblRojo);
		
		JLabel lblVerde = new JLabel("Verde");
		lblVerde.setBounds(10, 77, 28, 25);
		contentPane.add(lblVerde);
		
		JLabel lblAzul = new JLabel("Azul");
		lblAzul.setBounds(10, 113, 46, 14);
		contentPane.add(lblAzul);
		
		comboBox = new JComboBox<String>();
		comboBox.setSize(121, 20);
		comboBox.setLocation(60, 49);
		comboBox.setMaximumRowCount(20);
		for (int i = 0; i <= 255; i++) {
			comboBox.addItem(String.valueOf(i));
		}
		contentPane.add(comboBox);
		
		comboBox_1 = new JComboBox<String>();
		comboBox_1.setBounds(60, 79, 121, 20);
		for (int i = 0; i <= 255; i++) {
			comboBox_1.addItem(String.valueOf(i));
		}
		contentPane.add(comboBox_1);
		
		comboBox_2 = new JComboBox<String>();
		comboBox_2.setMaximumRowCount(20);
		comboBox_2.setBounds(60, 110, 121, 20);
		for (int i = 0; i <= 255; i++) {
			comboBox_2.addItem(String.valueOf(i));
		}
		contentPane.add(comboBox_2);
		
		JButton btnMostrarColor = new JButton("Mostrar Color");
		btnMostrarColor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea.setBackground(new Color(Integer.parseInt(comboBox.getSelectedItem().toString()),
						Integer.parseInt(comboBox_1.getSelectedItem().toString()),
						Integer.parseInt(comboBox_2.getSelectedItem().toString())));
			}
		});
		btnMostrarColor.setBounds(39, 155, 121, 23);
		contentPane.add(btnMostrarColor);
		
		textArea = new JTextArea();
		textArea.setBounds(233, 141, 191, 110);
		contentPane.add(textArea);
	}
}
