// 1. Pattern: Two Pointers [Squaring a Sorted Array (easy)]
class Solution {
    public int[] sortedSquares(int[] nums) {

        int[] sorted = new int[nums.length];
        int indexOfZero = (nums.length - 1);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0) {
                indexOfZero = i;
                break;
            }
        }

        int i1 = (indexOfZero - 1);
        int i2 = indexOfZero;

        for (int i = 0; i < nums.length; i++) {

            if (i1 == -1 || i2 == nums.length) {

                if (i1 >= 0) {
                    sorted[i] = nums[i1] * nums[i1];
                    i1--;
                } else {
                    sorted[i] = nums[i2] * nums[i2];
                    i2++;
                }

            } else {

                if ((nums[i1] * nums[i1]) < (nums[i2] * nums[i2])) {
                    sorted[i] = nums[i1] * nums[i1];
                    i1--;
                } else {
                    sorted[i] = nums[i2] * nums[i2];
                    i2++;
                }

            }

        }

        return sorted;

    }
}