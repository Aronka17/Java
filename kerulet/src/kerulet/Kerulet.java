/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kerulet;
import java.util.Scanner;

public class Kerulet {

    
    public static void main(String[] args) {
        int valasz=1;
        switch(valasz ){
            case 0:
                
        }
    
        
        
        System.out.println(teglalapKerulet(0, 0));
    }
        public static double teglalapKerulet (double a, double b) {
        return (a + b) * 2;
    }
    
    
    public static double korKerulet (double r) {
        return 2 * r * Math.PI;
    }
    
   
    public static double haromszogKerulet (double a, double b, double c) {
        return a + b + c;
    }
    
    
    public static double otszogKerulet (double a) {
        return 5 * a;
    }
    
    
    public static double hatszogKerulet (double a) {
        return 6 * a;
    }
    }
    

