public class next_gretest_element_12 {
    public static void main(String[] args) {
    int [] arr = {12, 8, 60, 37, 2, 49, 16, 28, 21};
    int n = arr.length;
    int [] ans = new int [n];
    for (int ele: arr) {
        System.out.print(ele+" ");
    }
    // Method 1 Brute force
    // arr[n-1] = -1;    
    // for (int i = 0; i < n-1; i++) {
    //     int mx = Integer.MIN_VALUE;
    //     for (int j = i+1; j <n; j++) {
    //     mx = Math.max(mx,arr[j]);
    // }
    // ans[i]=mx;
    // }

    // Method 2
    int next_gre_ele = arr[n-1];
    for(int i= n-1; i>=0;i--){
        ans[i] = next_gre_ele;
        next_gre_ele = Math.max(next_gre_ele, arr[i]); 
    }

    
    System.out.println();
    for (int brr : ans) {
        System.out.print(brr+" ");
    }
    }
}
