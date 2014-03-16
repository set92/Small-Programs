package windowBuilder;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.print.attribute.standard.Finishings;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AppPrueba {

	private JFrame frame;
	private JTextPane textPane;
	private File file;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppPrueba window = new AppPrueba();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AppPrueba() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(AppPrueba.class.getResource("/windowBuilder/assets/avatarset92.JPG")));
		frame.setBounds(100, 100, 650, 375);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		frame.getContentPane().add(scrollPane, BorderLayout.CENTER);
		
		textPane = new JTextPane();
		scrollPane.setViewportView(textPane);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu menuArchivo = new JMenu("Archivo");
		menuBar.add(menuArchivo);
		
		JMenuItem mntmAbrir = new JMenuItem("Abrir");
		mntmAbrir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser fileChooser = new JFileChooser();
				int seleccion = fileChooser.showOpenDialog(textPane);
				
				if (seleccion == JFileChooser.APPROVE_OPTION) {
					try {
						file = fileChooser.getSelectedFile();
						BufferedReader reader = new BufferedReader(new FileReader(file));
					    StringBuffer bufferTexto = new StringBuffer();

					      String linea = reader.readLine();

					      while (linea != null) {
					        bufferTexto.append(linea);
					        bufferTexto.append(System.getProperty("line.separator"));

					        linea = reader.readLine();
					      }
					      textPane.setText(bufferTexto.toString());
					      reader.close();
					} catch (Exception e) {
						
						
					}
					
				}
			}
		});
		mntmAbrir.setMargin(new Insets(0, 0, 0, 50));
		menuArchivo.add(mntmAbrir);
		
		JMenuItem mntmGuardar = new JMenuItem("Guardar");
		mntmGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileChooser = new JFileChooser();
				int seleccion = fileChooser.showSaveDialog(textPane);
				
				if (seleccion == JFileChooser.APPROVE_OPTION) {
					PrintWriter writer;
					try {
						writer = new PrintWriter(file);
						writer.print(textPane.getText());
						writer.close();
					} catch (FileNotFoundException e1) {
						e1.printStackTrace();
					}
				}
				
			}
		});
		menuArchivo.add(mntmGuardar);
		
		JSeparator separator_1 = new JSeparator();
		menuArchivo.add(separator_1);
		
		JMenuItem mntmSalir = new JMenuItem("Salir");
		mntmSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		menuArchivo.add(mntmSalir);
		
		JMenu menuEditar = new JMenu("Editar");
		menuBar.add(menuEditar);
		
		JMenuItem mntmBuscar = new JMenuItem("Buscar");
		mntmBuscar.setMargin(new Insets(0, 0, 0, 50));
		menuEditar.add(mntmBuscar);
		
		JSeparator separator = new JSeparator();
		menuEditar.add(separator);
		
		JMenuItem mntmCortar = new JMenuItem("Cortar");
		mntmCortar.setToolTipText("Ctrl+X");
		menuEditar.add(mntmCortar);
		
		JMenuItem mntmCopiar = new JMenuItem("Copiar");
		menuEditar.add(mntmCopiar);
		
		JMenuItem mntmPegar = new JMenuItem("Pegar");
		menuEditar.add(mntmPegar);
	}
}
