// Last updated: 26/12/2025, 16:01:15
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int[] result = new int[n-k+1];
        Deque<Integer> d = new LinkedList<Integer>();
        int j=0;
        
        for(int i=0;i<n;i++){
            while(!d.isEmpty() && nums[d.peekLast()]<=nums[i]){
                d.pollLast();
            }
            
            d.offerLast(i);
            
            if(d.peek()==i-k){
                d.poll();
            }
            
            
            
            if(i>=k-1){
               result[j++]= nums[d.peek()];
            }
        }
        return result;
    }
   
}

//start i,j at zero
//move j until j-i+1 ==k
//once we are set calc sum of sub-array and add to new array
//move j++ and add sub-array[size-1] + array[j]
//also remove array[i] move i++

//my brute force-TLE only 2 TC's failed :)
// int[] result = new int[nums.length-k+1];
//         int i=0;
        
//         int max=Integer.MIN_VALUE;
//         ArrayList<Integer> list = new ArrayList<Integer>();
            
//         for(int j=0;j<nums.length;j++){
            
//             if(i+j<k){
//             max=Math.max(nums[j],max);
//                 if(j>i){
//                     list.add(nums[j]);
//                 }  
//             }else{
//                 result[i]=max;
//                 list.add(nums[j]);
//                 if(max==nums[i]){
//                     max=max(list);
//                 }else{
//                     max=Math.max(max,nums[j]);

//                 }
//                 list.remove(0);
//                  i++;

//             }
//         }
//         result[i]=max;
        
            
//      return result;  


//Brute force -2 -TLE-12 TC's failed :|

// int n=nums.length;
//         int[] result = new int[n-k+1];
//         int max=Integer.MIN_VALUE;
        
//         for(int i=0;i<n-k+1;i++){
//             int end = i+k-1;
//             max=nums[i];
//             for(int j=i+1;j<=end;j++){
//                 max=Math.max(max,nums[j]);
//             }
//             result[i]=max;
//         }
//         return result;


//SImple PriorityQueue-TLE-49/61
//  int n=nums.length;
//         int[] result = new int[n-k+1];
//         PriorityQueue<Integer> q = new PriorityQueue<Integer>((a1,a2)->(a2-a1));
        
//         for(int i=0;i<n;i++){
//            q.offer(nums[i]);
            
//             if(q.size()==k){
//                 result[i-k+1]=q.peek();
//                 q.remove(nums[i-k+1]);
//             }
//         }
//         return result;

//Better version using index in place of numbers- didn't dare to submit
// PriorityQueue<Integer> q = new PriorityQueue<Integer>((i1, i2) -> nums[i2]-nums[i1]);
        
//         for(int i=0;i<n;i++){
//             int start=i-k;
            
//             if(start>=0){
//                 q.remove(start);
//             }
//            q.offer(i);
            
//             if(q.size()==k){
//                 result[i-k+1]=nums[q.peek()];
               
//             }
//         }
//         return result;
