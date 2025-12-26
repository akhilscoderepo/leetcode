// Last updated: 26/12/2025, 15:59:09
class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int counter = 0;
        for(int i = 0; i < items.size(); i++){
                switch (ruleKey){
                    case  "type":
                        if(items.get(i).get(0).equals(ruleValue)){
                            ++counter;
                        };
                        break;
                    case "color":
                        if(items.get(i).get(1).equals(ruleValue)){
                            ++counter;
                        };
                        break;
                    case "name":
                        if(items.get(i).get(2).equals(ruleValue)){
                            ++counter;
                        };
                        break;
                }
                
        }
        System.gc();
       return counter;
    }
}