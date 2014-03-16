package modeloVista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;


import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {

	private JPanel contentPane;
	private JTextField tfDpto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 611, 385);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblGestinDeDepartamentos = new JLabel("GESTI\u00D3N DE DEPARTAMENTOS");
		lblGestinDeDepartamentos.setHorizontalAlignment(SwingConstants.CENTER);
		lblGestinDeDepartamentos.setFont(new Font("Tahoma", Font.BOLD, 21));
		
		
		//////////////////////////////    LISTAMOS LOS EMPLEADOS DE TODOS LOS DEPARTAMENTOS    //////////////////////////
		JButton btnListarEmpleados = new JButton("Listar Empleados");
		btnListarEmpleados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					CreaListEmple ca = new CreaListEmple(); 
					ca.setVisible(true);
					//
				} catch (Exception e2) {
					System.out.println("Error al mostrar la lista de empleados");
				}
				
			}
		});
		
		
		//////////////////////////////     LISTAMOS TODOS LOS DEPARTAMENTOS    //////////////////////////
		JButton btnListarDepartamentos = new JButton("Listar Departamentos");
		btnListarDepartamentos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					CreaListDpto ca = new CreaListDpto(); 
					ca.setVisible(true);
					//
				} catch (Exception e2) {
					System.out.println("Error al mostrar la lista de departamentos");
				}
				
			}
		});
		
		
		//////////////////////////////    DADO UN DPTO. MOSTRAMOS SUS DATOS Y LA LISTA DE SUS EMPLEADOS    //////////////////////////
		JButton btnListarEmpDpto = new JButton("Listar Empleados por Dpto");
		btnListarEmpDpto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					ConsultaDptoEmp ca = new ConsultaDptoEmp(Integer.parseInt(tfDpto.getText())); 
					ca.setVisible(true);
					//
				} catch (Exception e2) {
					System.out.println("Error al mostrar la lista de empleados");
				}
				
				
			}
		});
		
		tfDpto = new JTextField();
		tfDpto.setColumns(10);
		
		JLabel lblIdDpto = new JLabel("Id Dpto:");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(102)
							.addComponent(lblGestinDeDepartamentos, GroupLayout.PREFERRED_SIZE, 377, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(btnListarEmpleados)
								.addComponent(btnListarDepartamentos)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(btnListarEmpDpto)
									.addGap(76)
									.addComponent(lblIdDpto)
									.addGap(27)
									.addComponent(tfDpto, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)))))
					.addContainerGap(104, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(28)
					.addComponent(lblGestinDeDepartamentos, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
					.addGap(35)
					.addComponent(btnListarEmpleados)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnListarDepartamentos)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnListarEmpDpto)
						.addComponent(tfDpto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblIdDpto))
					.addContainerGap(108, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}

}
