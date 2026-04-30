// Last updated: 30/04/2026, 17:18:08
1class Solution {
2    public int[] exclusiveTime(int n, List<String> logs) {
3        Deque<Integer> stack = new ArrayDeque();
4        int[] result = new int[n];
5        Arrays.fill(result, 0);
6        int prev = 0;
7
8        for(int i = 0; i< logs.size(); i++){
9            int index = Integer.valueOf(logs.get(i).split(":")[0]);
10            String position = logs.get(i).split(":")[1];
11            int count = Integer.valueOf(logs.get(i).split(":")[2]);
12
13           if(position.equals("start")){
14            if(!stack.isEmpty()){
15                result[stack.peek()] += count - prev;
16            }
17            stack.push(index);
18            prev = count;
19           }else{
20            result[stack.pop()] += count - prev + 1;
21            prev = count+1;
22           }
23        }
24
25        return result;
26    }
27}