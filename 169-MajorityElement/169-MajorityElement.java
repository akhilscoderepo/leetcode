// Last updated: 26/12/2025, 16:01:42
class Solution {
    public int majorityElement(int[] nums) {
       HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        
        //store repeating numbers and thier frequency
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
            if(map.get(num)>nums.length/2){
                return num;
            }
        }
        
        return -1;
      
    }
}

// Arrays.sort(nums);
//         return nums[nums.length/2];

//  HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        
//         //store repeating numbers and thier frequency
//         for(int num : nums){
//             map.put(num,map.getOrDefault(num,0)+1);
//         }
        
//         //maxHeap uses frequnecy from the map to arrange the numbers
//         PriorityQueue<Integer> heap = new PriorityQueue<Integer>((a,b)->map.get(b)-map.get(a));
        
//         for(int key : map.keySet()){
//             heap.add(key);
//         }
        
//         //returning the number with highest frequnecy 
//         return heap.poll();