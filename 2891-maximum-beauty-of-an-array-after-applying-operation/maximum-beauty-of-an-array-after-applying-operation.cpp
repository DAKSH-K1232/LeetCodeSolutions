class Solution {
public:
    int maximumBeauty(vector<int>& nums, int k) {
        int l=0;
        int r=0;

        ranges::sort(nums);

        for(r=0; r < nums.size(); ++r)
        if(nums[r]-nums[l] >2*k)
        ++l;

        return r-l;
    }
};