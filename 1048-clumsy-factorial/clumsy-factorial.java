class Solution{
int m = 1;

public int clumsy(int n) {
    int num=0;
    if (n >= 4)
        num = m*n*(n-1)/(n-2)+(n-3);
    else if (n==3)
        num = m*n*(n-1)/(n-2);
    else if (n==2)
        num = m*n*(n-1); 
    else if (n==1)
        num = m*n;
    else 
        return 0;
    
    m = -1;

    return (num + clumsy(n-4));  
}}