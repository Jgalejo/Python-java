/*
 Construir una función que reciba como
parámetro un vector de 10 posiciones
enteras y retorne la posición del mayor
número primo almacenado en el vector
 */
package proyectobimestral;

/**
 *
 * @author Gabriel
 */
public class ejercicio3 {
    public static void main(String[] args) {
        
        
        
        
    }
    
    public static int vector(){
        
     int arreglo[]={1,5,8,3,4,9,8,3,4,7,9};
     int i;
     
     for(i=0;i<arreglo.length;i++){
         int div=0;
         for(int j=1;j<arreglo[i];j++){
             if(arreglo[i]%j==0){
                 div++;
             }
         }
         if(div==2){
             
            int mayor,menor;
            
            menor=mayor=arreglo[0];
            for(int k=1;k<arreglo[i];k++){
                if(arreglo[i]>mayor){
                    mayor=arreglo[i];
                }
                if(arreglo[i]<menor){
                    menor=arreglo[i];
                }
                System.out.println("El primo mayor es "+mayor);
            }
               
         }
     }
     
     
       
       return(arreglo[i]); 
    }
    
}
