// import java.util.Scanner;
public class Updatevenposition_11 {
    public static void main(String[] args) {
        // Scanner sc =new Scanner(System.in);
        // String s = sc.nextLine();
        // System.out.println("Akash");
        String s ="AkashMaurya";
        String str = "";
        for(int i =0; i<s.length();i++){
            if(i%2==0) str = str+"a";
            else str= str +s.charAt(i);
        }
System.out.println(str);

    }

}
