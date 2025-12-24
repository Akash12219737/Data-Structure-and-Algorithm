package ARRAY;
import java.util.Scanner;

public class Outputarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] x = new int[7]; // create array of size 7

        // Input
        System.out.println("Enter 7 numbers:");
        for (int i = 0; i < x.length; i++) {
            x[i] = sc.nextInt();
        }

        // Output
        System.out.println("Array elements are:");
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i] + " ");
        }

        sc.close();
    }
}
