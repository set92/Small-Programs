package modeloVista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import conexion.AdminConexion;
import modeloBD.Departamentos;
import modeloBD.Empleados;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;

public class Listar extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTable table;
	private AdminConexion adminConexion = new AdminConexion();
	private JTextField tfId;
	private Departamentos departamento;
	private JTextField tfNombre;
	private JTextField tfPoblacion;

	/**
	 * Create the dialog.
	 * @param idDpto 
	 */
	public Listar(int idDpto) {
		setModal(true);
		setBounds(100, 100, 741, 521);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		
		JScrollPane scrollPane = new JScrollPane();
		
		tfId = new JTextField();
		tfId.setColumns(10);
		
		JLabel lblId = new JLabel("Cod. DPTO");
		
		JLabel lblNombre = new JLabel("Nombre:");
		
		JLabel lblPoblacion = new JLabel("Poblacion:");
		
		tfNombre = new JTextField();
		tfNombre.setColumns(10);
		
		tfPoblacion = new JTextField();
		tfPoblacion.setColumns(10);
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGap(45)
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 615, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGap(37)
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblNombre)
								.addComponent(lblId))
							.addGap(18)
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPanel.createSequentialGroup()
									.addComponent(tfNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(147)
									.addComponent(lblPoblacion)
									.addGap(18)
									.addComponent(tfPoblacion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addComponent(tfId, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(55, Short.MAX_VALUE))
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_contentPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblId)
						.addComponent(tfId, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(43)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNombre)
						.addComponent(lblPoblacion)
						.addComponent(tfNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(tfPoblacion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 284, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Id Emple", "Nombre", "Apellidos", "Fecha Alta" , "Sueldo"
			}
		));
		scrollPane.setViewportView(table);
		contentPanel.setLayout(gl_contentPanel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Cerrar");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
		}
		
		try {
			cargarJTable(idDpto);
			cargarDpto(idDpto);
		} catch (SQLException e) {
			System.out.println("Error al cargar la JTable");
		}
	}
	
	private void cargarJTable(int idDpto) throws SQLException {
		ArrayList<Empleados> listEmpleados = adminConexion.selectEmpleadoDpto(idDpto);
		
		DefaultTableModel modelo = (DefaultTableModel)table.getModel();
		
		while (modelo.getRowCount() > 0){
			modelo.removeRow(0);
		}
		
		int numCols = modelo.getColumnCount();
		
		for (Empleados empleado : listEmpleados) {
			Object [] fila = new Object[numCols]; 

			fila[0] = empleado.getId_Emple();
			fila[1] = empleado.getNombre_Emple();
			fila[2] = empleado.getApell_Emple();
			fila[3] = empleado.getFechaAlta_Emple();
			fila[4] = empleado.getSueldo_Emple();

			modelo.addRow(fila);
		}
	}
	
	private void cargarDpto(int dpto) throws SQLException {
		departamento=adminConexion.selectDepartamento(dpto);
		
		tfId.setText(departamento.getId_Dpto()+"");
		tfNombre.setText(departamento.getDescripcion()+"");
		tfPoblacion.setText(departamento.getPoblacion()+"");
	}
}
