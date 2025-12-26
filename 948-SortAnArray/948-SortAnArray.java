// Last updated: 26/12/2025, 16:00:18
class Solution {
    int[] array = null;
    public int[] sortArray(int[] nums) {
        //use merge sort fastest nlogn time
        //try every single sort you can 
        this.array=nums;
        quickSort(nums, 0, nums.length-1);
        return array;
        
    }
    
    public void quickSort(int[] array, int left, int right){
         if(left>=right){
            return;
        }
       
        int pivot = array[(left+right)/2];
        int index = partion(array,left,right, pivot);
        quickSort(array, left, index-1);
        quickSort(array, index,right);
        
    }
    
    public int partion(int[] array, int left, int right, int pivot){ 
        while(left<=right){
            while(array[left]<pivot){
                left++;
            }
            while(array[right]>pivot){
                right--;
            }
            
            if(left<=right){
                swap(array, left, right);
                left++;
                right--;
            }
        }
        return left;
    }
    
    public int[] swap(int[] array, int left, int right){
        int first = array[left];
        int second = array[right];
        
        array[left]=second;
        array[right]=first;
        
        return array;
    }
}

// PriorityQueue<Integer> pq= new PriorityQueue<>((a1,a2)->a1-a2);
        
//         for(int i: nums){
//             pq.add(i);
//         }
        
//         int result[] = new int[pq.size()];
//         int j=0;
//         while(pq.size()>0){
//             result[j]=pq.poll();
//                 j++;
//         }
        
//         return result;