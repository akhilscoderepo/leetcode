// Last updated: 23/04/2026, 17:59:00
class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long count = 0, streak = 0;

        for(int n : nums){
            streak = (n ==0) ? (streak +1) : 0;
            count += streak;
        }

        return count;
    }

}