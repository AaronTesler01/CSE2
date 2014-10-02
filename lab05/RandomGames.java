//Aaron Tesler
//Lab 05
//Random Chance

import java.lang.Math;
import java.util.Scanner;

public class RandomGames{
    public static void main(String args[]){
        Scanner gameScanner;
        gameScanner=new Scanner(System.in);
        //using the scanner
        String.out.print("I want to play a game. Enter R or r for roulette, C or c for craps, or P or p for pick a card.");
            if (gameScanner.hasNext().CharAt(0)){
                if (gameScanner.next().length!=0){
                    System.out.println("Please enter only 1 character.");
                    return;
                }else{
                    if (gameScanner.next().equals('C')||gameScanner.next().equals('c')){
                        
                    }else if (gameScanner.next().equals('R')||gameScanner.next().equals('r')){
                        switch Math.random();{
                            default
                        }
                    }else if (gameScanner.next().equals('P')||gameScanner.next().equals('r')){
                        
                    }else{
                        System.out.println("Please enter C,c,R,r,P or p.");
                        return;
                    }
                }
            }else{
                System.out.println("Please enter a character.");
                return;
            }
            
    }
}