//Aaron Tesler
//Homework 04 Part 2
//Month
import java.util.Scanner;
//importing scanner
public class Month{
    public static void main(String args[]){
     //making class and method
     Scanner monthScanner;
     monthScanner=new Scanner (System.in);
     Scanner yearScanner;
     yearScanner=new Scanner (System.in);
     
     System.out.print("Enter an int that represents the month (1-12): ");
     if (monthScanner.hasNextInt()){
        double month=monthScanner.nextInt();
     
        if (month==1){//January
         System.out.println("This month has 31 days.");
        }else if (month==2){//February
            System.out.print("Enter an int giving the year: ");
            double year=yearScanner.nextDouble();
            int leap=year%4;
            if (leap==0){//Leap Year
               System.out.println("This month has 28 days.");
            }else if (leap==0 && leap>0){
                double century=year%400;//Century Exception
                if (century==0){
                    System.out.println("This month has 28 days.");
                }else{//Normal Year
                    System.out.println("This month has 29 days.");
                }
                
            }else if (leap<0){
                System.out.println("Please enter a positive year.");
                return;
            }else{
                System.out.println("Please enter a year.");
            }
                
        }else if (month==3){//March
            System.out.println("This month has 31 days.");
        }else if (month==4){//April
            System.out.println("This month has 30 days.");
        }else if (month==5){//May
            System.out.println("This month has 31 days.");
        }else if (month==6){//June
            System.out.println("This month has 30 days.");
        }else if (month==7){//July
            System.out.println("This month has 31 days.");
        }else if (month==8){//August
            System.out.println("This month has 31 days.");
        }else if (month==9){//September
            System.out.println("This month has 30 days.");
        }else if (month==10){//October
            System.out.println("This month has 31 days.");
        }else if (month==11){//November
            System.out.println("This month has 30 days.");
        }else if (month==12){//December
            System.out.println("This month has 31 days.");
        }else if (month<=0){
            System.out.println("This is not between 1 and 12.");
            return;
        }else if (month>12){
            System.out.println("This is not between 1 and 12.");
            return;
        }  
        
     }else{
         System.out.println("This is not a integer.");
         return;
     }  
        
        
    }
}