class Solution {
    public boolean isPalindrome(int x) {
        int sum=0;
        int rem;
        int temp=x;
        if(x<0) return false;
    
        while(temp>0){
            rem=temp%10;
            sum=(sum*10)+rem;
            temp=temp/10;
            
            
        }
           return sum==x;
            
        
        
}
}
