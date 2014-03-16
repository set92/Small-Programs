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

import modeloBD.Departamento;
import modeloBD.Empleado;


import conexion.AdminCon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;

public class ConsultaDptoEmp extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JLabel lblListadoGeneralDe;
	private JTable tablaEmp;
	private ArrayList<Empleado> empleados;
	private static AdminCon conex = new AdminCon();
	private JTextField tfIdDpto;
	private JTextField tfNomDpto;
	private JTextField tfPoblacion;
	private Departamento departamento;



	public ConsultaDptoEmp(int idDpto) {
		setModal(true);
		setBounds(100, 100, 690, 477);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		{
			lblListadoGeneralDe = new JLabel("LISTADO DE EMPLEADOS POR DEPARTAMENTO");
			lblListadoGeneralDe.setFont(new Font("Tahoma", Font.BOLD, 14));
		}
		JScrollPane scrollPane = new JScrollPane();
		JLabel lblCodDpto = new JLabel("Cod. DPTO:");
		JLabel lblNombre = new JLabel("Nombre:");
		JLabel lblPoblacin = new JLabel("Poblaci\u00F3n:");
		tfIdDpto = new JTextField();
		tfIdDpto.setColumns(10);
		tfNomDpto = new JTextField();
		tfNomDpto.setColumns(10);
		tfPoblacion = new JTextField();
		tfPoblacion.setColumns(10);
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGap(155)
							.addComponent(lblListadoGeneralDe))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGap(90)
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 492, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPanel.createSequentialGroup()
									.addGroup(gl_contentPanel.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(lblNombre, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(lblCodDpto, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
									.addGap(18)
									.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPanel.createSequentialGroup()
											.addComponent(tfNomDpto, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
											.addGap(92)
											.addComponent(lblPoblacin)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(tfPoblacion, GroupLayout.PREFERRED_SIZE, 184, GroupLayout.PREFERRED_SIZE))
										.addComponent(tfIdDpto, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))))))
					.addContainerGap(31, Short.MAX_VALUE))
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPanel.createSequentialGroup()
					.addGap(31)
					.addComponent(lblListadoGeneralDe)
					.addGap(31)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCodDpto)
						.addComponent(tfIdDpto, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNombre)
						.addComponent(lblPoblacin)
						.addComponent(tfNomDpto, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
						.addComponent(tfPoblacion, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE)
					.addGap(30))
		);
		{
			tablaEmp = new JTable();
			tablaEmp.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
						"Id Emple", "Nombre", "Apellidos", "Fecha Alta" , "Sueldo" //, "Dpto"
				}
			));
			scrollPane.setViewportView(tablaEmp);
		}
		contentPanel.setLayout(gl_contentPanel);
		
		try {
			cargarDpto(idDpto);
			cargarEmpleados(idDpto);
			
		} catch (Exception e) {
			System.out.println("Error a llamar a los m�todos cargarDpto o cargarEmpleados");
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

	
	//////////////////////////////    RECUPERA LOS DATOS DEL DEPARTAMENTO QUE RECIBE EL JDIALOG    //////////////////////////

	private void cargarDpto(int dpto) throws SQLException {
		//Recuperamos los datos del departamento en objeto de tipo Departamento (a partir de los datos de la BD) utilizando el m�todo recuperaDpto de nuestra clase de conexi�n.
		departamento=conex.recuperaDpto(dpto);
		
		//Y ahora rellenamos los TextField de la ventana
		tfIdDpto.setText(departamento.getIdDpto()+"");
		tfNomDpto.setText(departamento.getNomDpto());
		tfPoblacion.setText(departamento.getPoblDpto());
		
	}


	//////////////////////////////    MOSTRAMOS LA LISTA DE EMPLEADOS DEL DPTO. QUE RECIBIMOS   //////////////////////////
	private void cargarEmpleados(int dpto) throws SQLException {
		//Recuperamos los empleados del departamento en un arraylist (a partir de los datos de la BD) utilizando el m�todo recuperaEmpleDpto de nuestra clase de conexi�n.
		empleados=conex.recuperaEmpleDpto(dpto);
		
		//Y ahora rellenamos la tabla con los datos del ArrayList
		DefaultTableModel modelo = (DefaultTableModel)tablaEmp.getModel();
		while (modelo.getRowCount() > 0) modelo.removeRow(0); //Esta l�nea es para vaciar la tabla
		int numCols = modelo.getColumnCount();
		for (Empleado emp : empleados) {
			Object [] fila = new Object[numCols]; 
			
			fila[0] = emp.getIdEmple();
			fila[1] = emp.getNomEmple();
			fila[2] = emp.getApelEmple();
			fila[3] = emp.getFaltaEmple();
			fila[4] = emp.getSueldoEmple();
			//fila[5] = emp.getIdDptoEmple();   el departamento no lo mostramos.
			
			modelo.addRow(fila);
				
		}
		
	}

}
