//Aaron Tesler
//Lab 10
import java.util.Scanner;
public class Array{
    public static void main(String [] args){
        Scanner watson;
        watson = new Scanner(System.in);
        final int Numeral = 10;
        int[] elementary = new int[Numeral];
        System.out.print("Enter 10 ints:");
        int s=0;
        int f=elementary[0];
        int g=elementary[0];
        for (int z=0;z<10;z++){
            elementary[z]=watson.nextInt();
            
            
            if (elementary[z]<f){
                int f=elementary[z];
                int min=f;
                if (z==9){
                 System.out.println("The minimum number is:"+min);   
                }
            }
            
            if (elementary[z]>g){
                int g=elementary[z];
                int max = g;
                if (z==9){
                   System.out.println("The maximum number is:"+max); 
                }
            }
            s+=elementary[z];
            if(z==9){
                System.out.println("The sum is:"+s);
            }
            if (z==9){
                for(int b=0;b<10;b++){
                    System.out.print(elementary[b]+" ");
                    System.out.print(" "+elementary[9-b]);
                    System.out.println();
                }
            }
        }
        
        
    }
}