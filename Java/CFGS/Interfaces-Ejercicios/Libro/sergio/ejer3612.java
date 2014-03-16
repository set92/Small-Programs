package sergio;
/* Ejercicio 12
 * Realiza un programa que dado un importe en euros nos indique el minimo numero de billetes
 * y la cantidad sobrante que se puede utilizar para obtener dicha cantidad.
 * Autor: Sergio Tobal
 * Fecha: 20-12-2011
 */
 
 import java.io.*;
 public class ejer3612{
	public static void main(String[] args)throws IOException{
        int p=1321, a,b,c,d,e,f,g,x,y,z,m,n,l,s;
        a=p/500;
        x=p%500;
        b=x/200;
        y=x%200;
        c=y/100;
        z=y%100;
        d=z/50;
        m=z%50;
        e=m/20;
        n=m%20;
        f=n/10;
        l=n%10;
        g=l/5;
        s=l%5;
        System.out.println(p+" :");
        if (a==1){
            System.out.println(a+" billete de 500€");}
        else if(a==0){
            System.out.print("");
        }
        else{
            System.out.println(a+" billetes de 500€");

        }
        if (b==1){
            System.out.println(b+" billete de 200€");}
        else if(b==0){
            System.out.print("");
        }
        else{
            System.out.println(b+" billetes de 200€");

        }
        if (c==1){
            System.out.println(c+" billete de 100€");}
         else if(c==0){
            System.out.print("");
        }
        else{
            System.out.println(c+" billetes de 100€");

        }
        if (d==1){
            System.out.println(d+" billete de 50€");}
         else if(d==0){
            System.out.print("");
        }
        else{
            System.out.println(d+" billetes de 50€");

        }
        if (e==1){
            System.out.println(e+" billete de 20€");}
         else if(e==0){
            System.out.print("");
        }
        else{
            System.out.println(e+" billetes de 20€");

        }
        if (f==1){
            System.out.println(f+" billete de 10€");}
         else if(f==0){
            System.out.print("");
        }
        else{
            System.out.println(f+" billetes de 10€");

        }
        if (g==1){
            System.out.println(g+" billete de 5€");}
         else if(g==0){
            System.out.print("");
        }
        else{
            System.out.println(g+" billetes de 5€");

        }
        if (s==0){
            System.out.println("No sobra nada");}
        else if (s==1){
            System.out.println("Sobra "+s+" €");

        }
        else{
            System.out.println("Sobran "+s+" €");
        }


    }

}
