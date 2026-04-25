// Last updated: 25/04/2026, 14:53:29
class MyHashMap {

    int[] data;

    public MyHashMap() {
        data = new int[1000001];
        Arrays.fill(data, -1);
    }
    
    public void put(int key, int value) {
        if(key>-1 && key <1000001)
        data[key] = value;
    }
    
    public int get(int key) {
        if(key>-1 && key <1000001)
        return data[key];

        return data[key];
    }
    
    public void remove(int key) {
        if(key>-1 && key <1000001)
        data[key] =-1;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */