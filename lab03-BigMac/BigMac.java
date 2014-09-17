//Aaron Tesler
//Lab 03
//Computing the total tax for Big Macs for various tax percents, costs, and amounts
//New Scanner class
import java.util.Scanner;
//Class
public class BigMac {
    
    //Main Method
    public static void main(String[] args) {
        //declare that myScanner is a scanner
        //tell myScanner that it takes commands from "STDIN".
        //Whatever that is.
        Scanner myScanner;
        myScanner=new Scanner(System.in);
        
        System.out.print(
            "Enter the number of Big Macs(an interger >0): ");
            int nBigMacs=myScanner.nextInt();
        
        System.out.print("Enter the cost per Big Mac as"+
         "a double (in the form xx.xx): ");
         double BigMac$ = myScanner.nextDouble();
         System.out.print(
             "Enter the percent tax as a whole number (xx): ");
           double taxRate= myScanner.nextDouble();
           taxRate/100; //user enters percent, I want proportion
           
        double cost$;
        int dollars, //whole dollar amount of cost
        dimes, pennies; //for storing digits
        //to the right of the decimal point
        //for the cost$
        cost$=nBigMacs*BigMac$*(1+taxRate);
        //get dimes amount e.g.
        //(int) (6.73*10) % 10 -> 67 % 10 -> 7
        //where the % (mod) operator removes the remainder
        //after the division: 583%100 -> 83, 27%5 -> 2
        dimes=(int)(cost$*10)%10;
        pennies=(int)(cost$*100)%10;
        System.out.println("The total cost of " +nBigMacs
        +" BigMacs, at $"+BigMac$ +" per BigMac, with a" + 
        "sales tax of "+ (int)(taxRate*100) + "%, is $"+dollars+'.'+dimes+pennies);
        
        
    }//end of main method
}//end of class
