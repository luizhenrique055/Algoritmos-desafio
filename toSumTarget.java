class toSumTarget {


    public int[] twoSum(int[] nums, int target) {

        boolean result = false;
        int i = 0; 
        int j = 0;

        while(i < nums.length && result == false){
            j = i +1;
            while(j < nums.length){
                
                if(nums[i] + nums[j] == target){
                    result = true;
                    break;
                }
                j++;
            }
            i++;
        }
        return new int[]{i-1,j};
        
    }
}

// two sum leetcode