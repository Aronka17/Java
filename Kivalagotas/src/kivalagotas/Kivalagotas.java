/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kivalagotas;
import java.util.Scanner;
/**
 *
 * @author Áron
 */
public class Kivalagotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //5 elemű tömb

        int[] erdemJegy;
        erdemJegy = new int[5];
        int szam;

        //random 1-5 között

        Scanner bemenet = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Adj meg egy szamot 1 és 5 között");
            erdemJegy[i] = bemenet.nextInt();

            while (!(erdemJegy[i]<= 5 && erdemJegy[i]>= 1)) {
            System.out.println("Rossz számot adtál meg! Adj meg egy szamot 1 és 5 között");
            erdemJegy[i] = bemenet.nextInt();
            }

        }

        }


    }
    
    

