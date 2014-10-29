//Aaron Tesler
//Homework 08
//Driver

import java.util.Scanner;
public class HW8{
  public static void main(String []arg){
    char input;
    Scanner scan=new Scanner(System.in);
    System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");
    input=getInput(scan,"Cc");//input 1
    if (input==' '){
        return;
    }
    System.out.println("You entered '"+input+"'");
    System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");
    input=getInput(scan,"yYnN",5); //give up after 5 attempts, INPUT 2
    if (input==' '){
        return;
    }
    if(input!=' '){
       System.out.println("You entered '"+input+"'");
    }
    input=getInput(scan,"Choose a digit.","0123456789");
    if (input==' '){
        return;
    }
    System.out.println("You entered '"+input+"'");
  }
  public static char getInput(Scanner scan,String cont){//Method 1
     String x=scan.next();
     int l=x.length();
      if (l!=1){
          System.out.println("You did not enter 1 character. try again:");
          return ' ';
      } else if (((x.charAt(0)!=cont.charAt(0))&&(x.charAt(0)!=cont.charAt(1)))){
          System.out.println("You did not enter a character from the list. Try again:");
          return ' ';
      } else{
          return x.charAt(0);
        }
  }
    public static char getInput(Scanner scan, String comm,int f){//input 2
        String g=scan.next();
        int h=g.length();
        int k=0;
        while (k<=f){
            if (h==1){
                
                char e=g.charAt(0);
                if ((e==comm.charAt(0))||(e==comm.charAt(1))||(e==comm.charAt(2))||(e==comm.charAt(3))){
                    return e;
                }else{
                    System.out.print("You did not enter in the correct character. Try Again.");
                    e=scan.next().charAt(0);
                    k++;
                if (k==f){
                    System.out.println("You failed "+f+" times.");
                    return' ';
                }    
                }
            }else{
                System.out.println("You did not enter the right amount of character. Try again.");
                k++;
                return ' ';
                }//end of else statement
        }//end of while statement
    //end of method 2
    return' ';}
  public static char getInput(Scanner scan,String fall,String rise){
    System.out.println(fall);
    System.out.print("Enter one of '0','1','2','3','4','5','6','7','8','9-'");
    String z=scan.next();
    char m=z.charAt(0);
    if (z.length()!=1){
        System.out.println("You entered more than 1 character.");
        return ' ';
    }else{
        if ((m==((rise.charAt(0))))||(m==(rise.charAt(1)))||(m==(rise.charAt(2)))||(m==(rise.charAt(3)))||(m==(rise.charAt(4)))||(m==(rise.charAt(5)))||(m==(rise.charAt(6)))||(m==(rise.charAt(7)))||(m==(rise.charAt(8)))||(m==(rise.charAt(9)))){
                System.out.println(z.charAt(0));
                return m;
                
            }
            
            
    
    }   
        
        
    
    System.out.println("You did not enter an acceptable character.");
    return ' ';  
    
  } 
  
}

