// Last updated: 26/12/2025, 15:59:55
class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        Map<Integer, List<Integer>> map = new HashMap<Integer,List<Integer>>();
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        
        for(int i=0;i< groupSizes.length;i++){
            List<Integer> valueHolder = new ArrayList<Integer>();
            if(map.getOrDefault(groupSizes[i],null)==null){
                valueHolder.add(i);
                map.put(groupSizes[i],valueHolder);
            }else{
                 List<Integer> valueHolder2 = new ArrayList<Integer>(map.get(groupSizes[i]));
                valueHolder2.add(i);
                map.replace(groupSizes[i],valueHolder2);
            } 
        }
        
        
        for(Integer s: map.keySet()){
            int size = map.get(s).size();
            int start=0;
            int range = s;
            while(start<size){
            result.add(map.get(s).subList(start,range));       
            start+=s;
            range+=s;
            }
   
        }
        
        
        return result;
        
    }
}