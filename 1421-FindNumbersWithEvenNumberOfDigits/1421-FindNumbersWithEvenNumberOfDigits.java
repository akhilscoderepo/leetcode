// Last updated: 26/12/2025, 15:59:52
class Solution {
    public int findNumbers(int[] nums) {
        return (int)Arrays.stream(nums).map(e->(int)(Math.log10(e)+1))
                            .filter(e->e%2==0)
                            .count();
    }
    
    
}