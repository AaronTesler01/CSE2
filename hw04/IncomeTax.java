//Aaron Tesler
//Homework 04 Part 1
//Income Tax

import java.util.Scanner;
//importing the scanner
public class IncomeTax{
    //class
    public static void main(String args[]){
        //method
        Scanner incomeScanner;
        incomeScanner=new Scanner(System.in);
        //using scanner
        System.out.print("Enter an int giving the number of thousands- ");
            if (incomeScanner.hasNextDouble()){
                //making the main formula
                double income=incomeScanner.nextDouble();
                if (income<0){
                    System.out.println("You did not enter a positive integer.");
                    return;
                }
                else if (income<20 && income>=0){
                    double Tax=.05;
                    System.out.println("The tax rate on "+income+" is "+Tax+"and the tax is"+((1+Tax)*income)+".");
                } else if (income>=20 && income<40){
                double Tax=.07;
                System.out.println("The tax rate on "+income+" is "+Tax+"and the tax is"+((1+Tax)*income)+".");
                } else if (income>=40 && income<78){
                double Tax=.12;
                System.out.println("The tax rate on "+income+" is "+Tax+"and the tax is"+((1+Tax)*income)+".");
                } else if (income>=78){
                double Tax=.14;
                System.out.println("The tax rate on "+income+" is "+Tax+"and the tax is"+((1+Tax)*income)+".");
                }
            }
            else {
                System.out.println("You did not enter an int.");
                return;
            }
            
}    
    
}
