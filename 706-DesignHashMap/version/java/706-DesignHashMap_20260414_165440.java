// Last updated: 14/04/2026, 16:54:40
1class MyHashMap {
2
3    int[] data;
4
5    public MyHashMap() {
6        data = new int[1000001];
7        Arrays.fill(data, -1);
8    }
9    
10    public void put(int key, int value) {
11        if(key>-1 && key <1000001)
12        data[key] = value;
13    }
14    
15    public int get(int key) {
16        if(key>-1 && key <1000001)
17        return data[key];
18
19        return data[key];
20    }
21    
22    public void remove(int key) {
23        if(key>-1 && key <1000001)
24        data[key] =-1;
25    }
26}
27
28/**
29 * Your MyHashMap object will be instantiated and called as such:
30 * MyHashMap obj = new MyHashMap();
31 * obj.put(key,value);
32 * int param_2 = obj.get(key);
33 * obj.remove(key);
34 */