//Aaron Tesler
//Lab 07: Loop The loop

import java.util.Scanner;
public class LoopTheLoop{//class
    public static void main( String args[]){
        
        int nStars=10;
        int c=1;
        int d=1;
        while (c<=nStars){
            System.out.print("*");
            c++
        }
        while (c<=nStars){
            for (d=1;d<=c;d++){
                System.out.print("*");
                }
            c++;
            System.out.println();
            
        } 
            
        
        
    }
}