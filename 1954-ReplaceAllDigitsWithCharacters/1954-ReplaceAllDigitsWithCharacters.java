// Last updated: 26/12/2025, 15:59:03
class Solution {
    public String replaceDigits(String s) {
        char[] ch = s.toCharArray();
        for(int i=1;i<ch.length;i=i+2){
            ch[i]=(char)(ch[i-1]+ch[i]-'0');
        }
        return String.valueOf(ch);
    }
}