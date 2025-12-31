package STRING;
import java.util.Scanner;
public class CoonvertInttoString_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        // String s = ""+n; //
        // Alternate 
        String s = Integer.toString(n);
        // String s = long.toString(n);
        System.out.println(s);

        // Number of digit in the String 
        System.out.println(s.length());
    }
    
}
