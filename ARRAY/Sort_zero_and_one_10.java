import java.lang.reflect.Method;

public class Sort_zero_and_one_10{
    public static void main(String[] args ){
        int[] arr = {1,0,0,1,1,0,0,0,1,0};
        int n = arr.length;
        for (int i = 0; i <n; i++) {
            System.out.print(arr[i]+" ");
        }
         System.out.println();
        int noOfZeros = 0;
        int noOfOnes =0;
        // Methos 1
        // for(int i =0; i<n;i++){
        //     if(arr[i]==0) noOfZeros++;
        //     else noOfOnes++; 
        // }
        // for(int i=0;i<noOfZeros;i++){
        //     arr[i]=0;
        // }
        // for (int i = noOfZeros; i < n; i++) {
        //     arr[i]=1;
        // }

        
        // Method 2
        // for(int i=0; i<n;i++){
        //     if(arr[i]==0)noOfZeros++;
        //     if(arr[i]==1) noOfOnes++;
        // }
        // for(int i=0;i<n;i++){
        //     if(i<noOfZeros){ 
        //         arr[i]=0;}
        //     else if(i<noOfOnes+noOfZeros)
        //     arr[i]=1;
            
        // }
        // Method 3
        int i= 0, j= n-1;
        while (i<j) {
            if(arr[i] ==0) i++;
            if(arr[j] ==1) j--;
            if(arr[i]==1 && arr[j]==0){
                arr[i] =0;
            arr[j] =1;
        i++;
        j--;
        }
        }
        for (int b : arr) {
            System.out.print(b+" ");
        }
    }
}
