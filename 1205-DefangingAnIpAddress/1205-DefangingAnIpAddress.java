// Last updated: 26/12/2025, 16:00:04
class Solution {
    public String defangIPaddr(String address) {
        if(!address.contains(".")){
            return address;
        }
          return address.replaceAll("\\.","[.]"); 
           
           
    }
}