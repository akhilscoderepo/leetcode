// Last updated: 26/12/2025, 15:59:47
class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        if (mat == null || k < 0 || mat.length < k) {
            throw new IllegalArgumentException("Input is invalid");
        }

        // Max Heap
        PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) -> (a[1] != b[1] ? b[1] - a[1] : b[0] - a[0]));

        for (int i = 0; i < mat.length; i++) {
            queue.offer(new int[] { i, getSoldierCount(mat[i]) });
            if (queue.size() > k) {
                queue.poll();
            }
        }

        int[] result = new int[k];
        while (!queue.isEmpty()) {
            result[--k] = queue.poll()[0];
        }
        return result;
    }

    private int getSoldierCount(int[] row) {
        if (row[0] == 0) {
            return 0;
        }
        if (row[row.length - 1] == 1) {
            return row.length;
        }
        int start = 0;
        int end = row.length; // Number of solder can be maximum row.length. Thus end needs to be row.length

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (row[mid] == 1) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return end;
    }
}

//  HashMap<Integer, Integer> map = new HashMap<>();
        
//         for(int i=0;i<mat.length;i++){
//             int solCount=0;
//             for(int j=0;j<mat[i].length;j++){
//                 if(mat[i][j]==1){
//                     ++solCount;
//                 }
//                 map.put(i,solCount);
//             }
//         }
        
//         List<Map.Entry<Integer,Integer>> list = new LinkedList<>(map.entrySet());
        
//         Collections.sort(list,new Comparator<Map.Entry<Integer,Integer>>(){
//             public int compare(Map.Entry<Integer,Integer> x, Map.Entry<Integer,Integer> y){
//                 if(x.getValue()==y.getValue()){
//                     return x.getKey()-y.getKey();
//                 }else{
//                    return x.getValue()-y.getValue();
//                 }
//             }
//         });
        
//         int p=0;
//         int[] res=new int[k];
        
//         for(Map.Entry<Integer,Integer> mp :list){
//             if(p==k){
//                 break;
//             }else{
//                 res[p++]=mp.getKey();
//             }
//         }
//         return res;