class Solution {
    public List<String> cellsInRange(String s) {
        // columns and rows ko extract karke unhe do for loops se unke andar ke cells print kara dene hai 

        char c1 = s.charAt(0);
        char c2 = s.charAt(3);
        char r1 = s.charAt(1);
        char r2 = s.charAt(4);

        List<String> ans = new ArrayList<>();
        for(char c=c1; c<=c2; c++){
            for(char r=r1; r<=r2; r++)
            {
                ans.add(new String(new char[]{c,r}));
            }
        }
        return ans;
    }
}