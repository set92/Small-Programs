package modeloVista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modeloBD.Empleados;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.EtchedBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import conexion.AdminConexion;

public class CreaListaEmple extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTable table;
	private JPanel buttonPane;
	private JScrollPane scrollPane;
	private AdminConexion adminConexion = new AdminConexion();

	/**
	 * Create the dialog.
	 * @throws SQLException 
	 */
	public CreaListaEmple(Empleados emple) throws SQLException {
		setModal(true);


		setBounds(100, 100, 659, 514);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		{
			scrollPane = new JScrollPane();
			scrollPane.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
			{
				table = new JTable();
				table.setModel(new DefaultTableModel(
						new Object[][] {
						},
						new String[] {
								"ID", "Nombre", "Apellidos", "Fecha Alta", "Sueldo", "Codigo DPTO"
						}
						));
				scrollPane.setViewportView(table);
			}
		}
		{
			buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
				groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(contentPanel, GroupLayout.PREFERRED_SIZE, 643, GroupLayout.PREFERRED_SIZE)
				.addComponent(buttonPane, GroupLayout.PREFERRED_SIZE, 643, GroupLayout.PREFERRED_SIZE)
				);
		groupLayout.setVerticalGroup(
				groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
						.addComponent(contentPanel, GroupLayout.PREFERRED_SIZE, 443, GroupLayout.PREFERRED_SIZE)
						.addComponent(buttonPane, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				);
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
				gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPanel.createSequentialGroup()
						.addContainerGap()
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 613, Short.MAX_VALUE)
						.addContainerGap())
				);
		gl_contentPanel.setVerticalGroup(
				gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
						.addContainerGap()
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
						.addContainerGap())
				);
		contentPanel.setLayout(gl_contentPanel);
		getContentPane().setLayout(groupLayout);
		cargarJTable();
	}

	private void cargarJTable() throws SQLException {
		ArrayList<Empleados> listEmpleados = adminConexion.selectEmpleados();

		//Y ahora rellenamos la tabla con los datos del ArrayList
		DefaultTableModel modelo = (DefaultTableModel)table.getModel();
		
		while (modelo.getRowCount() > 0){
			modelo.removeRow(0);
		}
		
		int numCols = modelo.getColumnCount();
		
		for (Empleados empleado : listEmpleados) {
			Object [] fila = new Object[numCols]; // Hay tres columnas en la tabla

			fila[0] = empleado.getId_Emple();
			fila[1] = empleado.getNombre_Emple();
			fila[2] = empleado.getApell_Emple();
			fila[3] = empleado.getCodDPTO_Emple();
			fila[4] = empleado.getSueldo_Emple();
			fila[5] = empleado.getCodDPTO_Emple();

			modelo.addRow(fila);
		}
	}

}
