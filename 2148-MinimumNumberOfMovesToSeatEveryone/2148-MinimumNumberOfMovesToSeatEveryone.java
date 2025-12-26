// Last updated: 26/12/2025, 15:58:51
class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int totalMoves = 0;
        
        for(int i=0;i<seats.length;i++){
            if(seats[i]!=students[i]){
                totalMoves+=Math.abs(seats[i]-students[i]);
            }
        }
        
        return totalMoves;
        
    }
}