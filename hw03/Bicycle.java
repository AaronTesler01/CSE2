//Aaron Tesler
//Homework 03 Part 1
//Bicycles
import java.util.Scanner;

public class Bicycle{
    //class
    public static void main(String[] args){
    //method
        //making the scanner to find variables
        Scanner theScanner;
        theScanner=new Scanner(System.in);
        //making the count portion of request
        System.out.print("Enter the number of counts: ");
            int nCount=theScanner.nextInt();
        //making the seconds portion of request
        System.out.print("Enter the number of seconds: ");
            int nSeconds=theScanner.nextInt();
        
        double diameter=27.0;//assuming the diameter
        double pI=3.14159;//assuming pi
        double feetPerMile=5280;//How many feet are in a mile
        double secondsPerMinute=60;//How many seconds are in a minute
        double secondsPerHour=3600;//How many seconds are in a hour
        double inchesPerFoot=12;//How many inches are in a foot
        int distanceTrip=nCount*(int) (diameter*pI);
        int time=(int) nSeconds/(int) secondsPerMinute;
        int mph=(int) distanceTrip/(int) (nSeconds/secondsPerHour);
        
        System.out.print("The distance was " +distanceTrip+ " miles and took " +time+ " minutes.");
        
        System.out.print("The average mph was " +mph+ ".");
        
    
        
}

}