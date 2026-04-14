// Last updated: 14/04/2026, 22:14:47
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hs=new HashMap<>();

        for(String s:strs) {
            char[] ss=s.toCharArray();
            Arrays.sort(ss);
            String ns=new String(ss);
            if(hs.size()>0 && hs.containsKey(ns)) {
                hs.get(ns).add(s);
            }
            else {
                List<String> sss=new ArrayList<>();
                sss.add(s);
                hs.put(ns,sss);
            }
        }

        List<List<String>> ans=new ArrayList<>();

        for(String key:hs.keySet()) {
            ans.add(hs.get(key));
        }

        return ans;
    }
}