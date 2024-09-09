class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> compMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (compMap.containsKey(nums[i])) {
                return new int[] { compMap.get(nums[i]), i };
            }

            compMap.put(complement, i);
        }

        return null;

    }
}