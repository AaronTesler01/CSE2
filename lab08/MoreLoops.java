//Aaron Tesler
//lab 08 More Loops
import java.util.Scanner;
public class MoreLoops{
    public static void main(String args[]){
        
        Scanner scan=new Scanner(System.in);
        int n=0;
        
       /*System.out.print("Enter an int- ");
        while(!scan.hasNextInt()){
            scan.next();//get rid of the junk entered in my user
            System.out.print("You did not enter a int-try again.");
      }*/
    /*System.out.print("Enter an int-");  
    do{
        if (scan.hasNextInt()){
            
        }else{
            System.out.println("You did not enter a int-try again.");
        } 
    }while(!scan.hasNextInt());*/
    n=scan.nextInt();

    for(int j=0;j<n && j<40;j++){
        for(int k=0;k<j+1;k++){
        System.out.print('*');
        }
        System.out.println();
    }

        
    }
}