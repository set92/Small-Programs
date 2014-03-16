package evaluacion2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class FormularioMB2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormularioMB2 frame = new FormularioMB2();
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
	public FormularioMB2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 737, 465);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnOpciones = new JMenu("Opciones");
		menuBar.add(mnOpciones);
		
		JMenu mnTamanoVentana = new JMenu("Tamaño de la ventana");
		mnOpciones.add(mnTamanoVentana);
		
		JMenuItem mntmx = new JMenuItem("640x480");
		mntmx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setSize(640,480);
			}
		});
		mnTamanoVentana.add(mntmx);
		
		JMenuItem mntmx_1 = new JMenuItem("1024x768");
		mntmx_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setSize(1024,768);
			}
		});
		mnTamanoVentana.add(mntmx_1);
		
		JMenu mnColorDeFondo = new JMenu("Color de fondo");
		mnOpciones.add(mnColorDeFondo);
		
		JMenuItem mntmRojo = new JMenuItem("Rojo");
		mntmRojo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				contentPane.setBackground(new Color(255, 0, 0));
			}
		});
		mnColorDeFondo.add(mntmRojo);
		
		JMenuItem mntmVerde = new JMenuItem("Verde");
		mntmVerde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				contentPane.setBackground(new Color(0, 255, 0));
			}
		});
		mnColorDeFondo.add(mntmVerde);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
