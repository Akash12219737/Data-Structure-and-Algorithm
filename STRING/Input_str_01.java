package STRING;

import java.util.Scanner;

public class Input_str_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Name:- ");
        // String str = sc.next();
        String str = sc.nextLine();
        System.out.println("Hi "+str);
    }
}
