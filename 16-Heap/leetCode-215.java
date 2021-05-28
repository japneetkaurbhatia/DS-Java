class Solution {
    public void swap(int[] nums, int si, int ei){
        int temp = nums[si];
        nums[si] = nums[ei];
        nums[ei] = temp;
    }
    public void downHeapify(int[] nums,int pi,int li){
        int maxIdx = pi;
        int lci = 2 * pi + 1;
        int rci = 2 * pi + 2;
        
        if(lci <= li && nums[lci] > nums[maxIdx]) maxIdx = lci;
        if(rci <= li && nums[rci] > nums[maxIdx]) maxIdx = rci;
        
        if(pi != maxIdx){
            swap(nums,pi,maxIdx);
            downHeapify(nums,maxIdx,li);
        }
    }
    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        for(int i = n-1; i >= 0; i--)
            downHeapify(nums,i,n-1);
        
        int li = n - 1;
        while(k-- > 1){
            swap(nums,0,li--);
            downHeapify(nums,0,li);
        }
        return nums[0];
    }
}