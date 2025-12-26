// Last updated: 26/12/2025, 15:59:02
class SeatManager {
    
    PriorityQueue<Integer> pq=null;
    int count=0;
    
    public SeatManager(int n) {
        pq=new PriorityQueue<>();
        count=1;
    }
    
    public int reserve() {
        if(pq.isEmpty()){
           return count++; 
        }
        
        return pq.poll();
    }
    
    public void unreserve(int seatNumber) {
        pq.add(seatNumber);
    }
}

/**
 * Your SeatManager object will be instantiated and called as such:
 * SeatManager obj = new SeatManager(n);
 * int param_1 = obj.reserve();
 * obj.unreserve(seatNumber);
 */