
class Solution {
    public int findDuplicate(int[] nums) {
        java.util.Set<Integer> seen = new java.util.HashSet<>();

        for (int num : nums) {
            if(!seen.add(num)) {
                return num;
            }

        }
        return -1;
    }
}
