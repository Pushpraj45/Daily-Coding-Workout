class Solution {
    public int minimumTimeToInitialState(String word, int k) {
        int ans = 1;
        for(int i=k; i<word.length(); i+=k){
            if(checkPrefix(word,i)){
                return ans;
            }
            ans++;
        }
        return ans;
        
    }
    public boolean checkPrefix(String word, int temp){
        for(int i=temp; i<word.length(); i++){
            if(word.charAt(i-temp)!=word.charAt(i)){
                return false;
            }
        }
        return true;
    }
}