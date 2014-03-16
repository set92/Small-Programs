package sergio;
//Ejercicio 7
//Realiza un programa que calcule los numeros primos del 1 hasta el 1000
//Autor: Sergio Tobal
//Fecha: 00-00-2012
public class niko7 {

	public static void main(String[] args) {
		
		for(int i=1;i<=1000; i++){//i es el numero primo que mostrara al final
            int contador=0; //Inicializamos un contador a cero para cada numero que se comprueba
            for(int j=1;j<=i; j++){
              int modulo = i % j;
              if(modulo == 0){
                  contador = contador + 1;
              }
              if((i == j)&&(contador == 2)){//un numero es primo si es divisible por 1 o por el mismo
            	  System.out.println(i);
              }
            }
        }  
	}

}
