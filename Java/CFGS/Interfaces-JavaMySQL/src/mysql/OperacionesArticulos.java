package mysql;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class OperacionesArticulos extends JFrame {

	private JPanel contentPane;
	private JTextField tfDesc;
	private JTextField tfPrecio;
	private JLabel lbComentarios;
	private JButton btnConsultaPorCodigo;
	private JTextField tfCod;
	private JTextField txtIVA;
	private JTextField txtPrecioConIVA;
	private JTable table;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OperacionesArticulos frame = new OperacionesArticulos();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	// El constructor crea la ventana
	public OperacionesArticulos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 811, 645);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblDescripcinDelArtculo = new JLabel("Descripción del artículo:");
		lblDescripcinDelArtculo.setBounds(23, 38, 193, 14);
		contentPane.add(lblDescripcinDelArtculo);

		tfDesc = new JTextField();
		tfDesc.setBounds(247, 35, 193, 20);
		contentPane.add(tfDesc);
		tfDesc.setColumns(10);

		JLabel lblPrecio = new JLabel("Precio:");
		lblPrecio.setBounds(23, 74, 95, 14);
		contentPane.add(lblPrecio);

		tfPrecio = new JTextField();
		tfPrecio.setBounds(247, 71, 107, 20);
		contentPane.add(tfPrecio);
		tfPrecio.setColumns(10);

		lbComentarios = new JLabel("Comentarios:");
		lbComentarios.setBounds(247, 165, 229, 55);
		contentPane.add(lbComentarios);


		///////////////////////////////////////////////  ALTAS   ///////////////////////////////////////////////////

		JButton btnAltas = new JButton("ALTAS");
		btnAltas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lbComentarios.setText("");        
				try {
					Connection conexion=DriverManager.getConnection("jdbc:mysql://localhost/bd_empresa","root" ,"");
					Statement comando=conexion.createStatement();
					comando.executeUpdate("insert into articulos(descripcion,precio) values ('"+tfDesc.getText()+"',"+tfPrecio.getText()+")");
					conexion.close();
					lbComentarios.setText("se registraron los datos");
					tfDesc.setText("");
					tfPrecio.setText("");
				} catch(SQLException ex){
					setTitle(ex.toString());
				}
			}
		});

		btnAltas.setBounds(23, 123, 177, 25);
		contentPane.add(btnAltas);

		///////////////////////////////////////////////  BAJAS  ///////////////////////////////////////////////////

		JButton btnBajas = new JButton("BAJAS");
		btnBajas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lbComentarios.setText("");
				try {
					Connection conexion=DriverManager.getConnection("jdbc:mysql://localhost/bd_empresa","root" ,"");
					Statement comando=conexion.createStatement();
					int cantidad = comando.executeUpdate("delete from articulos where codigo="+tfCod.getText());
					if (cantidad==1) {
						tfDesc.setText("");
						tfPrecio.setText("");        
						lbComentarios.setText("Se borro el artículo con dicho código");
					} else {
						lbComentarios.setText("No existe un artículo con dicho código");
					}
					conexion.close();
				} catch(SQLException ex){
					setTitle(ex.toString());
				}        
			}
		});
		btnBajas.setBounds(25, 161, 177, 23);
		contentPane.add(btnBajas);


		///////////////////////////////////////////////   MODIFICACIONES   ///////////////////////////////////////////////////

		JButton btnModif = new JButton("MODIFICACIONES");
		btnModif.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbComentarios.setText("");
				try {
					Connection conexion=DriverManager.getConnection("jdbc:mysql://localhost/bd_empresa","root" ,"");
					Statement comando=conexion.createStatement();
					int cantidad = comando.executeUpdate("update articulos set descripcion='" + tfDesc.getText() + "'," +
							"precio=" + tfPrecio.getText() + " where codigo="+tfCod.getText());
					if (cantidad==1) {
						lbComentarios.setText("Se modifico la descripcion y el precio del artículo con dicho código");
					} else {
						lbComentarios.setText("No existe un artículo con dicho código");
					}
					conexion.close();
				} catch(SQLException ex){
					setTitle(ex.toString());
				}                
			}
		});
		btnModif.setBounds(23, 197, 179, 23);
		contentPane.add(btnModif);


		/////////////////////////////////////////////// CONSULTAS ///////////////////////////////////////////////////

		btnConsultaPorCodigo = new JButton("CONSULTAS (cod)");
		btnConsultaPorCodigo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lbComentarios.setText("");
				tfDesc.setText("");
				tfPrecio.setText("");        
				try {
					Connection conexion=DriverManager.getConnection("jdbc:mysql://localhost/bd_empresa","root" ,"");
					Statement comando=conexion.createStatement();
					ResultSet registro = comando.executeQuery("select descripcion,precio from articulos where codigo="+tfCod.getText());
					if (registro.next()==true) {
						tfDesc.setText(registro.getString("descripcion"));
						tfPrecio.setText(registro.getString("precio"));
						txtPrecioConIVA.setText(""+((Double.parseDouble(registro.getString("precio"))*16/100)+Double.parseDouble(registro.getString("precio"))));
						
					} else {
						lbComentarios.setText("No existe un artículo con dicho código");
					}
					conexion.close();
				} catch(SQLException ex){
					setTitle(ex.toString());
				}

				

			}
		});
		btnConsultaPorCodigo.setBounds(23, 233, 177, 23);
		contentPane.add(btnConsultaPorCodigo);

		JButton btnConsultasprecio = new JButton("CONSULTAS (precio)");
		btnConsultasprecio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Connection conexion=DriverManager.getConnection("jdbc:mysql://localhost/bd_empresa","root" ,"");
					Statement comando=conexion.createStatement();
					ResultSet registro = comando.executeQuery("select codigo, descripcion, precio from articulos where precio="+tfPrecio.getText());
					
					DefaultTableModel modelo = new DefaultTableModel();
					table.setModel(modelo);
					modelo.addColumn("Codigo");
					modelo.addColumn("Descripcion Producto");
					modelo.addColumn("Precio");
					
					int numColumnas = modelo.getColumnCount();
					Object [] fila = new Object[numColumnas];
					
					while (registro.next()==true) {

						for (int i=0;i<numColumnas;i++){
							fila[i] = registro.getObject(i+1); // El primer indice en rs es el 1, no el cero, por eso se suma 1.
						}
						modelo.addRow(fila); 
					}
					
					conexion.close();
				} catch(SQLException ex){
					setTitle(ex.toString());
				}


			}
		});
		btnConsultasprecio.setBounds(23, 267, 177, 23);
		contentPane.add(btnConsultasprecio);

		tfCod = new JTextField();
		tfCod.setBounds(247, 123, 86, 20);
		contentPane.add(tfCod);
		tfCod.setColumns(10);

		JLabel lblIva = new JLabel("IVA");
		lblIva.setBounds(247, 231, 46, 14);
		contentPane.add(lblIva);

		txtIVA = new JTextField();
		txtIVA.setBounds(354, 231, 86, 20);
		contentPane.add(txtIVA);
		txtIVA.setColumns(10);

		JLabel lblPrecioConIva = new JLabel("Precio Con IVA");
		lblPrecioConIva.setBounds(247, 265, 101, 14);
		contentPane.add(lblPrecioConIva);

		txtPrecioConIVA = new JTextField();
		txtPrecioConIVA.setBounds(354, 262, 86, 20);
		contentPane.add(txtPrecioConIVA);
		txtPrecioConIVA.setColumns(10);
				
				JScrollPane scrollPane_1 = new JScrollPane();
				scrollPane_1.setBounds(70, 339, 653, 231);
				contentPane.add(scrollPane_1);
		
		
		
		
				table = new JTable();
				scrollPane_1.setViewportView(table);
				table.setModel(new DefaultTableModel(
					new Object[][] {
					},
					new String[] {
						"Descripcion", "Codigo", "Precio"
					}
				));
				table.setEnabled(false);



		//EL constructor lo último que hace es cargar el driver
		cargarDriver();
	}

	private void cargarDriver() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		}catch(Exception ex) {
			setTitle(ex.toString());
		}
	}
}
