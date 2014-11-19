//Aaron Tesler
//Howework 09
import java.util.Scanner;
public class BlockedAgain {
    public static void main(String[] s) {
        int m;
        //force user to enter int in range 1-9, inclusive.
        m = getInt();
        allBlocks(m);
    }
    public static int getInt() {
        Scanner z = new Scanner(System.in);
        System.out.print("Enter an int between 1 and 9:");
        if (checkInt(z) == true) {
            int b = z.nextInt();
            if (checkRange(b) == true) {
                return b;//the b is found

            }
            else {
                System.out.println("You did not enter an int in range [1,9]. Try again.");
                getInt();//repeats back to start

            }
        }
        else {
            System.out.println("You did not enter an int. Try again.");
            getInt();//repeats back to start

        }
        return 0;//required return for method to work correctly
    }
    public static boolean checkInt(Scanner z) {//make sure that z is int
        if (z.hasNextInt()) {
            return true;
        }
        else {
            return false;
        }
    }
    public static boolean checkRange(int m) {//make sure that z is in range
        if ((m >= 0) && (m <= 9)) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void allBlocks(int m) { //m original number
        for (int n = 1; n <= m; n++) {//technically superflous but you never know
            if (n==m){
                block(n, m);
            }
        }
    }
    public static void block(int n, int m) {
        for (int z = 1; z <= n; z++) {//z is for counting numbers up
            System.out.println();
            for (int q = 1; q <= z; q++) {//q is for making sure they repeat
                System.out.println();
                line(z, m);
                if (q == z) {//make sure that only the last row is for dash
                    System.out.println();
                    int f = (2 * m) - 1;
                    for (int s = 0; s <= f; s++) {//to make sure the line of dashes gets added
                        if (s < (m - (z - 1))) {
                            System.out.print(" ");
                        }
                        else if (s >= (m - (z - 1)) && (s <= (m + (z - 1)))) {
                            System.out.print("-");
                        }
                        else if(s > (m +(z-1))) {
                            System.out.print(" ");
                        }
                    }
                }
            }
        }
    }

    public static void line(int z, int m) {
        int f = (2 * m) - 1;
        for (int d = 0; d <= f; d++) {//position function
            if (d < (m - (z - 1))) {
                System.out.print(" ");//less than desired target and nothing there
            }
            else if (d >= (m - (z - 1)) && d <= (m + (z - 1))) {
                System.out.print(z);
            }
            else if (d >= (m + (z - 1))) {
                System.out.print(" ");
            }
        }
    }
}
