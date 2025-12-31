package STRING;

public class Interning_10 {
    public static void main(String[] args) {
        String s = "Raja";
        // Raja ->Vaja
        // s.charAt(0) = 'V' Error
        String q = "Raja"; // this not create a new space in memory only in Raja already in memory another q pointed out to this Raja but in the same s is also pointed out to Raja 
        String t = new String("Raja"); //This create a new spcae in memory

        System.out.println(s);
        System.out.println(t);
    }
    
}
