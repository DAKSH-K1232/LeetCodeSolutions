class Solution {
    public int[] mergeSort(int[] nums,int l,int r) {
         int mid=(l+r)/2;
         if(l==r)
         return nums;

         mergeSort(nums,l,mid);
         mergeSort(nums,mid+1,r);
         mergeArray(nums,l,mid,r);
         return nums;
    }
    public void mergeArray(int[] nums,int l,int mid,int r){
        int[] left=new int[mid-l+1];
        int[] right=new int[r-mid];

        for(int i=0;i<mid-l+1;i++)
        left[i]=nums[l+i];

        for(int j=0;j<r-mid;j++)
        right[j]=nums[mid+1+j];


        int i=0;
        int j=0;
        int k=l;
        while(i<left.length && j<right.length){
            if(left[i]<=right[j]) 
            nums[k++]=left[i++];
            else
            nums[k++]=right[j++];
        }
        while(i<left.length)
        nums[k++]=left[i++];

        while(j<right.length)
        nums[k++]=right[j++];
    }
    public int[] sortArray(int[] nums){
        int l=0,r=nums.length-1;
        mergeSort(nums,l,r);
        return nums;
    }
}






