package vistas;

/* Ventana principal de la aplicaci�n donde se muestra la lista de atletas y los botones 
 * con las posibles operaciones a realizar con ellos. */

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import dataconection.DataConnection;
import domain.Empleados;

public class Atletas extends JFrame {

	private JPanel contentPane;
	private JTable tableAtl;
	private ArrayList<Empleados> atletas;
	private static DataConnection mc = new DataConnection();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Atletas frame = new Atletas();
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
	
	public Atletas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					elimina();
				} catch (Exception e2) {
					System.out.println("Error al eliminar atleta");
				}
			}
		});
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					//Cuando modificamos un atleta pasamos false (al booleno "crea") y el atleta a modificar. 
					Empleados atleta = (Empleados)tableAtl.getModel().getValueAt(tableAtl.getSelectedRow(), 3);
					CrearAtleta ca = new CrearAtleta(false, atleta);
					ca.setVisible(true);
					//
					actualizaLista();
				} catch (Exception e2) {
					System.out.println("Error al modificar Atleta");
				}
			}
		});
		
		JButton btnCrear = new JButton("Crear");
		btnCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					//Cuando creamos un atleta pasamos true (al booleno "crea") y null como atleta (por que no existe todavia). 
					CrearAtleta ca = new CrearAtleta(true, null); 
					ca.setVisible(true);
					//
					actualizaLista();
				} catch (Exception e2) {
					System.out.println("Error al crear Atleta");
				}
			}
		});
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(btnCrear)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnModificar)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnEliminar))
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnEliminar)
						.addComponent(btnModificar)
						.addComponent(btnCrear))
					.addContainerGap())
		);
		
		
		tableAtl = new JTable();
		tableAtl.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Num Licencia", "Nombre", "Email", "Objecte"
			}
		));
		scrollPane.setViewportView(tableAtl);
		contentPane.setLayout(gl_contentPane);
		tableAtl.removeColumn(tableAtl.getColumn("Objecte"));
		try {
			actualizaLista();
		} catch (Exception e) {
			System.out.println("error1");
		}
	}

	void actualizaLista() throws SQLException{
		//Recuperamos los atletas en el arraylist (a partir de los datos de la BD
		atletas=mc.retornaAtletas();
		
		//Y ahora rellenamos la tabla con los datos del ArrayList
		DefaultTableModel modelo = (DefaultTableModel)tableAtl.getModel();
		while (modelo.getRowCount() > 0) modelo.removeRow(0);
		int numCols = modelo.getColumnCount();
		
		for (Empleados usr : atletas) {
			Object [] fila = new Object[numCols]; // Hay tres columnas en la tabla
			
			fila[0] = usr.getNumlic();
			fila[1] = usr.getNombre();
			fila[2] = usr.getMail();
			fila[3] = usr;
			
			modelo.addRow(fila);
				
		}
	}
	
	void elimina() throws SQLException{
		int respuesta = JOptionPane.showConfirmDialog(null, "Seguro que quieres eliminar?", "Eliminar", JOptionPane.YES_NO_OPTION);
		if (respuesta == JOptionPane.YES_OPTION) {
			Empleados user = (Empleados)tableAtl.getModel().getValueAt(tableAtl.getSelectedRow(), 3);
			mc.eliminaAtleta(user.getNumlic());
		}
		actualizaLista();
	}
}
