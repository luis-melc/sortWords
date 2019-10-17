/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package quicksort;

import java.util.Scanner;

/**
 *
 * @author luis
 */
public class QuickSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int tam = 5;
        String[] words = new String[tam];

        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < tam; i++) {
            System.out.print("Introduzca una palabra: ");
            words[i] = teclado.nextLine();
        }

        Ordenador sort = new Ordenador();
        sort.quickSort(words,0,words.length-1);
        
        System.out.println();
        System.out.println();
        System.out.println("************************");
        System.out.println("Palabras Ordenadas");
        System.out.println("************************");
        
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
        
        
    }

}
