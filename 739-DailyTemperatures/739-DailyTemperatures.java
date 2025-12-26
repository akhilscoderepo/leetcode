// Last updated: 26/12/2025, 16:00:35
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<Integer>();
        int[] result = new int[temperatures.length];
        
        for(int i=0;i<temperatures.length;i++){
            while(!stack.isEmpty() && temperatures[stack.peek()]<temperatures[i]){
              
                result[stack.peek()]=i-stack.pop();
                
            }
            stack.push(i);
        }
     return result;   
  
    }
}

 
//brute force
//fix i and move with j
//if i<j add to new array
//else move fowd LTE

//   int size = temperatures.length;
//         int[] result = new int[size];
        
//         //need to fix inner loop??
//         for(int i=0;i<size;i++){
//            int check =  temperatures[i];
//             int counter=0;
//             boolean found=false;
//             for(int j=i;j<size;j++){
                
//                 if(check<temperatures[j]){
//                     counter++;
//                     found=true;
//                     break;
//                 }else if(check>=temperatures[j]){
//                     counter++;
//                 }
//             }
//             if(found){
//             result[i] =counter-1;     
//             }else{
//                 result[i]=0;
//             }
           
//         }
      
//         return result;

//usig stack