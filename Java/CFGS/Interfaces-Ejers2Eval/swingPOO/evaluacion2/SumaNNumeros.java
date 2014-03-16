package evaluacion2;

import javax.swing.JOptionPane;

public class SumaNNumeros {

	public static void main(String[] args) {
		int suma=0;
		JOptionPane.showMessageDialog(null, "Bienvenido al programa", "Sumatorio de numeros", JOptionPane.INFORMATION_MESSAGE);
		
		do {
			suma+=Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero para sumar"));
		} while (JOptionPane.showConfirmDialog(null, "¿Quiere seguir introduciendo numeros?", "Aviso", JOptionPane.OK_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE)
				!= JOptionPane.CANCEL_OPTION);

		JOptionPane.showMessageDialog(null, "La suma de los numeros es "+suma, "La suma total", JOptionPane.INFORMATION_MESSAGE);
	}
}
