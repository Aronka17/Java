/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buborekok;
import java.util.Scanner;
/**
 *
 * @author Áron
 */
public class Buborekok {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int[] tomb1 = tombDefinialo();
        int[] tomb2 = tombDefinialo();
        int[] tomb3 = tombDefinialo();
        
        tombKiiro(tomb1);
        tombKiiro(tomb2);
        tombKiiro(tomb3);
        
        System.out.println();
        
        System.out.print("\n\nBence megoldása");
        tomb1 = sorbaRendez(tomb1);
        tombKiiro(tomb1);
    }
    
    
    public static int [] sorbaRendez(int [] tomb) {
        for(int i = 0; i < tomb.length - 1; i++) {
            for(int j = 0; j < tomb.length - i - 1; j++) {
                int csere;
                
                if(tomb[j] > tomb[j+1]) {
                    csere = tomb[j];
                    tomb[j] = tomb[j+1];
                    tomb[j+1] = csere;
                }
            }
        }
         return tomb;
    }

    public static int[] tombDefinialo()
    {
        int elemszam = (int) (Math.random() *10) +10;
        int[] tomb = new int[elemszam];
        
        for (int i = 0; i < elemszam; i++) 
            tomb[i] = (int) (Math.random() *200) -100;
        
        return tomb;
    }
    
    public static void tombKiiro(int[] tomb)
    {
        System.out.print("\nTombelemek[" + tomb.length + "]: ");
        for (int i = 0; i < tomb.length; i++) 
            System.out.print(String.format("% 5d", tomb[i]));
    }
    
} 
    
    

