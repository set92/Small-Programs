package vistas;

/* Ventana secundaria que se abre para dar de alta a un nuevo atleta o para modificar uno existente.
 * Usamos un jDialog (M�s propiado para ventanas secundarias) en lugar de un jFrame.*/

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

import dataconection.DataConnection;
import domain.Empleados;

public class CrearAtleta extends JDialog {

	private static DataConnection mc = new DataConnection();
	private JPanel contentPane;
	Empleados a;
	private JTextField txtLic;
	private JTextField txtNombre;
	private JTextField txtMail;
	private JTextField txtTelf;

	//Crea es un booleano que recibimos para saber si estamos creando o modificando un atleta.
	public CrearAtleta(final boolean crea, Empleados a) {
		setModal(true); //Bloquea las otras ventanas de la aplicaci�n (hasta que no cerremos esta no podemos seguir con las siguientes)
		this.a=a; //Si es una creaci�n recibiremos null, si es modif. recibiremos un atleta ya existente
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //NO salimos de la app. si no que cerramos ventana.
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNumLic = new JLabel("Num lic:");
		JLabel lblNombre = new JLabel("Nombre:");
		JLabel lblEmail = new JLabel("Email");
		JLabel lblTelefono = new JLabel("Telefono");
		
		txtLic = new JTextField();
		txtLic.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		
		txtMail = new JTextField();
		txtMail.setColumns(10);
		
		txtTelf = new JTextField();
		txtTelf.setColumns(10);
		
		JButton btnCancela = new JButton("Cancela");
		btnCancela.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose(); //Cerramos la ventana
			}
		});
		
		JButton btnGuarda = new JButton("Guarda");
		btnGuarda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(crea){
						crear();
					}
					else{
						modificar();
					}
					
					dispose();
				} catch (Exception e2) {
					
				}
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNumLic)
							.addGap(18)
							.addComponent(txtLic, GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNombre)
								.addComponent(lblEmail)
								.addComponent(lblTelefono))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(txtTelf, GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
								.addComponent(txtMail, GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
								.addComponent(txtNombre, GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)))
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(btnGuarda)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnCancela)))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNumLic)
						.addComponent(txtLic, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNombre)
						.addComponent(txtNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEmail)
						.addComponent(txtMail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTelefono)
						.addComponent(txtTelf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnCancela)
						.addComponent(btnGuarda))
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
		
		if(!crea){ //Si se trata de una modificaci�n rellenamos los campos con los datos del atleta:
			txtLic.setEditable(false); //El n�mero de licencia no es editable
			txtLic.setText(a.getNumlic()+"");
			txtNombre.setText(a.getNombre());
			txtMail.setText(a.getMail());
			txtTelf.setText(a.getTelf());
		}
	}
	
	void crear() throws Exception{
		mc.insertaAtleta(Integer.parseInt(txtLic.getText()), txtNombre.getText(), txtMail.getText(), txtTelf.getText());
	}
	
	void modificar() throws Exception{
		mc.editaAtleta(a.getNumlic(), txtNombre.getText());
	}
}
