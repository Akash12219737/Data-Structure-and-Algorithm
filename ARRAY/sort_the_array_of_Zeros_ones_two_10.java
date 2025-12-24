public class sort_the_array_of_Zeros_ones_two_10 {
    public static void main(String [] args){
    int [] arr = {0, 1, 2, 0, 2, 2, 0, 1 };
    int n = arr.length;
    // int noOfZeros =0, noOfOnes = 0;
    // Method 1 Two pass Solution
    // for(int i=0; i<n; i++){
    //     if(arr[i] == 0) noOfZeros++;
    //    if(arr[i] == 1) noOfOnes++;
    // }
    // for(int i =0; i<n; i++){
    //     if(i<noOfZeros) arr[i]=0;
    //    else if(i<noOfZeros+noOfOnes) arr[i] =1;
    //     else arr[i]=2;
    // }

    // Method 2   dutch flag problem
    int lo =0, mid =0, hi = n-1;
    while(mid<=hi){
        if(arr[mid]==0){
            int temp = arr[lo];
            arr[lo] =arr[mid];
            arr[mid] = temp;
            lo++; mid++;
        }
        else if(arr[mid]==1){
            mid++;

        }else{ // arr[mid]==2
            int temp = arr[mid];
            arr[mid]=arr[hi];
            arr[hi]= temp;
            hi--;
        }
    }
    for (int i : arr) {
        System.out.print(i+", ");
    }
    }
}