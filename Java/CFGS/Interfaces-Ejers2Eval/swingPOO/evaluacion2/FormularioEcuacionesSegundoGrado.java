package evaluacion2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class FormularioEcuacionesSegundoGrado extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormularioEcuacionesSegundoGrado frame = new FormularioEcuacionesSegundoGrado();
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
	public FormularioEcuacionesSegundoGrado() {
		setTitle("Ecuaciones 2º Grado");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 794, 443);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAxBx = new JLabel("ax² + bx + c = 0");
		lblAxBx.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAxBx.setHorizontalAlignment(SwingConstants.CENTER);
		lblAxBx.setBounds(187, 46, 377, 31);
		contentPane.add(lblAxBx);
		
		JLabel lblA = new JLabel("a");
		lblA.setHorizontalAlignment(SwingConstants.CENTER);
		lblA.setBounds(125, 97, 46, 14);
		contentPane.add(lblA);
		
		JLabel lblB = new JLabel("b");
		lblB.setHorizontalAlignment(SwingConstants.CENTER);
		lblB.setBounds(125, 122, 46, 14);
		contentPane.add(lblB);
		
		JLabel lblC = new JLabel("c");
		lblC.setHorizontalAlignment(SwingConstants.CENTER);
		lblC.setBounds(125, 147, 46, 14);
		contentPane.add(lblC);
		
		textField = new JTextField();
		textField.setBounds(187, 94, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(187, 119, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(187, 144, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblResultado = new JLabel("Resultado: ");
		lblResultado.setBounds(329, 122, 295, 14);
		contentPane.add(lblResultado);
		
		JButton btnRealizar = new JButton("Realizar");
		btnRealizar.setBounds(184, 176, 89, 23);
		contentPane.add(btnRealizar);
	}
}
