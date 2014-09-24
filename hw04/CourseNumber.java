//Aaron Tesler
//Homework Part 03
//Course Number
import java.util.Scanner;

public class CourseNumber{//class
    public static void main(String args[]){//method
        Scanner courseScanner;
        courseScanner=new Scanner(System.in);
        
        System.out.println("Enter a 6 digit code corresponding to a Lehigh course:");
        int course=courseScanner.nextInt();
        if (course>=186510 && course<=201440){
            int year=course/100;
            int season=course%100;
            if (season==10 || season==20 || season==30 || season==40){
                if (season==10){
                    System.out.println("The course was offered in "+year+"in the spring semester.");
                }else if (season==20){
                    System.out.println("The course was offered in "+year+"in the summer 1 semester.");
                }else if (season==30){
                    System.out.println("The course was offered in "+year+"in the summer 2 semester.");
                }else if (season==40){
                    System.out.println("The course was offered in"+year+"in the fall semester.");
                }
            }else{
                System.out.println("This code does not have a valid season.");
            }
        }else{
            System.out.println("This code is not in range of [186510,201440].");
        }
    }
}