// Last updated: 26/12/2025, 16:00:48
class Solution {
    public int[] nextGreaterElements(int[] nums) {
     int[] result = new int[nums.length];
        Stack<Integer> stack = new Stack<>();
        int n = nums.length;
        Arrays.fill(result,-1);
        for(int i=0;i<2*n;i++){
            while(!stack.isEmpty() && nums[stack.peek()]<nums[i%n]){
                result[stack.pop()] = nums[i%n]; 
            }
            stack.push(i%n);
        }
        
        
        
        
        return result;
    }
}

//find greatest on left side 
//if not found go to right side
//still not found add -1
//array-1 2 1
//stack - 2 -1 -1
//res-1

//stack - 1
//result - 
//array - 1 2//tle



//         //finding next greatest element on right
//         for(int i=0;i<nums.length;i++){
//             while(!stack.isEmpty() && nums[stack.peek()]<nums[i]){
//                 result[stack.pop()]=nums[i];
                
//             }
//             stack.push(i);
//         }
        
//         //finding nge in cirualr way
//          for(int i=0;i<nums.length;i++){
//             while(!stack.isEmpty() && nums[stack.peek()]<nums[i]){
//                 result[stack.pop()]=nums[i];
//             }
//         }