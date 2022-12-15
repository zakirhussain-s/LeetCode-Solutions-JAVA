// Solution 1
class Solution {
    public int findNumbers(int[] nums) {
        int rem = 0, res = 0;
        for(int i=0;i<nums.length;i++){
            while(nums[i] != 0){
                nums[i] /= 10;
                rem++;
            }
            if(rem%2 == 0) res++;
            rem = 0;
        }
        return res;
    }
}

// Solution 2
class Solution {
    public int findNumbers(int[] nums) {
        int rem = 0, res = 0;
        for(int i=0;i<nums.length;i++){
            rem = (int) Math.log10(nums[i])+1;
            if(rem%2==0) res++;
        }
        return res;
    }
}