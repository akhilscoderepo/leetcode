// Last updated: 26/12/2025, 15:59:17
class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int ones=0;
        int zeros=0;
        
        for(int student : students){
            if(student==0){
                zeros++;
            }else{
                ones++;
            }
        }
        
        
        for(int sandwich: sandwiches){
            if(sandwich==0){
                if(zeros==0){
                    return ones;
                }
                zeros--;
            }else{
                 if(ones==0){
                    return zeros;
                }
                ones--;
            }
        }
       
        return 0;
    }
}

//Sandwiches - circle -0; square -1 
//students = lunches
//i=0 means top of stack i=n is end of stack Sandwich stack
//student stack - if student[i]==sandwich[i] then remove them from list
//else sandwich stack remains same. But student goes to last position of stack
//return no of students who are unable to eat lunch

//create a student dequeue so that i can remove and add at both end
//add all sandhwiches to queue because it easier to playing with linkedlist

//1st rough brute force

//Deque<Integer> studentQueue = new LinkedList<>();
//  Deque<Integer> sandwichQueue =new LinkedList<Integer>();
        
//         for(int i=0;i<sandwiches.length;i++){
//             sandwichQueue.addLast(sandwiches[i]);
//         }
         
//         for(int i=0;i<students.length;i++){
//             studentQueue.addLast(students[i]);
//         }
        
//         int counter=0;
        
//         while(counter<=sandwiches.length){
//             for(int i=0;i<studentQueue.size();i++){
//             if(studentQueue.getFirst()==sandwichQueue.getFirst() && studentQueue.size()>0){
//                 studentQueue.removeFirst();
//                 sandwichQueue.removeFirst();
//             }else if(studentQueue.size()>0){
//                 int student = studentQueue.getFirst();
//                 studentQueue.addLast(student);
//                 studentQueue.removeFirst();
//             }
            
            
//         }        
//             counter++;
//         }
        
          
        
        
    
//     return studentQueue.size();

//count the no of remaning 1 & 0. Order doesn't matter like I thought earlier






