class Solution {
    public boolean isThree(int n) {
        if(n==1 || n==2){
            return false;
        }
        int count=0;
        for(int i=2; i<=n/2; i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==1){
            return true;
        }
        return false;
    }
}

/*
n is not a perfect square? Return False.
n is a perfect square? Okay, what about sqrt(n)
sqrt(n) is a prime number - return True.
sqrt(n) is not a prime number - return False.
*/
