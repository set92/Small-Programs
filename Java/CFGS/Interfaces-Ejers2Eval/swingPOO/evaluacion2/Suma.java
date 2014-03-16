package evaluacion2;

import javax.swing.JOptionPane;

public class Suma {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
//		Obtiene la entrada del usuario de los dialogos de entrada de JOptionPane
		String primerNumero = JOptionPane.showInputDialog("Introduzca el primer entero");
		String segundoNumero = JOptionPane.showInputDialog("Introduzca el segundo entero");
		
//		Pasamos los numeros a int para poder sumarlo despues
		int numero1 = Integer.parseInt(primerNumero);
		int numero2 = Integer.parseInt(segundoNumero);
		
		int suma = numero1+numero2;
		
//		Muestra los resultados en un dialogo de mensaje de JOptionPane
		JOptionPane.showMessageDialog(null, "La suma es "+suma, "Suma de dos enteros", JOptionPane.QUESTION_MESSAGE);
		
		
	}

}
