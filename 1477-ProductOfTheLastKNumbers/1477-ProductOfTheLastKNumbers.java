// Last updated: 26/12/2025, 15:59:45
class ProductOfNumbers {
    
    List<Integer> list=null;

    public ProductOfNumbers() {
        list = new ArrayList<Integer>();
        list.add(1);
    }
    
    public void add(int num) {
        if(num>0){
          list.add(list.get(list.size()-1)*num);  
        }else{
            list = new ArrayList<Integer>();
            list.add(1);
        }
    }
    
    public int getProduct(int k) {
        int size = list.size();
        return k<size?list.get(size-1)/list.get(size-k-1):0;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */