package sergio;
 
public class ejer7810 {
	// Funcion que comprueba si un numero es vampiro a partir de dos semillas.
	   static boolean esVampiro(int[] numeroFinal,int[] semilla1,int[] semilla2){
	      int coincidencias=0;
	 
	      // Si las dos semillas acaban en 0 no es un numero vampiro.
	      if ((semilla1[semilla1.length-1]==0) && (semilla2[semilla2.length-1]==0)){               
	         return false;
	      }
	      // Aqui comprobamos si los numeros de la primera semilla estan incluidos 
	      // en el numero.
	      etiqueta1:
	      for (int i=0;i<semilla1.length;i++){
	         for (int j=0;j<numeroFinal.length;j++){
	            if (semilla1[i]==numeroFinal[j]){
	               coincidencias++;               
	               numeroFinal[j]=-1;
	               continue etiqueta1;
	            }                        
	         }
	      }
	      // Si los numeros de la primera semilla estan incluidos en el numero vamos
	      // comprobar si los numeros de la segunda tambien estan incluidos.
	      if (coincidencias==2){  
	        etiqueta2:       
	        for (int i=0;i<semilla2.length;i++){
	            for (int j=0;j<numeroFinal.length;j++){
	               if (semilla2[i]==numeroFinal[j]){                 
	                  coincidencias++;
	                  numeroFinal[j]=-1;
	                  continue etiqueta2;               
	               }
	            }              
	         }
	      } else {
	          return false;
	      }
	      // Si los numeros de la primera y segunda semilla coinciden con los
	      // del numero entonces hemos encontrado un numero vampiro.
	      if (coincidencias==4){
	         return true;
	      } else {
	         return false;
	      }
	   }

	   // Con esta funcion pasamos cada digito de un numero a una matriz de enteros.
	   static int[] convertirNumAMatriz(int num,int valores){
	      int resto=0;
	      int indice=0;
	      int matriz[]=new int[valores];    
	      while (num>0){
	         resto=num%10;
	         matriz[indice]=resto;
	         indice++;
	         num=num/10;
	      }
	      return matriz;
	   }

	   public static void main(String args[]){

	      int num;    
	      int numDigitos=0;

	      // Vamos a ver los numeros vampiro de 4 digitos que hay.    
	      for (int numero=1000;numero<10000;numero++){
	         num=numero;
	         while (num>0){
	            num=num/10;
	            numDigitos++;
	         }
	         for (int i=10;i<100;i++){
	            for (int j=i;j<100;j++){
	               if (i*j==numero){                 
	                  if (esVampiro(convertirNumAMatriz(numero,numDigitos),convertirNumAMatriz(i,numDigitos/2),convertirNumAMatriz(j,numDigitos/2)))
	                     System.out.println("Numero Vampiro!!! "+numero+" = "+i+"*"+j);
	               }
	            }
	         }  
	      numDigitos=0;
	      }
	      System.out.println("Fin");
	   }
}
    
    