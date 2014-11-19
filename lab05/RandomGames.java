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
        System.out.print("I want to play a game. Enter R or r for roulette, C or c for craps, or P or p for pick a card.");
            if (gameScanner.hasNext().charAt(0)){
                if (gameScanner.next().length!=0){
                    System.out.println("Please enter only 1 character.");
                    return;
                }else{
                    if (gameScanner.next().equals('C')||gameScanner.next().equals('c')){
                        int die1=((int)(Math.random()*6)+1);
                        int die2=((int)(Math.random()*6)+1);
                        System.out.println("The die roll is:"+(die1+die2));
                    }else if (gameScanner.next().equals('R')||gameScanner.next().equals('r')){
                        int ball=(int) (Math.random()*39);
                        switch (ball){
                            case 38:
                                System.out.println("The number chosen is: 00");
                                break;
                            default:
                                System.out.println("The number chosen is: "+ball);
                                break;
                        }
                    }else if (gameScanner.next().equals('P')||gameScanner.next().equals('r')){
                        int suit=Math.random()*4;
                        int number=((Math.random()*13)+1);
                            switch (number){
                                case 11:
                                    String number="King";
                                    break;
                                
                                case 12:
                                    String number="Queen";
                                    break;
                                
                                case 13:
                                    String number="Jack";
                                    break;
                                
                                case 1:
                                    String number="Ace";
                                    break;
                                default:
                                    break;
                                
                            }
                            switch (suit){
                                case 0:
                                    System.out.println("Your card is the"+number+"of clubs.");
                                    break;
                                
                                case 1:
                                    System.out.println("Your card is the"+number+" of diamonds");
                                    break;
                                
                                case 2:
                                    System.out.println("Your card is the "+number+" of spades.");
                                    break;
                                
                                case 3:
                                    System.out.println("Your card is the "+number+"of hearts.");
                                    break;
                                
                            } 
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