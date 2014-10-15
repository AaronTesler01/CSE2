//Aaron Tesler
//Computer Science 002
//hw06 Roulette

import java.util.Scanner;//importing scanner

public class Roulette{
    public static void main(String args[]){
        
        Scanner Roulettescanner;
        Roulettescanner=new Scanner(System.in);
        int e=0;//count for number of times you profit
        int p=0;//profit for wheel
        int d=0;//counter for while
        int i;//introducing i for the for statement
        int x=0//count for number of times you profit
        System.out.print("Enter a number on the roulette wheel: ");//picking the number
            int spin=Roulettescanner.nextInt();
            
        while (d<1000){//simulating the simulation 1000 times
            for (i=0; i<100; i++){//simulating 100 spins
                int ball= (int) (Math.random()*39);
                if (ball==spin){
                    p=p+36;
                    e++;
                }else{
                    p--;
                }
                    
            }    
        win =p
        p=0;
        d++;
        if (e>=3){
            x++
        }else{
            
        }
        if(d==999){
            System.out.println("The total profit is "+win);
            System.out.println("You made a profit "+x+" times.");
            System.out.println("You lost everything "+(100000-x)+" times.");
        }else{
            continue;
        }    
        }
            
        
        
    }
}