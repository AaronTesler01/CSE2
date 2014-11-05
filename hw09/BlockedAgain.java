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
                return b;

            }
            else {
                System.out.println("You did not enter an int in range [1,9]. Try again.");
                getInt();

            }
        }
        else {
            System.out.println("You did not enter an int. Try again.");
            getInt();

        }
        return 0;
    }
    public static boolean checkInt(Scanner z) {
        if (z.hasNextInt()) {
            return true;
        }
        else {
            return false;
        }
    }
    public static boolean checkRange(int m) {
        if ((m >= 0) && (m <= 9)) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void allBlocks(int m) { //m original number
        for (int n = 1; n <= m; n++) {
            if (n==m){
                block(n, m);
            }
        }
    }
    public static void block(int n, int m) {
        for (int z = 1; z <= n; z++) {
            System.out.println();
            for (int q = 1; q <= z; q++) {
                System.out.println();
                line(z, m);
                if (q == z) {
                    System.out.println();
                    int f = (2 * m) - 1;
                    for (int s = 0; s <= f; s++) {
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
        for (int d = 0; d <= f; d++) {
            if (d < (m - (z - 1))) {
                System.out.print(" ");
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
