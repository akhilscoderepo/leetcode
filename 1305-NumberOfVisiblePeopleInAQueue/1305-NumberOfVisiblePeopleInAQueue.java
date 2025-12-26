// Last updated: 26/12/2025, 15:59:58
class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        int n=heights.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<Integer>();
        
        for(int i=n-1;i>=0;i--){
           while(!stack.isEmpty() && stack.peek()<heights[i]){
               ++result[i];
               stack.pop();
           }
            if(!stack.isEmpty()){
                ++result[i];
            }
          stack.push(heights[i]);
        }
        return result;
    }
}

//brute force
//starting from left iterate from i to n
//start second loop j=i to n
//look for nums[j]>=nums[i] add diff of j-1 to result
//if greatest not found then put n-i
//n=6
// 10 6 8 5 11 9
// i        j


//stack solution
//if stakc is empty res=0 push 9
//if stack.peek < element increment res at i by 1 
//pop last push new
//if stack.peek >element then result at i-1 shoul be count++
//110



