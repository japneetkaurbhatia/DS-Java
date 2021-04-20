public static int binarySearch(int[] arr){
    int si = 0, ei = arr.length - 1;
    while(si <= ei){
        int mid = (si + ei)/2;
        if(mid % 2 == 0){
        if(arr[mid] == arr[mid+1])
            si = mid + 2;
        else 
            ei = mid;
        }
        else{
            if(arr[mid] == arr[mid+-])
            si = mid + 1;
        else 
            ei = mid;
        }
    }
    return 0;  
}