// Last updated: 26/12/2025, 16:00:40
class Solution {
    public int leastInterval(char[] tasks, int n) {
        if(n==0){
            return tasks.length;
        }
        
        HashMap<Character, Integer> map = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        
        for(char c: tasks){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        
        for(char input : map.keySet()){
            pq.add(map.get(input));
        }
        
        int counter=n+1;
        int time=0;
      
        while(pq.size()>0){
            List<Integer> temp = new ArrayList<Integer>();
            int workDone=0;
            
            for(int i=0;i<counter;i++){
                if(!pq.isEmpty()){
                   temp.add(pq.poll()); 
                    workDone++;
                } 
            }
            
            for(int num: temp){
                if(--num>0) pq.add(num);
            }
            
            time += !pq.isEmpty()?counter:workDone;
            
            
        }
        
     
      return time;  
    }
}

//  if(n==0){
//             return tasks.length;
//         }
        
//         HashMap<Character, Integer> map = new HashMap<>();
//         PriorityQueue<Character> pq = new Priority<>((a,b)->map.get(b)-map.get(a));
        
//         for(char c: tasks){
//             Map.put(c,Map.getOrDefault(c,0)+1);
//         }
        
//         for(char input : map.keySet()){
//             pq.add(input);
//         }
        
        
//         StringBuilder sb = new StringBuilder();
//         while(pq.size()>1){
//             char first = pq.poll();
//             char second = pq.poll();
//             ab.append(first).append(second);
//             map.put(first,map.get(first)-1);
//             map.put(second,map.get(second)-1);
            
//             if(map.get(first)>0) pq.add(first);
//             if(map.get(second)>0) pq.add(second);
            
//         }
        
//         if(!pq.isEmpty()){
//             char c=pq.poll();
//             sb.append(c);
//         }
        