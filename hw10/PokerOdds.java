//Aaron Tesler
//Homework 10
//Poker Odds
import java.util.Random;
import java.util.Scanner;
public class PokerOdds {
    public static void main(String[] arg) {
        showHands();
        simulateOdds();
    }
    public static void showHands() {
        int[] deck = new int[52];
        int s;
        int n;
        for (int z = 0; z < 52; z++) {
            deck[z] = z;
        }
        int hand[] = {
            -1, -1, -1, -1, -1
        };
        String labels[] = {
            "Clubs:", "Diamonds:", "Hearts:", "Spades:"
        };
        String[] t = new String[5]; //where numbers are stored for display
        int[] suits = new int[5];
        for (int x = 0; x < 5; x++) { //drawing cards
            int r = (int)(Math.random() * (52 - x));
            hand[x] = deck[r]; //making the hand
            deck[r] = -1; //destroying the card picked in the deck
            int temp = deck[51 - x]; //making a temporary card to save the last one
            deck[51 - x] = deck[r]; //destroying the last card
            deck[r] = temp; //saving the card not supposed to be destroyed (last card)
        }
        for (int w = 0; w < 5; w++) {
            s = hand[w] / 13; //suit
            n = hand[w] % 13; //number
            switch (n) {
                case 0:
                    t[w] = "A";
                    break;
                case 1:
                    t[w] = "K";
                    break;
                case 2:
                    t[w] = "Q";
                    break;
                case 3:
                    t[w] = "J";
                    break;
                case 4:
                    t[w] = "10";
                    break;
                case 5:
                    t[w] = "9";
                    break;
                case 6:
                    t[w] = "8";
                    break;
                case 7:
                    t[w] = "7";
                    break;
                case 8:
                    t[w] = "6";
                    break;
                case 9:
                    t[w] = "5";
                    break;
                case 10:
                    t[w] = "4";
                    break;
                case 11:
                    t[w] = "3";
                    break;
                case 12:
                    t[w] = "2";
                    break;
            }
            suits[w] = s;

        }
        for (int k = 0; k < 4; k++) {
            System.out.println(labels[k]);
            for (int y = 0; y < 5; y++) {
                if (suits[y] == k) {
                    System.out.print(t[y]);

                }

            }
            System.out.println();
        }
        Scanner answer;
        answer = new Scanner(System.in);
        System.out.println("Go Again? Enter Y or y to go again. Anything else to quit.");
        String a = answer.next();
        if (a.equals("y") || a.equals("Y")) {
            showHands();
        }
    }
    public static void simulateOdds() {
        int a=0;
        int b=0;
        int c=0;
        int d=0;
        int e=0;
        int f=0;
        int g=0;
        int h=0;
        int i=0;
        int j=0;
        int k=0;
        int l=0;
        int m=0;
        int n=0;
        
        for (int z = 1; z <= 10000; z++) {
            int[] hand= {-1, -1, -1, -1, -1};//reinitializing hand
            int[] deck=new int[52];//reinitializing deck
            int[] cards=new int[5];
            
            for (int q=0;q<52;q++){
                deck[q]=q;
                }
            for (int x = 0; x < 5; x++) { //drawing cards
                int r = (int)(Math.random() * (52 - x));
                hand[x] = deck[r]; //making the hand
                deck[r] = -1; //destroying the card picked in the deck
                int temp = deck[51 - x]; //making a temporary card to save the last one
                deck[51 - x] = deck[r]; //destroying the last card
                deck[r] = temp; //saving the card not supposed to be destroyed (last card)
                cards[x]=(hand[x]%13);
                
            }
            if(FindDuplicates.exactlyOneDup(cards)==true){
                for(int y=0;y<5;y++){
                    for(int w=y;w<5;w++){
                    if (y!=w){    
                    if (cards[y]==cards[w]){
                        int v=cards[y];
                        switch(v){
                            case 0: a++;
                            break;
                            case 1: b++;
                            break;
                            case 2: c++;
                            break;
                            case 3: d++;
                            break;
                            case 4: e++;
                            break;
                            case 5: f++;
                            break;
                            case 6: g++;
                            break;
                            case 7: h++;
                            break;
                            case 8: i++;
                            break;
                            case 9: j++;
                            break;
                            case 10: k++;
                            break;
                            case 11: l++;
                            break;
                            case 12: m++;
                            break;
                        }
                    }
                    }   
                    }  
                }
            }else{
                n++;//no duplicates or three or more
            }
        }
    System.out.println("Rank"+" "+"freq of exactly one pair");
    System.out.println("A"+" "+a);
    System.out.println("K"+" "+b);
    System.out.println("Q"+" "+c);
    System.out.println("J"+" "+d);
    System.out.println("10"+" "+e);
    System.out.println("9"+" "+f);
    System.out.println("8"+" "+g);
    System.out.println("7"+" "+h);
    System.out.println("6"+" "+i);
    System.out.println("5"+" "+j);
    System.out.println("4"+" "+k);
    System.out.println("3"+" "+l);
    System.out.println("2"+" "+m);
    System.out.println("-------------------");
    System.out.println("Total not exactly one pair"+n);
    }
}