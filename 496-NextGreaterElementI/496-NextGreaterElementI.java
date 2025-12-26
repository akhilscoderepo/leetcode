// Last updated: 26/12/2025, 16:00:49
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
       int[] result = new int[nums1.length];
        int[] holder = new int[10000];
       Stack<Integer> stack = new Stack<Integer>();
       
        
        for(int i=nums2.length-1;i>=0;i--){
           
                while(stack.size()>0 && nums2[i]>=stack.peek()){
                    stack.pop();
                }
                
                if(stack.isEmpty()){
                     holder[nums2[i]]=-1;
                }else if(!stack.isEmpty() && nums2[i]<stack.peek()){
                    holder[nums2[i]]=stack.peek();
                }
            
            stack.push(nums2[i]);
        }
        
     
        
        for(int j=0;j<nums1.length;j++){
            result[j]=holder[nums1[j]];
        }
        return result;
    }
}

//brute force-LTE
// int[] result = new int[nums1.length];
//         Stack<Integer> stack = new Stack<Integer>();
//         HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
        
//         for(int i=0;i<nums1.length;i++){
//             map.put(nums1[i],0);
//         }
        
        
//         for(int j=0;j<nums1.length;j++){
//             while(!stack.isEmpty() && nums2[stack.peek()]<nums2[j]){
//                 map.put(map.get(j),stack.peek());
//             }
//             stack.push(j);
//         }
        
//         for(int k=0;k<nums1.length;k++){
//             result[k]=map.get(nums1[k]);
//         }
        
//         return result;



//monotonic stack -O(n*k)

//  int[] result = new int[nums1.length];
//         Stack<Integer> stack = new Stack<Integer>();
//          HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
        
//         for(int j=0;j<nums2.length;j++){
//             while(!stack.isEmpty() && stack.peek()<nums2[j]){
//                map.put(stack.pop(),nums2[j]);
//             }
//             stack.push(nums2[j]);
//         }
//         System.out.println(map);
        
//         for(int i=0;i<nums1.length;i++){
//             result[i]=map.getOrDefault(nums1[i],-1);
//         }
        
//         return result;

//using stack not monotonic


