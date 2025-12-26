// Last updated: 26/12/2025, 16:01:03
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(k==nums.length){
            return nums;
        }
       HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        
        for(int i: nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        
      List<Integer>[] buckets = new List[nums.length+1];
        
        for(int j: map.keySet()){
            int value = map.get(j);
            if(buckets[value]==null){
                buckets[value]=new LinkedList<>();
            }
            buckets[value].add(j);
        }
        
        int[] finalResult = new int[k];
        int inc=0;
        for(int p=buckets.length-1;p>0 && k>0;p--){
            if(buckets[p]!=null){
                for(int b: buckets[p]){
                    finalResult[inc++]=b;
                }
                k-=buckets[p].size();
            }
        }      
        
        return finalResult;
    }
}

//  HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        
//         for(int i: nums){
//             map.put(i,map.getOrDefault(i,0)+1);
//         }
        
//         PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>((o1,o2)->(o1.getValue()-o2.getValue()));
        
        
//         for(Map.Entry e: map.entrySet()){
//             pq.add(e);
//             if(pq.size()>k){
//                 pq.poll();
//             }
//         }
        
//         int[] result = new int[k];
//         int p=0;
//         while(pq.size()>0){
//             Map.Entry entry = pq.poll();
//             result[p]=(int)entry.getKey();
//             p++;
//         }
        
//         return result;

//--------------

// HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        
//         for(int i: nums){
//             map.put(i,map.getOrDefault(i,0)+1);
//         }
        
//       List<Integer>[] buckets = new List[nums.length+1];
        
//         for(int j: map.keySet()){
//             int value = map.get(j);
//             if(buckets[value]==null){
//                 buckets[value]=new LinkedList<>();
//             }
//             buckets[value].add(j);
//         }
        
//         List<Integer> result = new LinkedList<>();
        
//         for(int p=buckets.length-1;p>0 && k>0;p--){
//             if(buckets[p]!=null){
//                 List<Integer> temp = buckets[p];
//                 result.addAll(temp);
//                 k-=temp.size();
//             }
//         }
        
//         int[] finalResult = new int[result.size()];
        
//         for(int a=0;a<result.size();a++){
//             finalResult[a]=result.get(a);
//         }
        
        
//         return finalResult;