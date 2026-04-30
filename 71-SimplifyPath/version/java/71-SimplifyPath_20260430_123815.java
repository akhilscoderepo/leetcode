// Last updated: 30/04/2026, 12:38:15
1class Solution {
2    public String simplifyPath(String path) {
3        String[] eachPath = path.split("/");
4        Deque<String> stack = new ArrayDeque();
5
6        for(String si : eachPath){
7            if(si.equals(" ") || si.equals(".") || si.equals("")){
8                continue;
9            }else if(si.equals("..")){
10                if(!stack.isEmpty()){
11                    stack.pop();
12                }
13            }else{
14                stack.push(si);
15            }
16        }
17
18        List<String> list = new ArrayList(stack);
19        StringBuilder result = new StringBuilder("/");
20        Collections.reverse(list);
21        System.out.println(list);
22
23        for(int i =0; i< list.size(); i++){
24            result.append(list.get(i));
25            if(i != list.size()-1){
26                result.append("/");
27            }
28        }
29    
30        return result.toString();
31    }
32}