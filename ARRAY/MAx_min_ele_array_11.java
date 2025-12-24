public class MAX_min_ele_array_11 {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 5, 6, 8, 7,};
        findminmax(arr);

    }
    static void findminmax(int[] arr){
        int min =arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
        //     if(min>arr[i]) min=arr[i];
        //     if(max<arr[i]) max=arr[i];
        

        // Method 2
        
        min = Math.min(min, arr[i]);
        max = Math.max(max,arr[i]);
        };
        System.out.println("min :"+ min);
        System.out.println("max :"+ max);
    }
}
