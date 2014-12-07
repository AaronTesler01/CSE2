//Aaron Tesler
//Lab 10
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner watson;
        watson = new Scanner(System.in);
        final int Numeral = 10;
        int[] elementary = new int[Numeral];
        System.out.print("Enter 10 ints:");
        int s = 0;
        int f = 0;
        int g = 0;
        int max = 0;
        int min = 0;
        for (int z = 0; z < 10; z++) {
            elementary[z] = watson.nextInt();
            s += elementary[z];
        }
        for (int k = 0; k < 10; k++) {
            if (elementary[k] < elementary[f]) {
                f = k;
                min = elementary[f];

            }
            if (elementary[k] > elementary[g]) {
                g = k;
                max = elementary[g];

            }
        }


        System.out.println("The sum is:" + s);
        System.out.println("The maximum number is:" + max);
        System.out.println("The minimum number is:" + min);
        for (int b = 0; b < 10; b++) {
            System.out.print(elementary[b] + " ");
            System.out.print(" " + elementary[9 - b]);
            System.out.println();
        }



    }
}