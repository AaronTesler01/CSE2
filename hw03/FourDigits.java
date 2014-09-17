//Aaron Tesler
//Homework Part 3
//Four Digits
import java.util.Scanner;
//importing the scanner
public class FourDigits{
    public static void main(String args[]){
        
        Scanner digitScanner;
        digitScanner=new Scanner(System.in);
        
        System.out.print("Enter a double and watch the last 4 digits appear: ");
            double digitalis=digitScanner.nextDouble();
            int poison=(int) digitalis;
            double liar=poison*10000;
            int scream=(int) liar;
            int decimal=scream%10000;
            
        System.out.print("The four digits are: " +decimal+ ".");
    }
}