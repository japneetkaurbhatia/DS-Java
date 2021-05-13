public static int nearestEle(int[] arr, int data, int si, int ei){
    if(data > arr[ei]) return arr[ei];
    if(data < arr[si]) return arr[si];
    int si = 0, ei = arr.length - 1;
    while(si <= ei){
        int mid = (si + ei)/2;
        if(arr[mid] == data)
            return arr[mid];
        else if(data < arr[mid])
            ei = mid - 1;
        else
            si = mid + 1;
    }
    return (arr[si] - data <= data - arr[ei] ? arr[si] : arr[ei]);      
}