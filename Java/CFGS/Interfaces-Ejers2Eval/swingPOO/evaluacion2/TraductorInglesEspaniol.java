package evaluacion2;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

public class TraductorInglesEspaniol extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtIngles;
	private JTextField txtEspanol;
	ArrayList<String> diccionarioEspanol, diccionarioIngles;
	


	private ArrayList<String> abrirDiccionario(String rutaDiccionario) {
		ArrayList<String> diccionario= new ArrayList<>();
		String linea = "";
		File archivo = new File(rutaDiccionario);
		
		try {
			FileReader leerArchivo = new FileReader(archivo);
			BufferedReader buffer = new BufferedReader(leerArchivo);
			while ((linea = buffer.readLine()) != null){
				diccionario.add(linea);
			}
			buffer.close();
		}catch (Exception ex){
			
		}
		return diccionario;
	}
	
	private int buscarPalabra(String texto, int diccionario) {
		int indice = -1;
		if (diccionario==0) {//Si es 0 entonces buscamos en el diccionario ingles
			indice = diccionarioIngles.indexOf(texto);
			if (indice==-1) {
				JOptionPane.showInternalMessageDialog(contentPane, "NO EXISTE ESA PALABRA EN EL DICCIONARIO INGLES");
			}else {
				return indice;
			}
		}else if(diccionario==1){
			indice = diccionarioEspanol.indexOf(texto);
			if (indice==-1) {
				JOptionPane.showInternalMessageDialog(contentPane, "NO EXISTE ESA PALABRA EN EL DICCIONARIO ESPAÑOL");
			}else {
				return indice;
			}
		}
		return indice;
	}
	
	private String traducirPalabra(int indice, int diccionario){
		/* El indice sera la posicion de la palabra
		 * El diccionario sera el diccionario en el que estara la traduccion*/
		if (diccionario==0) {//Si es 0 entonces buscamos en el diccionario ingles
			return diccionarioIngles.get(indice);
		}else if(diccionario==1){
			return diccionarioEspanol.get(indice);
		}
		return null;
		
		
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TraductorInglesEspaniol frame = new TraductorInglesEspaniol();
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
	public TraductorInglesEspaniol() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent arg0) {
				diccionarioEspanol = abrirDiccionario("diccionarioEspanol.txt");
				diccionarioIngles = abrirDiccionario("diccionarioIngles.txt");

			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 675, 442);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblIngles = new JLabel("Ingles");

		txtIngles = new JTextField();
		txtIngles.setColumns(10);

		JLabel lblEspanol = new JLabel("Español");

		txtEspanol = new JTextField();
		txtEspanol.setColumns(10);

		JButton btnInglesEspanol = new JButton("->");
		btnInglesEspanol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String texto = txtIngles.getText().toString();
				int indice = buscarPalabra(texto, 0);
				txtEspanol.setText(traducirPalabra(indice, 1));

			}
		});

		JButton btnEspanolIngles = new JButton("<-");
		btnEspanolIngles.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String texto = txtEspanol.getText().toString();
				int indice = buscarPalabra(texto, 1);
				txtIngles.setText(traducirPalabra(indice, 0));
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
				gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
						.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
								.addGroup(gl_contentPane.createSequentialGroup()
										.addGap(147)
										.addComponent(lblIngles)
										.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(btnInglesEspanol))
										.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
												.addGap(121)
												.addComponent(txtIngles, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
												.addGap(47)
												.addComponent(btnEspanolIngles)))
												.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
														.addGroup(gl_contentPane.createSequentialGroup()
																.addGap(86)
																.addComponent(lblEspanol))
																.addGroup(gl_contentPane.createSequentialGroup()
																		.addGap(44)
																		.addComponent(txtEspanol, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)))
																		.addGap(183))
				);
		gl_contentPane.setVerticalGroup(
				gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
						.addGap(113)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblIngles)
								.addComponent(lblEspanol)
								.addComponent(btnInglesEspanol))
								.addGap(18)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(txtIngles, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(btnEspanolIngles)
										.addComponent(txtEspanol, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addContainerGap(229, Short.MAX_VALUE))
				);
		contentPane.setLayout(gl_contentPane);
	}



	
}
