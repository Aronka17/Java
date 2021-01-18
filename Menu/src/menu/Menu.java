/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;
import java.util.Scanner;
/**
 *
 * @author Áron
 */
public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int[] szamok = new int[20];

        for(int i = 0; i < 20; i++) {
            szamok[i] = (int) (Math.random()*100)-50;
        }
        System.out.println("A tömb elemei: ");
            for (int i = 0; i < 20; i++) {
                System.out.print(szamok[i]+ ", ");
        }
        Scanner bemenet = new Scanner(System.in);
            System.out.println("\nMENÜ");
            System.out.println("1 - összeget számoltatni");
            System.out.println("2 - szélsőértékeket kiíratni");
            System.out.println("3 - van-e benne 40-50");
            System.out.println("4 - 5-tel osztható páros számok db-száma");
            System.out.println("5 - adott számot tartalmazza-e");
            System.out.print("\nVálasszon a menüpontok közül(1-5)! ");
        int valasz = bemenet.nextInt();


 


    }

}

 


    

