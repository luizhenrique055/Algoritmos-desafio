public class searchInsertPosition {

    // Input: nums = [1,3,5,6], target = 5
    // Output: 2
    // Input: nums = [1,3,5,6], target = 2
    // Output: 1
    // Input: nums = [1,3,5,6], target = 7
    // Output: 4

    public static void main(String[] args) {
        int[] nums = { 1, 3, 5, 6 };

        System.out.println(searchInsert(nums, 2));
    }

    public static int searchInsert(int[] nums, int target) {

        int cont = 0;

        for (int i : nums) {
            if (target == i) {
                return cont;
            }
            // 1 > 2 && 2 <
            if (i > target && target < i + 1) {
                return cont;
            }
            cont++;
        }

        return nums.length;
    }

}
