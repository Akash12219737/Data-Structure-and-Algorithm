package STRING;
// Lexographical order
public class CompareTo_05 {
    public static void main(String[] args) {
        String s = "bcchh";
        String b = "abc";
        System.out.println(s.compareTo(b));

        String c = "You can do anything with consistent";
        System.out.println(c.contains("do"));
        System.out.println(c.contains(" do"));
        System.out.println(c.startsWith("Yo"));
        System.out.println(c.endsWith("nt"));
    }
    
}
