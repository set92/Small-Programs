package sergio;

import java.io.*;
public class ejer775 {
	
	
	public static void main(String[] args)throws IOException {
		int fechanacimiento=29071970, dia=0, mes=0, ano=0, luckynumber=0, luck1=0, luck2=0, luck3=0, luck4=0, lucktotal=0;

		
		dia=fechanacimiento/1000000;
		mes=(fechanacimiento/10000)%100;
		ano=fechanacimiento%10000;
		System.out.println("La fecha es "+dia+"-"+mes+"-"+ano);
		luckynumber=dia+mes+ano;
		System.out.println("Suma de dia, mes, a�o: "+luckynumber);
		luck1=luckynumber/1000;
		luck2=(luckynumber/100)%10;
		luck3=(luckynumber/10)%100;
		luck4=luckynumber%1000;
		lucktotal=luck1+luck2+luck3+luck4;
		System.out.println("Tu numero de la suerte es: "+lucktotal);
	}
	

}