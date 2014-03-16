package sergio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejer566_m {
	public static void main(String[] args) throws NumberFormatException, IOException {
		String medid;
		double pes;
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.println("Cuanto peso tienes?");
		pes=Integer.parseInt(lectura.readLine());
		System.out.println("¿En que medida?");
		medid=lectura.readLine();
		
		ejer566 objPesoKg = new ejer566(pes,medid);
		
		System.out.println("Los Kg en Libras son: "+objPesoKg.getLibras(objPesoKg.getPeso()));
		System.out.println("Los Kg en Lingotes son: "+objPesoKg.getLingotes(objPesoKg.getPeso()));
		
		System.out.println("¿En que medida quieres el resultado?");
		medid=lectura.readLine();
		System.out.println("Los Kg en "+medid+" es"+objPesoKg.getPeso(pes, medid));
		
	}

}
