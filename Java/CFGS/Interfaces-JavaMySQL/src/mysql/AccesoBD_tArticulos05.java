package mysql;

/*Permite toda la operativa, altas, bajas, modificaciones y consultas de articulos
 * Cada vez que se pulsa un bot�n establecemos una conexion lo que no es demasiado eficiente.
 * 
 * Similar al anterior pero calcula el preci ocon IVA*/


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.Color;
import javax.swing.JScrollBar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;


public class AccesoBD_tArticulos05 extends JFrame {

  private JPanel contentPane;
  private JTextField tfDesc;
  private JTextField tfPrecio;
  private JLabel lbComentarios;
  private JButton btnConsultaPorCodigo;
  private JTextField tfCod;
  private JTextField tfIva;
  private JTextField tfPVP;
  private JTable tableArt;


  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          AccesoBD_tArticulos05 frame = new AccesoBD_tArticulos05();
          frame.setVisible(true);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }


  // El constructor crea la ventana
  public AccesoBD_tArticulos05() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 756, 444);
    contentPane = new JPanel();
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);
    contentPane.setLayout(null);
    
    JLabel lblDescripcinDelArtculo = new JLabel("Descripci�n del art�culo:");
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
    
    btnAltas.setBounds(23, 165, 177, 25);
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
            lbComentarios.setText("Se borro el art�culo con dicho c�digo");
          } else {
            lbComentarios.setText("No existe un art�culo con dicho c�digo");
          }
          conexion.close();
        } catch(SQLException ex){
          setTitle(ex.toString());
        }        
      }
    });
    btnBajas.setBounds(25, 203, 177, 23);
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
            lbComentarios.setText("Se modifico la descripcion y el precio del art�culo con dicho c�digo");
          } else {
            lbComentarios.setText("No existe un art�culo con dicho c�digo");
          }
          conexion.close();
        } catch(SQLException ex){
          setTitle(ex.toString());
        }                
      }
    });
    btnModif.setBounds(23, 239, 179, 23);
    contentPane.add(btnModif);
    
        
    /////////////////////////////////////////////// CONSULTAS  POR C�DIGO   ///////////////////////////////////////////////////
    
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
            if (!tfIva.getText().equals("")){
            	int iva = Integer.parseInt(tfIva.getText());
            	double precio = Double.parseDouble(tfPrecio.getText());
            	double pvp = precio + (precio*iva/100);
            	tfPVP.setText(pvp + "");
            }
          } else {
            lbComentarios.setText("No existe un art�culo con dicho c�digo");
          }
          conexion.close();
        } catch(SQLException ex){
          setTitle(ex.toString());
        }
      }
    });
    
    
    btnConsultaPorCodigo.setBounds(23, 275, 177, 23);
    contentPane.add(btnConsultaPorCodigo);
    
    tfCod = new JTextField();
    tfCod.setBounds(247, 116, 86, 20);
    contentPane.add(tfCod);
    tfCod.setColumns(10);
    
    JLabel lblCodigo = new JLabel("C\u00F3digo:");
    lblCodigo.setBounds(23, 118, 95, 14);
    contentPane.add(lblCodigo);
    
    JLabel lblIva = new JLabel("IVA:");
    lblIva.setBounds(383, 73, 35, 14);
    contentPane.add(lblIva);
    
    tfIva = new JTextField();
    tfIva.setColumns(10);
    tfIva.setBounds(423, 70, 46, 20);
    contentPane.add(tfIva);
    
    JLabel lblPvp = new JLabel("PVP:");
    lblPvp.setBounds(383, 118, 35, 14);
    contentPane.add(lblPvp);
    
    tfPVP = new JTextField();
    tfPVP.setBackground(Color.WHITE);
    tfPVP.setEditable(false);
    tfPVP.setColumns(10);
    tfPVP.setBounds(423, 115, 95, 20);
    contentPane.add(tfPVP);
    
    
    /////////////////////////////////////////////// CONSULTAS  POR PRECIO   ///////////////////////////////////////////////////

    JButton btnConsultasprecio = new JButton("CONSULTAS (precio)");
    btnConsultasprecio.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
            lbComentarios.setText("");
            tfDesc.setText("");    
            try {
            	Connection conexion=DriverManager.getConnection("jdbc:mysql://localhost/bd_empresa","root" ,"");
            	Statement comando=conexion.createStatement();
            	System.out.println(tfPrecio.getText());
            	ResultSet registro = comando.executeQuery("select * from articulos where precio=" +tfPrecio.getText());

          		DefaultTableModel modelo = (DefaultTableModel)tableArt.getModel();
          		while (modelo.getRowCount() > 0) modelo.removeRow(0);
          		int numCols = modelo.getColumnCount();
	            while (registro.next()==true) {
	        		Object [] fila = new Object[numCols]; // Hay tres columnas en la tabla
	        		
	        		System.out.println(registro.getString("codigo") + " " + registro.getString("descripcion") +  " " + registro.getString("precio"));
	        		fila[0] = registro.getString("codigo");
	        		fila[1] = registro.getString("descripcion");
	        		fila[2] = registro.getString("precio");
	        				
	        		modelo.addRow(fila);
	            	
	            }
              
              conexion.close();
            } catch(SQLException ex){
              setTitle(ex.toString());
           }
    		
    		
    	}
    });
    btnConsultasprecio.setBounds(23, 311, 177, 23);
    contentPane.add(btnConsultasprecio);
    
        
    /// El ScrollPanel y la Tabla /////////////////
    
    JScrollPane scrollPane = new JScrollPane();
    scrollPane.setBounds(247, 221, 479, 165);
    contentPane.add(scrollPane);
    
    tableArt = new JTable();
    tableArt.setModel(new DefaultTableModel(
    	new Object[][] {
    	},
    	new String[] {
    		"C\u00F3digo", "Descripci\u00F3n", "Precio"
    	}
    ));
    scrollPane.setViewportView(tableArt);
    
    
       
    //EL constructor lo �ltimo que hace es cargar el driver
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