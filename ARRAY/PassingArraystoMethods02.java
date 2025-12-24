package ARRAY;

public class PassingArraystoMethods02 {
    public static void main(String[] args) {
        int [] arr = {10, 20, 30, 40};
       for(int b:arr){
        System.out.print(b+" ");
       }
       System.out.println();
        change(arr);
        for(int c:arr){
            System.out.print(c+" ");
        }
    }

     public static void change(int [] arr) {
         arr[0]=90;

    }
}
// when array pass in the function then it is called pass by reference
