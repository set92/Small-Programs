package sergio;
/* Ejercicio 32 - Ejercicios con estructuras de control
 * Calcula el IMC del usuario informandole del diagnostico y conducta a seguir.
 * IMC = PESO (KG) / ALTURA(m2) ("else if" y conversiones). 7 Tipos de diagnostico.
 * Autor: Sergio Tobal
 * Fecha: 17-12-2011
 */

import java.io.*;
public class ejer32 {
	
	public static void main (String args[])throws Exception {
		BufferedReader lectura=new BufferedReader (new InputStreamReader (System.in));
		double peso, altura, IMC;
		int genero;
		
		System.out.println("Peso (en kg): ");
		peso=Double.parseDouble(lectura.readLine());
		System.out.println("Altura (en metros): ");
		altura=Double.parseDouble(lectura.readLine());
		
		System.out.println("\n1. Hombre");
		System.out.println("2. Mujer");
		genero=Integer.parseInt(lectura.readLine());
		IMC=peso/(altura*altura);
		System.out.println("\nTu IMC es: "+IMC+"\n");
		
		while (genero==1){
			if (IMC<16){
				System.out.println("Desnutricion");
				System.out.println("Acude a un medico");break;
			}
			else if (IMC>17 && IMC<20){
				System.out.println("Bajo peso");
				System.out.println("Alimentate mejor");break;
			}
			else if (IMC>21 && IMC<24){
				System.out.println("Normal");
				System.out.println("Felicidades");break;
			}
			else if (IMC>25 && IMC<29){
				System.out.println("Sobrepeso");
				System.out.println("Dieta, ejercicio y Medicinas");break;
				}
			else if (IMC>30 && IMC<34){
				System.out.println("Obesidad");
				System.out.println("Medicinas, globo o cirugia");break;
			}
			else if (IMC>35 && IMC<39){
				System.out.println("Obes. Marcada");
				System.out.println("Cirugia Bariartrica");break;
			}
			else if (IMC>=40){
				System.out.println("Obes. Morbida");
				System.out.println("URGENTE CIRURGIA!");break;
			}
		}
		while (genero==2){
			if (IMC<17){
				System.out.println("Desnutricion");
				System.out.println("Acude a un medico");break;
			}
			else if (IMC>18 && IMC<20){
				System.out.println("Bajo peso");
				System.out.println("Alimentate mejor");break;
			}
			else if (IMC>21 && IMC<25){
				System.out.println("Normal");
				System.out.println("Felicidades");break;
			}
			else if (IMC>26 && IMC<30){
				System.out.println("Sobrepeso");
				System.out.println("Dieta, ejercicio y Medicinas");break;
				}
			else if (IMC>31 && IMC<35){
				System.out.println("Obesidad");
				System.out.println("Medicinas, globo o cirugia");break;
			}
			else if (IMC>36 && IMC<40){
				System.out.println("Obes. Marcada");
				System.out.println("Cirugia Bariartrica");break;
			}
			else if (IMC>40){
				System.out.println("Obes. Morbida");
				System.out.println("URGENTE CIRURGIA!");break;
			}
		}

		
	}
}

