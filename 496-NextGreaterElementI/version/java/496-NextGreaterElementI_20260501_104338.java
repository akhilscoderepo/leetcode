// Last updated: 01/05/2026, 10:43:38
1class Solution {
2    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
3       int[] result = new int[nums1.length];
4        int[] holder = new int[10000];
5       Stack<Integer> stack = new Stack<Integer>();
6       
7        
8        for(int i=nums2.length-1;i>=0;i--){
9           
10                while(stack.size()>0 && nums2[i]>=stack.peek()){
11                    stack.pop();
12                }
13                
14                if(stack.isEmpty()){
15                     holder[nums2[i]]=-1;
16                }else if(!stack.isEmpty() && nums2[i]<stack.peek()){
17                    holder[nums2[i]]=stack.peek();
18                }
19            
20            stack.push(nums2[i]);
21        }
22        
23     
24        
25        for(int j=0;j<nums1.length;j++){
26            result[j]=holder[nums1[j]];
27        }
28        return result;
29    }
30}
31
32//brute force-LTE
33// int[] result = new int[nums1.length];
34//         Stack<Integer> stack = new Stack<Integer>();
35//         HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
36        
37//         for(int i=0;i<nums1.length;i++){
38//             map.put(nums1[i],0);
39//         }
40        
41        
42//         for(int j=0;j<nums1.length;j++){
43//             while(!stack.isEmpty() && nums2[stack.peek()]<nums2[j]){
44//                 map.put(map.get(j),stack.peek());
45//             }
46//             stack.push(j);
47//         }
48        
49//         for(int k=0;k<nums1.length;k++){
50//             result[k]=map.get(nums1[k]);
51//         }
52        
53//         return result;
54
55
56
57//monotonic stack -O(n*k)
58
59//  int[] result = new int[nums1.length];
60//         Stack<Integer> stack = new Stack<Integer>();
61//          HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
62        
63//         for(int j=0;j<nums2.length;j++){
64//             while(!stack.isEmpty() && stack.peek()<nums2[j]){
65//                map.put(stack.pop(),nums2[j]);
66//             }
67//             stack.push(nums2[j]);
68//         }
69//         System.out.println(map);
70        
71//         for(int i=0;i<nums1.length;i++){
72//             result[i]=map.getOrDefault(nums1[i],-1);
73//         }
74        
75//         return result;
76
77//using stack not monotonic
78
79
80