//Aaron Tesler
//Poker Slabs
import java.util.Scanner;
public class PokerHands {
    public static void main(String arg[]) {
        Scanner response;
        response = new Scanner(System.in);
        char truth='y';
        while (truth =='y' || truth =='Y') {
            System.out.println("I want to play a game. Do you?");
            String answer = response.next();
             
            if (answer.length() != 1) {
                System.out.println("Invalid response. 1 character long.");
                break;
                }
            truth = answer.charAt(0);
            if(truth!='y'&&truth!='Y'){
                 break;
             }
        
            int[] hand = new int[5];
            int[] deck = new int[52];
            int[] freq = new int[5]; //refers to frequency of 0,1,2, in rankings
            int[] suitrank = new int[4];
            for (int w = 0; w < 52; w++) {
                deck[w] = w;
            }
            int[] rankings = new int[13];
            for (int d = 0; d < 13; d++) {
                rankings[d] = 0;
            }
            for (int t = 0; t < 4; t++) {
                suitrank[t] = 0;
            }
            for (int z = 0; z < 5; z++) {
                freq[z] = 0;
            }
            int n; //intialized
            int m; //initialized

            for (int b = 0; b < 5; b++) {
                System.out.println("Enter a suit: c, d, h, or s. No capital letters.");
                String z = response.next();
                if (z.length() != 1) {
                    System.out.println("You did not enter a valid answer. The next ranks will not count.");
                    b--;
                    continue;
                }
                char user = z.charAt(0);
                if (user == 'c') {
                    n = 0;
                    suitrank[0] ++;
                }
                else if (user == ('d')) {
                    n = 1;
                    suitrank[1] ++;
                }
                else if (user == ('h')) {
                    n = 2;
                    suitrank[2] ++;
                }
                else if (user == ('s')) {
                    n = 3;
                    suitrank[3] ++;
                }
                else {
                    System.out.println("This is not a valid suit.");
                    b--;
                    n=-1;
                }


                System.out.println("Enter a rank: A,K,Q,J,10,9,8,7,6,5,4,3,2 Exact characters only.");
                String y = response.next();
                switch (y) {
                    case "A":
                        m = 0;
                        break;
                    case "K":
                        m = 1;
                        break;
                    case "Q":
                        m = 2;
                        break;
                    case "J":
                        m = 3;
                        break;
                    case "10":
                        m = 4;
                        break;
                    case "9":
                        m = 5;
                        break;
                    case "8":
                        m = 6;
                        break;
                    case "7":
                        m = 7;
                        break;
                    case "6":
                        m = 8;
                        break;
                    case "5":
                        m = 9;
                        break;
                    case "4":
                        m = 10;
                        break;
                    case "3":
                        m = 11;
                        break;
                    case "2":
                        m = 12;
                        break;
                    default:
                        System.out.println("This is not a valid rank.");
                        b--;
                        continue;
                }
                hand[b] = deck[(n * 13) + m]; //calling numbers in deck
                for (int q = b - 1; q >= 0; q--) {
                    if (hand[q] == hand[b]) {
                        System.out.println("You have a duplicate card.");
                        b--;
                        continue;
                    }
                }
            }
            for (int x = 0; x < 5; x++) { //each card will be tested
                int u = hand[x] % 13; //
                rankings[u] ++; //each rank counts up
            }
            for (int e = 0; e < 13; e++) {
                if (rankings[e] == 0) {
                    freq[0] ++;
                }
                else if (rankings[e] == 1) {
                    freq[1] ++;
                }
                else if (rankings[e] == 2) {
                    freq[2] ++;
                }
                else if (rankings[e] == 3) {
                    freq[3] ++;
                }
                else if (rankings[e] == 4) {
                    freq[4] ++;
                }
            }
            showOneHand(hand);
            if ((freq[0] == 11) && (freq[1] == 1)) {
                System.out.println("This is a Four of a Kind.");
            }
            else if (freq[0] == 11 && freq[1] == 0) {
                System.out.println("This is a Full House");
            }
            else if (freq[0] == 8 && freq[1] == 3) {
                System.out.println("This is a one pair.");
            }
            else if (freq[0] == 8 && freq[2] == 2) {
                System.out.println("This is a two pair.");
            }
            else if (straighttest(rankings) == false && suittest(suitrank) == false) {
                System.out.println("This is a high card.");
            }
            else if (straighttest(rankings) == false && suittest(suitrank) == true) {
                System.out.println("This is a flush.");
            }
            else if (royaltest(rankings) == true && suittest(suitrank) == true) {
                System.out.println("Congratulations! You have a Royal Flush!");
            }
            else if (straighttest(rankings) == true && suittest(suitrank) == true) {
                System.out.println("This is a Straight Flush.");
            }
            else if (straighttest(rankings) == true && suittest(suitrank) == false) {
                System.out.println("This is a straight.");

            }
        }
    }
    public static boolean straighttest(int[] rankings) {
        for (int x = 0; x < 9; x++) {
            System.out.println(rankings[x]);
            if (rankings[x] == 1) {
                for (int u = x; u < x + 4; u++) {
                    if (rankings[u] != 1) {
                        return false;
                    }
                }
            return true;}
        }
        return true;
    }
    public static boolean royaltest(int[] rankings) {
        for (int x = 0; x < 5; x++) {
            if (rankings[x] == 1) {

            }
            else {
                return false;
            }

        }
        return true;
    }
    public static boolean suittest(int[] suitrank) {
        for (int s = 0; s < 4; s++) {
            System.out.println(suitrank[s]);
            if (suitrank[s] >= 5) {
                return true;
            }
        }
        return false;
    }
    public static void showOneHand(int hand[]) {
        String suit[] = {
            "Clubs:    ", "Diamonds: ", "Hearts:   ", "Spades:   "
        };
        String face[] = {
            "A ", "K ", "Q ", "J ", "10 ", "9 ", "8 ", "7 ", "6 ", "5 ",
            "4 ", "3 ", "2 "
        };
        String out = "";
        for (int s = 0; s < 4; s++) {
            out += suit[s];
            for (int rank = 0; rank < 13; rank++)
                for (int card = 0; card < 5; card++)
                    if (hand[card] / 13 == s && hand[card] % 13 == rank)
                        out += face[rank];
            out += '\n';
        }
        System.out.println(out);
    }

}