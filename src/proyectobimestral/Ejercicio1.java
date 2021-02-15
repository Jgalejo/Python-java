/*
 * To change this license header, choose License Headers in Project Properties.
 Leer n números enteros,
almacenarlos en un vector y
determinar en qué posición está el
menor número primo.
 */
package proyectobimestral;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        
        int n,div;
        
        System.out.println("Ingrese la cantidad de elementos del vector");
        n=leer.nextInt();
        
        int arreglo[]=new int [n];
        System.out.println("Digite los elementos");
        for(int i=0;i<n;i++){
           arreglo[i]=leer.nextInt();
           div=0;
           for(int j=1;j<arreglo[i];j++){
               if(arreglo[i]%j==0){
                   div++;
               }
           }
           if(div==2){
               int menor,mayor;
               
               menor=mayor=arreglo[0];
               for(int k=1;k<arreglo[i];k++){
                   if(arreglo[i]>mayor){
                       mayor=arreglo[i];
                   }
                   if(arreglo[i]<menor){
                       menor=arreglo[i];
                       
                         
                   }
              System.out.println("El primo menor es "+mayor);
               }
                      
               
              

           }
       
        }
        
          
	
	


        
    }
    
}
