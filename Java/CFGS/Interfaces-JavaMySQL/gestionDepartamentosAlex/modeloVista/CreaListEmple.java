package modeloVista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JScrollPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import modeloBD.Empleado;


import conexion.AdminCon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CreaListEmple extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JLabel lblListadoGeneralDe;
	private JTable tablaEmp;
	private ArrayList<Empleado> empleado;
	private static AdminCon conex = new AdminCon();



	public CreaListEmple() {
		setModal(true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		{
			lblListadoGeneralDe = new JLabel("LISTADO GENERAL DE EMPLEADOS");
			lblListadoGeneralDe.setFont(new Font("Tahoma", Font.BOLD, 14));
		}
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGap(90)
							.addComponent(lblListadoGeneralDe))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addContainerGap()
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 398, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGap(5)
					.addComponent(lblListadoGeneralDe)
					.addGap(18)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(20, Short.MAX_VALUE))
		);
		{
			tablaEmp = new JTable();
			tablaEmp.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
						"Id Emple", "Nombre", "Apellidos", "Fecha Alta" , "Sueldo", "Dpto"
				}
			));
			scrollPane.setViewportView(tablaEmp);
		}
		contentPanel.setLayout(gl_contentPanel);
		
		try {
			cargarEmpleados();
		} catch (Exception e) {
			System.out.println("error1");
		}
		
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton cancelButton = new JButton("Cerrar");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

	private void cargarEmpleados() throws SQLException {
		//Recuperamos los empleados en un arraylist (a partir de los datos de la BD) utilizando el m�todo recuperaEmpleados de nuestra clase de conexi�n.
		empleado=conex.recuperaEmpleados();
		
		//Y ahora rellenamos la tabla con los datos del ArrayList
		DefaultTableModel modelo = (DefaultTableModel)tablaEmp.getModel();
		int numCols = modelo.getColumnCount();
		for (Empleado emp : empleado) {
			Object [] fila = new Object[numCols]; 
			
			fila[0] = emp.getIdEmple();
			fila[1] = emp.getNomEmple();
			fila[2] = emp.getApelEmple();
			fila[3] = emp.getFaltaEmple();
			fila[4] = emp.getSueldoEmple();
			fila[5] = emp.getIdDptoEmple();
			
			modelo.addRow(fila);
				
		}
		
	}

	
}
