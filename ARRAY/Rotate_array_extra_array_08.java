public class Rotate_array_extra_array_08 {
    public static void main(String[] args) {
           int[] arr = {10, 20, 30, 40, 50, 60, 70};
        int n = arr.length;
        int[] brr = new int[n];

        int index = 0;

        // Copy from index 2 to end
        for (int i = 2; i < n; i++) {
            brr[index] = arr[i];
            index++;
        }

        // Copy from 0 to 1
        for (int i = 0; i < 2; i++) {
            brr[index++] = arr[i];
        }
        for(int i = 0;i<n;i++){
            System.out.print(brr[i]+", ");
        }
    } 
}
