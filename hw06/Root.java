//Aaron Tesler
//Homework 06 Part 2

import java.util.Scanner;

public class Root{//class
    public static void main(String args[]){//method
        Scanner rootScanner;
        rootScanner= new Scanner(System.in);
        
        System.out.print("Enter a number:");
            double x=rootScanner.nextDouble();//original number
            double low=0;//orignal low
            double high=(x+1);//original high
            while ((high-low)>=(.0000001*(1+x))){
                double middle=(low+high)/2;
                if (((middle*middle)>x)){//if middle is too high
                    high=(middle);
                    middle=(low+high)/2;
                    
                }
                else if (((middle*middle)<=x)){//if middle is too low
                   low=(middle);
                   middle=(low+high)/2;
                }
            
            }
            double middle=(low+high)/2;//reintroducing middle
            System.out.println("The root is "+middle);//Final answer
            
    }
}