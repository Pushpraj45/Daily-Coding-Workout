class Solution {
    public int maximumValue(String[] strs) {
        int ans = 0;
        ArrayList<Integer> li = new ArrayList<>();

        for(String s : strs){
            int a = 0; // counting of letters
            int b = 0; // Counting of digits
            int len = s.length();

            for(int i=0; i<len; i++){
                char ch = s.charAt(i);
                if(Character.isLetter(ch)){
                    a++;
                }
                else{
                    b++;
                }
            }
            ans = Integer.MIN_VALUE;
            if(b==len){
                int n = Integer.parseInt(s);  
                li.add(n);
            }
            else{
                li.add(len);
            }

        }
        return Collections.max(li); 

      
    }
}