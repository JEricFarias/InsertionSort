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

import java.util.Random;

public class MainApp {
    public static void main(String []args){
        // cria e preence randomicamente um vetor;
        int []vet = new int[200];
        Random rd = new Random();
        for(int i = 0; i < vet.length; i++){
            vet[i] = rd.nextInt(101);
        }
        
        // envia para o Insertion-Sort para a ordenação;
        InsertionSort.sort(vet);
        
        // Escreve o resultado
        for(int i = 0; i < vet.length; i++){
            System.out.print(vet[i] + " ");
            if( (i%10) == 0){
                System.out.println();
            }
        }
    }
}
