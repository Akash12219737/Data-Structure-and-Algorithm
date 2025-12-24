package ARRAY;
public class PassingArraystoMethods01 {
    public static void main(String[] args) {
        int x = 5;
        System.out.println(x);
        change(x);
        System.out.println(x);
        
    }

    public static void change(int x) {
        x = 10;
    }
   
}
// when any integer,string pass in the function then it is called pass by value