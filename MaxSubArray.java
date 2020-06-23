class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int max = 0;
        int maxNeg = nums[0];
        boolean started = false;
        
        if (nums.length == 1) {
            return nums[0];
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (!started && nums[i] > 0) {
                started = true;
                sum += nums[i];
                if (sum > max) {
                    max = sum;
                }
            } else if (started && nums[i] < 0 && nums[i] * -1 <= sum) {
                sum += nums[i];
            } else if (started && nums[i] > 0) {
                sum += nums[i];
                if (sum > max) {
                    max = sum;
                }
            } else if (started && nums[i] < 0 && nums[i] * -1 > sum) {
                started = false;
                sum = 0;
            } if (nums[i] <= 0 && nums[i] > maxNeg) {
                    maxNeg = nums[i];
                }
        }
        
        if (max == 0) {
            return maxNeg;
        }
        
        return max;
    }
}