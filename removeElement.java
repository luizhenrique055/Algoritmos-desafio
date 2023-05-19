public class removeElement {

    public static void main(String[] args) {
        int[] nums = { 3, 2, 2, 3 };
        System.out.println(removedor(nums, 3));
    }

    public static int removedor(int[] nums, int val) {
        int[] arrayAux = new int[nums.length];
        int j = 0;

        for (int i = 0; i < nums.length; i++) {

            if (val != nums[i]) {
                arrayAux[j] = nums[i];
                j++;
            }

        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = arrayAux[i];
        }

        return j;
    }
}
