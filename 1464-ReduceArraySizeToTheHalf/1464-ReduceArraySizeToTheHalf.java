// Last updated: 26/12/2025, 15:59:49
class Solution {
    public int minSetSize(int[] arr) {
        int k=arr.length/2;  
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
       
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((o1,o2)->o2-o1);
        
        for(int i: map.values()){
            pq.add(i);
        }
        
        int count=0;
        while(pq.size()!=0 && k>0){
            k-=pq.poll();
            count++;
        }
        
        return count;
    }
}

//get count of each char in a map
//iterate the map and add the values i.e; count of reptition to a pq
//now while my pq.size!=0 and k>0 keep removing elements from top and reduce k 
//maintain counter to get n
//return size of map-size of pq
