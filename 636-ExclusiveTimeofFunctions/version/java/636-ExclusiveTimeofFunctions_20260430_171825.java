// Last updated: 30/04/2026, 17:18:25
1import java.util.*;
2
3class Solution {
4    public int[] exclusiveTime(int n, List<String> logs) {
5        int[] result = new int[n];
6        // Stack stores the function IDs
7        Stack<Integer> stack = new Stack<>();
8        
9        // Keeps track of the last timestamp an event (start or end) occurred
10        int prevTime = 0;
11        
12        for (String log : logs) {
13            String[] parts = log.split(":");
14            int id = Integer.parseInt(parts[0]);
15            String type = parts[1];
16            int timestamp = Integer.parseInt(parts[2]);
17            
18            if (type.equals("start")) {
19                // If there's a function already running, 
20                // add the time elapsed to its exclusive time
21                if (!stack.isEmpty()) {
22                    result[stack.peek()] += timestamp - prevTime;
23                }
24                stack.push(id);
25                prevTime = timestamp;
26            } else {
27                // Function is ending. 
28                // It ran from prevTime to timestamp (inclusive, so + 1)
29                result[stack.pop()] += timestamp - prevTime + 1;
30                // Move prevTime to the start of the next possible unit
31                prevTime = timestamp + 1;
32            }
33        }
34        
35        return result;
36    }
37}