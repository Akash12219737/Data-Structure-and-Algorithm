package STRING;

public class Substring_07 {
    public static void main(String[] args) {
        String s = "abcde";
        // System.out.println(s.substring(2));
        // System.out.println(s.substring(1,5));


        // Print all Substring
        int n = s.length();
        for(int i =0; i<=n;i++){
            for(int j = i+1; j<=n; j++){
                System.out.print(s.substring(i, j)+ " ");
            }
            System.out.println();
        }
    }
    
}
