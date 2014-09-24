//Aaron Tesler
//Homework Part 04
//Time Padding
import java.util.Date;
import java.util.Scanner;

public class TimePadding{
    
    public static void main(String args[]){
        Scanner timeScanner;
        timeScanner=new Scanner (System.in);
        System.out.print("Enter the number of seconds:");
        int seconds=timeScanner.nextInt();
        int hour=seconds/3600;
        int part1=seconds%3600;
        int minute=part1/60;
        int second=part1%60;
        System.out.println("The time is"+hour+":"+minute+":"+second+".");
        
    }
}