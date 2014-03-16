package modeloVista;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import conexion.AdminConexion;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Menu extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfIdDpto;
	private JTextField tfIdEmple;
	private static AdminConexion adminConexion = new AdminConexion();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 523, 265);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblMenu = new JLabel("GESTION DE EMPLEADOS");
		lblMenu.setFont(new Font("Tahoma", Font.BOLD, 24));

		JButton btnListar = new JButton("Listar Empleados por Dpto");
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {

					if (tfIdDpto.getText().equals("")) {
						JOptionPane.showMessageDialog(null, "Debes teclear un código de departamento", "Error en el código", JOptionPane.ERROR_MESSAGE);
					}else if (adminConexion.existeDepartamento(Integer.parseInt(tfIdDpto.getText().toString()))) {
						JOptionPane.showMessageDialog(null, "No existe ningun departamento con ese código", "Error en el código", JOptionPane.ERROR_MESSAGE);
					}else {
						Listar listarEmple = new Listar(Integer.parseInt(tfIdDpto.getText()));
						listarEmple.setVisible(true);
					}
					
					
				} catch (Exception e2) {
					System.out.println(e2);
				}

			}
		});

		JLabel lblIdDpto = new JLabel("ID Dpto");

		tfIdDpto = new JTextField();
		tfIdDpto.setColumns(10);

		JButton btnCalcularPagaEmpleados = new JButton("Calcular Paga Empleados");
		btnCalcularPagaEmpleados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {

					if (tfIdEmple.getText().equals("")) {
						JOptionPane.showMessageDialog(null, "Debes teclear un codigo de empleado", "Error en el empleado", JOptionPane.ERROR_MESSAGE);
					}else if (adminConexion.existeEmpleado(Integer.parseInt(tfIdEmple.getText()))) {
						JOptionPane.showMessageDialog(null, "No existe ningun empleado con ese codigo", "Error en el código", JOptionPane.ERROR_MESSAGE);
					}else {
						Calcular calcularEmple = new Calcular(Integer.parseInt(tfIdEmple.getText()));
						calcularEmple.setVisible(true);
					}
					
					
				} catch (Exception e2) {
					System.out.println(e2);
				}
			}
		});

		JLabel lblIdEmple = new JLabel("ID Emple");

		tfIdEmple = new JTextField();
		tfIdEmple.setColumns(10);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(39)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(btnListar)
								.addComponent(btnCalcularPagaEmpleados))
							.addGap(86)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblIdDpto)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(tfIdDpto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblIdEmple)
									.addGap(18)
									.addComponent(tfIdEmple, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(77)
							.addComponent(lblMenu)))
					.addContainerGap(111, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(38)
					.addComponent(lblMenu)
					.addGap(50)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnListar)
							.addGap(18)
							.addComponent(btnCalcularPagaEmpleados))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblIdDpto)
								.addComponent(tfIdDpto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblIdEmple)
								.addComponent(tfIdEmple, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(36, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
