#include <stdio.h>

int addDigits(int num) {
    
    int temp = num;
    int sum = 0;
    int rem = 0;
   
    
    
    while(true){
    	
         while(temp != 0){
           rem=temp%10;
           sum=sum+rem;
           temp/=10;
       
        }
       
         if(sum<10) {
         	return sum;
            
            
        }
        else{
        	temp=sum;
            sum=0;
            rem=0;
           
        }
}
  

}


int main(){
	int num=38;
	//output : 3
	printf("%d ",addDigits(num));
}
