/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertionsort;

/**
 *
 * @author Eric Farias
 */
public class InsertionSort {

   public static void sort(int []v){
       for(int i = 1; i < v.length; i++){
           int aux = v[i];
           int j = i - 1;
           while(j >= 0 && v[j] > aux){
               v[j + 1] = v[j];
               v[j] = aux;
               j--;
           } 
       }
   }
}
