// Last updated: 26/12/2025, 16:00:25
class MyHashSet {
    
    List<Integer> list = null;
    
    public MyHashSet() {
        list= new LinkedList<Integer>();    
    }
    
    public void add(int key) {
        if(!list.contains(key)){
            list.add(key);
        }
    }
    
    public void remove(int key) {
        if(list.contains(key)){
            list.remove(Integer.valueOf(key));
        }
    }
    
    public boolean contains(int key) {
        return list.contains(key);
    }
    
    
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */