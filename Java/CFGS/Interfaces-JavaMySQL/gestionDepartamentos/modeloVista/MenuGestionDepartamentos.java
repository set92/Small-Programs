package modeloVista;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

public class MenuGestionDepartamentos extends JFrame {

	private JPanel contentPane;
	private JTextField tfIdDpto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuGestionDepartamentos frame = new MenuGestionDepartamentos();
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
	public MenuGestionDepartamentos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 766, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnListaEmpleados = new JButton("Lista Empleados");
		btnListaEmpleados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CreaListaEmple creaListaEmpleado;
				try {
					creaListaEmpleado = new CreaListaEmple(null);
					creaListaEmpleado.setVisible(true);
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				
			}
		});
		
		JButton btnListaDepartamentos = new JButton("Lista Departamentos");
		JButton btnListaEmpleadosPor = new JButton("Lista Empleados por DPTO");
		btnListaEmpleadosPor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConsultaDptoEmp consultaDPTO = new ConsultaDptoEmp(Integer.parseInt(tfIdDpto.getText().toString()));
				consultaDPTO.setVisible(true);
			}
		});
		JLabel lblGestionDepartamentos = new JLabel("GESTION DEPARTAMENTOS");
		lblGestionDepartamentos.setFont(new Font("Tahoma", Font.BOLD, 26));
		JLabel lblIddpto = new JLabel("ID_Dpto");
		
		tfIdDpto = new JTextField();
		tfIdDpto.setColumns(10);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(27)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnListaEmpleadosPor)
							.addGap(77)
							.addComponent(lblIddpto)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(tfIdDpto, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
						.addComponent(btnListaDepartamentos)
						.addComponent(btnListaEmpleados))
					.addContainerGap(379, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(194, Short.MAX_VALUE)
					.addComponent(lblGestionDepartamentos)
					.addGap(183))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(35)
					.addComponent(lblGestionDepartamentos)
					.addGap(78)
					.addComponent(btnListaEmpleados)
					.addGap(18)
					.addComponent(btnListaDepartamentos)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnListaEmpleadosPor)
						.addComponent(lblIddpto)
						.addComponent(tfIdDpto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(200, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
