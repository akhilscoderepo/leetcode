// Last updated: 26/12/2025, 15:59:12
class Solution {
    public int maximumScore(int a, int b, int c) {
        if(a<b) return       maximumScore(b,a,c);
        if(b<c) return       maximumScore(a,c,b);
        int count = Math.max(1,b-c);
        return b==0?0:count+maximumScore(a-count,b-count,c);
    }
}
//I don't undertand how to solve it in first place
//I used brute force but it doesn't work beacuse I literally hardcoded some things

//  PriorityQueue<Integer> pq =new PriorityQueue<>((p,q)->(q-p));
//         int count=0;
        
//         pq.add(a);
//         pq.add(b);
//         pq.add(c);
        
//         while(pq.size()>1){
//             int maxFirst = pq.poll();
//             int maxSecond = pq.poll();
//             maxFirst--;
//             maxSecond--;
//             if(maxFirst>0) pq.add(maxFirst);
//             if(maxSecond>0) pq.add(maxSecond);
//             count++;
            
//         }
//       return count;  
