//Aaron Tesler
//Homework 05 Part 2
//Boola Boola
import java.util.Scanner;//importing the scanner

public class BoolaBoola{//class
    public static void main(String args[]){//method
       
       Scanner BoolaScanner;//making the scanner
       BoolaScanner=new Scanner(System.in);
        
        boolean test= ((double)(Math.random())<0.5);//making each variable
        boolean test1= ((double)(Math.random())<0.5);
        boolean test2= ((double)(Math.random())<0.5);
        int test3=(int) (Math.random()*4);//making each case as it goes for each value
        switch (test3) {
            case 0: System.out.print("Does "+test+"&&"+test1+"&&"+test3+"have a value of true (t or T) or a false value(f or F)?");//&& and &&
                String examine=BoolaScanner.next();
                if ((examine.equals("t")) && ((test && test1 && test2)==true)){
                    System.out.println("Correct!");
                }else if ((examine.equals("T")) && ((test && test1 && test2)==true)){
                    System.out.println("Correct!");
                }else if ((examine.equals("f")) && ((test && test1 && test2)==false)){
                    System.out.println("Correct!");
                }else if ((examine.equals("f")) && ((test && test1 && test2)==false)){
                    System.out.println("Correct!");    
                }else{
                    System.out.println("Wrong!");
                    return;
                }
            case 1: System.out.print("Does "+test+"&&"+test1+"||"+test2+"have a value of true (t or T) or false(f or F)?");//&& and ||
                String investigate=BoolaScanner.next();
                if ((investigate.equals("t")) && ((test && test1 || test2)==true)){
                    System.out.println("Correct!");
                }else if ((investigate.equals("T")) && ((test && test1 || test2)==true)){
                    System.out.println("Correct!");
                }else if ((investigate.equals("f")) && ((test && test1 || test2)==false)){
                    System.out.println("Correct!");
                }else if ((investigate.equals("F")) && ((test && test1 || test2)==false)){
                    System.out.println("Correct!");
                }else{
                    System.out.println("Wrong!");
                    return;
                }
            case 2: System.out.print("Does "+test+"||"+test1+"&&"+test2+"have a true(t or T) or false(f or F)?");//|| and &&
                 String a=BoolaScanner.next();
                if ((a.equals("t")) && ((test || test1 && test2)==true)){
                    System.out.println("Correct!");
                }else if ((a.equals("T")) && ((test || test1 && test2)==true)){
                    System.out.println("Correct!");
                }else if ((a.equals("f")) && ((test || test1 && test2)==false)){
                    System.out.println("Correct!");
                }else if ((a.equals("F")) && ((test || test1 && test2)==false)){
                    System.out.println("Correct!");
                }else{
                    System.out.println("Wrong!");
                    return;
                }
            case 3: System.out.print("Does "+test+"||"+test1+"||"+test2+"have a true(t or T) or false(f or F)?");//|| and ||
                 String b=BoolaScanner.next();
                if ((b.equals("T")) && ((test || test1 || test2)==true)){
                    System.out.println("Correct!");
                }else if ((b.equals("t")) && ((test || test1 || test2)==true)){
                    System.out.println("Correct!");
                }else if ((b.equals("F")) && ((test || test1 || test2)==false)){
                    System.out.println("Correct!");
                }else if ((b.equals("f")) && ((test || test1 || test2)==false)){
                    System.out.println("Correct!");
                }else{
                    System.out.println("Wrong!");
                    return;
                }
        
        }
        
        
        
        
    }
}