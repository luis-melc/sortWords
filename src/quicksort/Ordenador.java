/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package quicksort;

/**
 *
 * @author luis
 */
public class Ordenador {
   
    public String[] quickSort (String words[],int left, int rigth){
        if (left >= rigth) {
            return words;
        }
        int izq = left, der = rigth;
        if(left != rigth){
            int pivote;
            String aux;
            pivote = left;
            while (left != rigth) {
                // while (words[rigth] >= words[pivote] && left < rigth)
                while (words[rigth].compareToIgnoreCase(words[pivote]) > 0 && left < rigth)

                    rigth--;
                while(words[left].compareToIgnoreCase(words[pivote]) < 0 && left < rigth)
                    left++;
                if (rigth != left) {
                    aux = words[rigth];
                    words[rigth] = words[left];
                    words[left] = aux;
                }
            }
            if(left == rigth){
                quickSort(words, izq, left-1);
                quickSort(words, left+1, der);
            }
        }
        else
            return words;
        return words;

    }

}
