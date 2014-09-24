//Aaron Tesler
//Lab 04
//Big Mac Again 2: Electric Boogaloo
import java.util.Scanner;
//importing scanner
public class BigMacAgain{
    //making the class
    public static void main(String args[]){
    
    Scanner bigScanner;
    bigScanner= new Scanner(System.in);
    
    System.out.print("Enter the number of Big Macs: ");
    if (bigScanner.hasNextInt())
    {int bigMac=bigScanner.nextInt;
        
    }
    else{
        System.out.println("You did not enter an int.");
        return;//program terminates in case of failure to follow reason
    }
    if (bigScanner.nextInt()>0)
    {double costBigMac=2.22;
    double fullCost=costBigMac*bigMac;//brings in cost to this equation
        
    }
    else {
        System.out.println("You did not enter a positive int.");
        return;//program terminates in case of failure to follow reason
    }
    System.out.println("You ordered"+bigMac+"Big Macs for a cost of $"+fullCost+".");
    System.out.print("Do you want an order of fries with that? (Y,y,N,n)");
    if (bigScanner.next()) equals ("Y") {
        double frenchFryCost=2.15;
    }
    else if (bigScanner.next()) equals ("y") {
        double frenchFryCost=2.15;
    }
    else if (bigScanner.next()) equals ("N") {
        double frenchFryCost=0;
    }
    else if (bigScanner.next()) equals ("n") {
        double frenchFryCost=0;
    }
    else {
        System.out.println("You did not enter Y,y,n or N.");
        return;
    }
    System.out.println("You ordered fries at a cost of "+(frenchFryCost)+".");
    System.out.println("The total cost of your meal is: "+(frenchFryCost+fullCost)+".");
    
    }
}