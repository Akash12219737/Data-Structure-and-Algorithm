import java.util.ArrayList;

public class Arraylist05 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(6);
        arr.add(0, 10);
        arr.add(1, 20);
        arr.add(2, 30);
        arr.add(3, 40);
        arr.add(4, 50);
        arr.add(5, 60);
            System.out.println(arr.get(0));

        System.out.println(arr);
        // for (int i=0 ;i < arr.size(); i++){
        //     System.out.print(arr.get(i));
        // }
        System.out.println(arr.size());
        arr.set(1,300); // Modify
        arr.add(55);   // Add element
        arr.remove(1);
    }
}
