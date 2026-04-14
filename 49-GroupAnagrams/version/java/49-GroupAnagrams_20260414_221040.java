// Last updated: 14/04/2026, 22:10:40
1class Solution {
2    public List<List<String>> groupAnagrams(String[] strs) {
3        String[] sortedArray = new String[strs.length];
4        for(int  i =0; i< strs.length; i++){
5            sortedArray[i] = sortedString(strs[i]);
6        }
7
8
9        HashMap<String, List<String>> map = new HashMap();
10        int index = 0;
11
12        for(String s : sortedArray){
13            List<String> currentList = map.getOrDefault(s, new ArrayList());
14            currentList.add(strs[index++]);
15            map.put(s, currentList);
16        }
17
18        List<List<String>> result = new ArrayList();
19
20        for(List<String> sl: map.values()){
21            result.add(sl);
22        }
23
24        return result;
25    }
26
27    private String sortedString(String input){
28        char[] array = input.toCharArray();
29        Arrays.sort(array);
30        StringBuilder sb = new StringBuilder();
31
32        for(char a : array){
33            sb.append(a);
34        }
35
36        return sb.toString();
37    }
38}