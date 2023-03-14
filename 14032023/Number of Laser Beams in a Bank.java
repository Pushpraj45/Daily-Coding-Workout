class Solution {
    public int numberOfBeams(String[] bank) {
         if(bank.length==1)return 0;
        int ans=0;
        int previous = 0;
        int current=0;
        for(int i=0; i<bank.length; i++){
            current = countOnes(bank[i]);
            ans+=current*previous;
            if(current!=0){
                previous = current;
            }
        }
        return ans;
    }

    public int countOnes(String str){
        int count=0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='1'){
                count++;
            }
        }
        return count;
    }
}