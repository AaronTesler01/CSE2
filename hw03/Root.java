//Aaron Tesler
//Homework 3 part 2
//Root
//finding the cubed root of everything
import java.util.Scanner;
//importing the scanner
public class Root{
    //class
    public static void main(String[] args) {
        Scanner theScanner;
        theScanner=new Scanner(System.in);
        //making the scanner
        
        System.out.print("I am Root. Give me double and I give you cube root: ");
            double why=theScanner.nextDouble();
           //A little reference and making the question
           
            double truth=why/3;
            //making the guess variable
            double guess2=(((truth*truth*truth)+why)/(3*truth*truth));
            double guess3=(((guess2*guess2*guess2)+why)/(3*guess2*guess2));
            double guess4=(((guess3*guess3*guess3)+why)/(3*guess3*guess3));
            
            System.out.print("The root is "+guess4+". The root cubed is "+guess4+"*"+guess4+"*"+guess4+"="+(guess4*guess4*guess4)+".");
        //no matter which number I pick, the result 
    }
}