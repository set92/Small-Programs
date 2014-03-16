package sergio;

import javax.swing.*;
// PROGRAMA QUE MUESTRA HOLA MUNDO PERO NO SE USA LA POO
public class HolaMundo_Graphics {
	
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
//		Creamos un contenedor donde se mostrara todo lo demas
		JFrame frame=new JFrame("Ventana Hola Mundo");
//		Definimos la accion al pulsar el exit de la ventana, en este caso cerrara el programa
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		
//		Decimos que haya un label llamado label con el contenido Hola Mundo
		JLabel label=new JLabel("Hola mundo");
//		Empezamos a añadir las cosas en el contenedor en su posicion
		frame.getContentPane().add(label);
		frame.setSize(300, 200);
		UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		
		
	}
}
