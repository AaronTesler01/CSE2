//Aaron Tesler
//Lab 07: Loop The loop

import java.util.Scanner;
public class LoopTheLoop{//class
    public static void main( String args[]){
        Scanner star;
        star=new Scanner(System.in);
        System.out.print("Enter an int between 1 and 15.");
        int z = 0;
        String s = "";
        if(star.hasNextInt()==false){
            while(star.hasNextInt()==false){
                s = star.next();
                System.out.print("Enter an int between 1 and 15.");
                if(star.hasNextInt()){
                    z=star.nextInt();
                    break;
                }
                s = star.next();
            }        
        }
        else{
            z = star.nextInt();
        }
        int q = z;
     
        while((z>15)||(z<1)){
            System.out.print("The int is not in range. Try again. " + q);
            z=star.nextInt();
        }
        
        int nStars=z;
        int c=1;
        int d=1;
        int e=1;
        while (c<=nStars){
            System.out.print("*");
            c++;
        }
        System.out.println();
        
            for (d=1;d<=nStars;d++){
                for (int x=1;x<=d;x++){
                System.out.print("*");
                }
                System.out.println();
            }
            
            
        } 
            
        
        
    }
