for(int i =0; i<n;i++){
            if(arr[i]==0) noOfZeros++;
            else noOfOnes++; 
        }
        for(int i=0;i<noOfZeros;i++){
            arr[i]=0;
        }
        for (int i = noOfZeros; i < n; i++) {
            arr[i]=1;
        }