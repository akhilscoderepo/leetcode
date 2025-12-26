// Last updated: 26/12/2025, 16:01:23
class Solution {
    
    //30-2 + 12*8 / 1
    public int calculate(String s) {

int result=0;
int num = 0;
int temp=0;
char lastOp = '+';

if(s!=null  || s.length()>0){
for(char c: s.toCharArray()){
	if(Character.isDigit(c)){
		 temp=temp*10 +(int)(c-'0'); 
	}else if(c!=' '){
		num = calc(lastOp, num, temp);
		if(c=='+' || c=='-'){
			result+=num;
			num=0;
		}
	temp=0;
	lastOp=c;
	}
}


}
return result+calc(lastOp,num,temp);
    }
    
    public int calc(char op, int num, int temp){
	if(op=='+') return num+temp;
else if(op=='-') return num-temp;
else if(op=='*') return num*temp;
else return num/temp;

}

}
//