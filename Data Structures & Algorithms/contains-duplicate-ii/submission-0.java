class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        java.util.Set<Integer> window = new java.util.HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (window.contains(nums[i])) {
                return true;
            }
            window.add(nums[i]);
            if (i >= k) {
                window.remove(nums[i-k]);
            }
        }
        return false;
    }
}