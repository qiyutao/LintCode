class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int begin = 0;
        int max = nums[0];
        int submax = nums[0];
        
        for(int i = 1;i < nums.size();i++) {
            if(nums[i]>max) {
                max = nums[i];
                if(submax + nums[i] >= max) {
                    submax += nums[i];
                    max = submax;
                } else {
                     
                    submax = nums[i];
                }
               
            } else {
                if(submax + nums[i] >= max) {
                    submax += nums[i];
                    max = submax;
                } else {
                    if(submax + nums[i] < nums[i]) {
                        submax = nums[i];
                    } else {
                        submax += nums[i];
                    }
                }
                
            }
        }
        return max;
    }
};
