/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gerap
 */
public class Busqueda {
    public void burbuja(int [] array){
        int i,j,temporal=0;
        for(i=0; i<array.length; i++){
         for(j=i+1;j<array.length;j++){
            if(array[i]>array[j]){
               temporal=array[i];
               array[i]=array[j];
               array[j]=temporal;
            }
         }
      }
   }
    //Elaborado por Ramón y Jaime
    public int secuencial(int[] array, int dato){
        int i; 
        boolean find=false;
        for(i=0; i<array.length && find==false; i++){
            if(dato==array[i]){
                find=true;
                return i;
            }
        }
        //-1 SIGNIFICA QUE EL NUMERO NO FUE ENCONTRADO.
        return -1;
    }
    //Elaborado por Gerardo y Denílson
    public int binaria(int[]array, int dato){
        int centro, primero, ultimo, valorCentro;
        primero=0;
        ultimo=array.length-1;
        while(primero<=ultimo){
            centro=(primero+ultimo/2);
            valorCentro=array[centro];
            if(dato==valorCentro){
                return centro;
            }else if(dato<valorCentro){
                ultimo=centro-1;
            }else{
                primero=centro+1;
            }
        }
        return -1;
    }
}
