class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if (n==1){
        return nums[0];
        }
        int a=0, b=0;
        for(int num : nums){
            int temp=a;
            a=Math.max(b+num,a);
            b=temp;
        }
        return a;
    }
}