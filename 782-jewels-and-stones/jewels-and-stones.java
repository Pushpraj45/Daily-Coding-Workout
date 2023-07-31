class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        // int n=jewels.length();
        // int m=stones.length();

        // int ans=0;
        // for(int i=0; i<n; i++){
        //     for(int j=0; j<m; j++)
        //     {
        //         if(jewels.charAt(i)==stones.charAt(j))
        //         ans++;            }
        // }
        // return ans;

        int ans=0;
        HashSet e = new HashSet<>();

        for(int i:jewels.toCharArray())
        e.add(i);

        for(int j: stones.toCharArray())
        if(e.contains(j)) ans++;
        return ans;
    }
}