class Solution {
    public boolean isHappy(int n) {
      if(n==1) return true;

        int i=1;
        while(15>i){
        i++;
        int sum=0;
            while(n>0){
            int d=n%10;
            sum+=d*d;
            n/=10;
        }
        if(sum==1) return true;
        else n=sum;
        }
        return false;  
    }
}