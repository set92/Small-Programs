package ejemplo;

import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.StringReader;

public class EjemploFlujos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = new String("En un lugar de la mancha de cuyo nombre no quiero acordarme, ");
		s=s+"no ha mucho tiepo que vivia un hidalgo de los de lanza en astillero, ";
		s=s+"adarga antigua, rocin flaco y galgo corredor...";
		char[] array = new char[s.length()];
		int car=0;
		StringReader flujoInput = new StringReader(s);
		CharArrayWriter flujoOutput = new CharArrayWriter();
		try {
			while ((car=flujoInput.read()) != -1) {
				flujoOutput.write(car);
			}
			array=flujoOutput.toCharArray();
			System.out.println(array);
		} catch (IOException e) {
			System.out.println("ERROR");
		}
		
		
	}

}
