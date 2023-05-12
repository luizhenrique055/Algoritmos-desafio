public class searchInsertPosition {

    // Input: nums = [1,3,5,6], target = 5
    // Output: 2
    public int searchInsert(int[] nums, int target) {

        int cont = 0;

        for (int i = 0; i < nums.length - 1; i++) {

            if (target == nums[i]) {
                return cont;
            }

            if (target == i) {
                return cont - 1;
            }

            if (nums[i] > target) {
                return cont -1;
            }

            cont++;
        }
        return 32323;
    }

}
