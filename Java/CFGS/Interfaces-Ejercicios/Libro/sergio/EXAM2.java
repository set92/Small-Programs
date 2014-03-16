package sergio;
//			************EXPLICACION DEL FOR*************
//			LA i SON EL TOTAL DE LINEAS QUE VA A ESCRIBIR
//			LA j SE ENCARGA DE LOS * Y DE CUANTOS AHI POR LINEAS
//			for (j=1;j<=(INCREMENTO DE * CADA LINEA)*(i-(NUMERO DE LINEA QUE EMPIEZA))+(NUMERO DE * EN LINEA 1);j++) {
//				System.out.print("*");
//			}
public class EXAM2 {

	public static void main(String[] args) {
		int i,j, numero=8;
		System.out.println("------------------------> LA NUEVA PIRAMIDE DE EGIPTO <------------------------");
		for (i=8;i>=1;i--){
			for (int espacio = 0; espacio < 30; espacio++) {
				System.out.print(" ");//Bucle solo para poder centrar la piramide y que se ve mejor
			}
			for (j=i-1;j<=1*(i-1)+1;j++) {
				System.out.print(numero+" ");
				numero-=1;//decremento del numero por cada linea
				
			}
			System.out.println("");
			numero=8;//inicializacion otra vez del numero a 8 para que la siguiente linea empiece a 8
		}
	}

}
