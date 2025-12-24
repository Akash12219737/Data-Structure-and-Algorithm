package ARRAY;

import java.util.Arrays;

public class Copyofarray_04 {
    public static void main(String[] args) {
         int [] arr = {30, 40, 10, 23, 89, 34};
    for(int ele: arr){
        System.out.print(ele+" ");
    }
    System.out.println();
    int[] nums = arr;  // shallow copy
    nums [0] = 70;
    System.out.println(arr[0]);
   
    System.out.println("Deep copy");
    int [] brr = Arrays.copyOf(arr, arr.length);
    brr[0] = 80;
    System.out.println(arr[0]);
    for (int i = 0; i < brr.length; i++) {
        System.out.print(brr[i]+" ");
    }
    System.out.println();
    System.out.println("Alternate method of Deep copy");
    int [] crr = new int [arr.length];
    for(int i= 0; i<arr.length;i++){
        crr[i] = arr[i];
    }
    crr[0] = 100;
    System.out.println(arr[0]);
    for (int i = 0; i < arr.length; i++) {
        System.out.print(crr[i]+" ");
    }
    }
   
}
