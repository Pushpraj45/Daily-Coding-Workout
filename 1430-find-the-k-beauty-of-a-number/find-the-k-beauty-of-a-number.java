class Solution {
    public int divisorSubstrings(int num, int k) {
        int i =0;
        int j =0;
        int count = 0;
        int temp = num;
        String number = Integer.toString(num);
        String curr = "";

        while(j<number.length()){
            curr+=number.charAt(j);
            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                int currval = Integer.parseInt(curr);

                if(currval>0){
                    if(temp%currval==0){
                        count++;
                    }
                }

                curr = curr.substring(1);
                i++;
                j++;
            }
        }

        return count;
    }
}