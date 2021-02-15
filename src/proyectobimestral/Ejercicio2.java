/*
 Leer dos matrices 5x5 entera y determinar
si el promedio de los mayores elementos
que pertenecen a la serie de Fibonacci de
cada fila de una matriz es igual al
promedio de los mayores elementos que
pertenecen a la serie de Fibonacci de
cada fila de la otra matriz
 */
package proyectobimestral;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int a,b,c,d;
        boolean promedio1,promedio2;
        promedio1=false;
        promedio2=false;
        a=0;
        b=1;
        int nf=0;
        int matriz1[][]=new int[5][5];
        int matriz2[][]=new int [5][5];
        System.out.println("Ingrese la cantidad de elementos para la serie fibonacci");
        nf=leer.nextInt();
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                for(int k=0;k<nf;k++){
                c=a+b;
                a=b;
                b=c;
                d=c;
                 for( i=0;i<nf;i++){
            for( j=0;j<nf;j++){
                System.out.print(matriz1[c][d]);
            }
        } 
                }
                
            }
            promedio1=true;
                
            
        }
        
        System.out.println("Ingrese la cantidad de elementos para la serie fibonacci");
        nf=leer.nextInt();
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                for(int k=0;k<nf;k++){
                c=a+b;
                a=b;
                b=c;
                d=c;
                 for( i=0;i<nf;i++){
            for( j=0;j<nf;j++){
                System.out.print(matriz2[c][d]);
            }
        } 
                }
                
            }
            promedio2=true;
        }
        
        if(promedio1==promedio2){
            System.out.println("Son iguales");
        }
        else{
            System.out.println("No son iguales");
        }
        
    }
}
