// Last updated: 26/12/2025, 15:59:40
class Solution {
    public int[] processQueries(int[] queries, int m) {
        int length=queries.length;
        int result[] = new int[length];
        List<Integer> list = new ArrayList<Integer>(m);
        
     for(int i=1;i<=m;i++){
         list.add(i);
     }
        
    for(int i=0;i<length;i++){
        if(list.contains(queries[i])){
            result[i]=list.indexOf(queries[i]);
            list.remove(list.indexOf(queries[i]));
            list.add(0,queries[i]);
        }
    }
        return result;
}
}
