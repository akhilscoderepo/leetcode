// Last updated: 26/12/2025, 16:01:56
class Solution {
    public List<Integer> getRow(int rowIndex) {
    
        
         ArrayList<Integer> result = new ArrayList<>();
        result.add(1);
        while(rowIndex!=0){
            result = pascals(result);
            rowIndex--;
        }
        
        return result;
    }
    
    private ArrayList<Integer> pascals(ArrayList<Integer> list){
        ArrayList<Integer> result = new ArrayList<>();
        result.add(1);
        
        for(int i = 1; i < list.size(); i++){
            result.add(list.get(i-1)+list.get(i));
        }
        result.add(1);
        
        return result;
    }
}