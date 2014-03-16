package modeloVista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.SQLException;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import modeloBD.Departamentos;
import modeloBD.Empleados;
import conexion.AdminConexion;

public class Calcular extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private static AdminConexion adminConexion = new AdminConexion();
	private JTextField tfDepartamento;
	private JTextField tfNombre;
	private JTextField tfIdEmple;
	private JTextField tfFecha;
	private JTextField tfApellidos;
	private JTextField tfSueldoBase;
	private JTextField tfSalarioFinal;
	private Empleados empleado;
	private Departamentos departamento;
	private double sueldoBase = 0;
	private double sueldoTurnos = 0;
	private double sueldoMateriasPeligrosas = 0;
	private JCheckBox chckbxTurnos;
	private JCheckBox chckbxMateriaPeligrosas;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton rdbtnInflamables;
	private JRadioButton rdbtnExplosivos;
	
	/**
	 * Create the dialog.
	 * @param i 
	 */
	public Calcular(int idEmple) {
		setModal(true);
		setBounds(100, 100, 867, 493);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		
		JLabel lblTitulo = new JLabel("CÁLCULO DE LA PAGA DEL EMPLEADO SELECCIONADO");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 17));
		JLabel lblIdemple = new JLabel("Id_Emple");
		JLabel lblNombre = new JLabel("Nombre");
		JLabel lblDepartamento = new JLabel("Departamento");
		JLabel lblFechaalta = new JLabel("Fecha de Alta");
		JLabel lblApellidos = new JLabel("Apellidos");
		JLabel lblSueldoBase = new JLabel("Sueldo Base");
		
		tfDepartamento = new JTextField();
		tfDepartamento.setColumns(10);
		
		tfNombre = new JTextField();
		tfNombre.setColumns(10);
		
		tfIdEmple = new JTextField();
		tfIdEmple.setColumns(10);
		
		tfFecha = new JTextField();
		tfFecha.setColumns(10);
		
		tfApellidos = new JTextField();
		tfApellidos.setColumns(10);
		
		tfSueldoBase = new JTextField();
		tfSueldoBase.setColumns(10);
		
		chckbxTurnos = new JCheckBox("Turnos (10%)");
		chckbxTurnos.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				comprobarPluses();
			}
		});
		chckbxTurnos.setHorizontalTextPosition(SwingConstants.LEFT);
		
		chckbxMateriaPeligrosas = new JCheckBox("Materia Peligrosas");
		chckbxMateriaPeligrosas.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				rdbtnExplosivos.setEnabled(true);
				rdbtnInflamables.setEnabled(true);
				if (!chckbxMateriaPeligrosas.isSelected()) {
					rdbtnExplosivos.setEnabled(false);
					rdbtnInflamables.setEnabled(false);
				}

			}
		});
		chckbxMateriaPeligrosas.setHorizontalTextPosition(SwingConstants.LEFT);
		
		JButton btnCalcularSalarioFinal = new JButton("CALCULAR SALARIO FINAL");
		btnCalcularSalarioFinal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcularSueldoFinal(sueldoBase);
			}
		});
		
		tfSalarioFinal = new JTextField();
		tfSalarioFinal.setHorizontalAlignment(SwingConstants.RIGHT);
		tfSalarioFinal.setFont(new Font("Tahoma", Font.BOLD, 23));
		tfSalarioFinal.setColumns(10);
		
		JLabel label = new JLabel("€");
		label.setFont(new Font("Tahoma", Font.BOLD, 30));
		
		rdbtnInflamables = new JRadioButton("Inflamables (8%)");
		rdbtnInflamables.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				comprobarPluses();
			}
		});
		rdbtnInflamables.setEnabled(false);
		buttonGroup.add(rdbtnInflamables);
		
		rdbtnExplosivos = new JRadioButton("Explosivos (12%)");
		rdbtnExplosivos.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				comprobarPluses();
			}
		});
		rdbtnExplosivos.setEnabled(false);
		buttonGroup.add(rdbtnExplosivos);
		
		JLabel label_1 = new JLabel("--------------->");
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGap(63)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblIdemple)
								.addComponent(lblNombre)
								.addComponent(lblDepartamento))
							.addGap(18)
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(tfDepartamento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(tfNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(tfIdEmple, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(158)
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblFechaalta)
								.addComponent(lblApellidos)
								.addComponent(lblSueldoBase))
							.addGap(33)
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(tfSueldoBase, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(tfApellidos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(tfFecha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.TRAILING)
								.addComponent(chckbxMateriaPeligrosas)
								.addComponent(chckbxTurnos))
							.addGap(20)
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_contentPanel.createSequentialGroup()
									.addGap(41)
									.addComponent(lblTitulo))
								.addGroup(gl_contentPanel.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
										.addComponent(rdbtnInflamables)
										.addGroup(gl_contentPanel.createSequentialGroup()
											.addComponent(rdbtnExplosivos)
											.addPreferredGap(ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
											.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING, false)
												.addComponent(tfSalarioFinal)
												.addComponent(btnCalcularSalarioFinal, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
											.addGap(10)
											.addComponent(label)))))))
					.addContainerGap(86, Short.MAX_VALUE))
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGap(27)
					.addComponent(lblTitulo)
					.addGap(48)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblIdemple)
								.addComponent(lblFechaalta)
								.addComponent(tfIdEmple, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(tfFecha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNombre)
								.addComponent(lblApellidos)
								.addComponent(tfNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(tfApellidos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblDepartamento)
								.addComponent(lblSueldoBase)
								.addComponent(tfDepartamento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(tfSueldoBase, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPanel.createSequentialGroup()
									.addGap(51)
									.addComponent(chckbxTurnos))
								.addGroup(gl_contentPanel.createSequentialGroup()
									.addGap(41)
									.addComponent(btnCalcularSalarioFinal)))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPanel.createSequentialGroup()
									.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
										.addComponent(rdbtnInflamables)
										.addComponent(label_1))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(rdbtnExplosivos))
								.addComponent(chckbxMateriaPeligrosas))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(tfSalarioFinal, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE))
						.addComponent(label))
					.addContainerGap(45, Short.MAX_VALUE))
		);
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
			cargarEmpleado(idEmple);
		} catch (SQLException e) {
			System.out.println(e);
		}
	}
	
	private void cargarEmpleado(int idEmple) throws SQLException {
		empleado=adminConexion.selectEmpleado(idEmple);
		
		
		tfIdEmple.setText(empleado.getId_Emple()+"");
		tfNombre.setText(empleado.getNombre_Emple());
		tfApellidos.setText(empleado.getApell_Emple());
		tfDepartamento.setText(empleado.getCodDPTO_Emple()+"");
		tfFecha.setText(empleado.getFechaAlta_Emple()+"");
		tfSueldoBase.setText(empleado.getSueldo_Emple()+"");
		
		sueldoBase = Double.parseDouble(tfSueldoBase.getText());
		
		departamento = adminConexion.selectDepartamento(Integer.parseInt(tfDepartamento.getText()));
		tfDepartamento.setText(departamento.getDescripcion());
	}
	
	private void comprobarPluses() {
		if (chckbxTurnos.isSelected()) {
			sueldoTurnos = sueldoBase * 10/(100);
		}else {
			sueldoTurnos = 0;
		}
		
		if (rdbtnExplosivos.isSelected()) {
			sueldoMateriasPeligrosas = sueldoBase * 12/100;
		}else if (rdbtnInflamables.isSelected()) {
			sueldoMateriasPeligrosas = sueldoBase * 8/100;
		}else {
			sueldoMateriasPeligrosas = 0;
		}
		
	}
	
	
	private void calcularSueldoFinal(double sueldoBase ) {
		Double sueldoFinal;
		sueldoFinal = sueldoBase + sueldoTurnos + sueldoMateriasPeligrosas;
		tfSalarioFinal.setText(sueldoFinal+"");
	}
}
