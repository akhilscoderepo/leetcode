// Last updated: 26/12/2025, 15:59:18
class Solution {
    public String interpret(String command) {
        return command.replaceAll("\\(\\)","o").replaceAll("\\(al\\)","al");
    }
}