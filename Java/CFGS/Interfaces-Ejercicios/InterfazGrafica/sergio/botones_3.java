package sergio;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JButton;
import javax.swing.WindowConstants;

public class botones_3 {

	/**
	 * @param args
	 * @throws UnsupportedLookAndFeelException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		JFrame frame = new JFrame("Titulo");
		JPanel panel = new JPanel(new FlowLayout());
		panel.setLayout(new FlowLayout());
		UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
		frame.getContentPane().add(panel);
//		Definimos la accion al pulsar el exit de la ventana, en este caso cerrara el programa
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
//		Se crean los controles del contenedor
		JButton btnValor1 = new JButton("Boton 1");
		panel.add(btnValor1);
		JButton btnValor2 = new JButton("Boton 2");
		panel.add(btnValor2);
		JButton btnValor3 = new JButton("Boton 3");
		panel.add(btnValor3);

		
		
		
		//El .pack establece el tamaño del frame coincidiendo con el tamaño de todos los componentes
		//frame.pack();
		frame.setSize(400, 200);
		frame.setVisible(true);
		
		
	}

}
