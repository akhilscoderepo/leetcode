// Last updated: 26/12/2025, 16:01:51
class Solution {
    public int singleNumber(int[] nums) {
        int result=0;
        Set<Integer> set = new HashSet<Integer>();
        HashMap<Integer,Integer> map= new HashMap<Integer,Integer>();
        
        for(int n: nums){
            if(set.add(n)){
                map.put(n,1);
            }else{
                map.put(n,map.get(n)+1);
            }
        }
       
        for(Map.Entry<Integer, Integer> s: map.entrySet()){
            if(s.getValue()==1){
                return s.getKey();
            }
        }
        return 0;
    }
}
