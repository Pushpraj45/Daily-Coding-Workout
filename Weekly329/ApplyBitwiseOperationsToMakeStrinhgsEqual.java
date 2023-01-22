class Solution {
    public boolean makeStringsEqual(String s, String t) {
        int n=s.length();
        
        int a=0, b=0;
        for(int i=0; i<n; i++){
            if(s.charAt(i)=='1'){
                a++;
            }
            if(t.charAt(i)=='1'){
                b++;
            }
            
        }
      if(a>0 && b==0){
          return false;
      }
        if(a==0 && b>0){
            return false;
        }
        return true;
    }
}