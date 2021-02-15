/*
 Elabore un algoritmo que reciba como datos de entrada un n´umero entero
positivo n y los n elementos de un vector de tama˜no n, y que regrese como
dato de salida cu´antas veces se repite el ´ultimo elemento del vector
 */
package proyectobimestral;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int n,c,i,repetido;
        c=0;
        i=0;
        repetido=0;
        System.out.println("Ingrese la cantidad de elementos del vector");
        n=leer.nextInt();
        
	int vector[]=new int[n];
        
        System.out.println("Digite los elementos del vector");
        for( i=0;i<n;i++){
            vector[i]=leer.nextInt();
            }
        for( n=n;n>0;n--){
                repetido=n;
                if(repetido==vector[i]){
                    
                    c++;
                }
                  if(c>0){
                    System.out.println("El numero "+vector[n]+" se repite"+c+" veces en el arreglo");
                }
        }
	
    }

}