class Solution {
    public int splitNum(int num) {
        String s = Integer.toString(num);
        char[] sorted = s.toCharArray();
        Arrays.sort(sorted);

        String st = new String(sorted);

        StringBuilder n1 = new StringBuilder();
        StringBuilder n2 = new StringBuilder();

        for(int i=0; i<st.length(); i++){
            if(i%2==0){
                n1.append(st.charAt(i));
            }
            else{
                n2.append(st.charAt(i));
            }
        }

        int ans = Integer.parseInt(n1.toString()) + Integer.parseInt(n2.toString());

        return ans;
    }
}