class Solution {
    public int sumOfMultiples(int n) {
        ArrayList<Integer> arr=new ArrayList<>();

        for(int i=0; i<=n; i++){
            if(i%3==0 || i%5==0 || i%7==0){
                arr.add(i);
            }
        }
        // declaration  
        int ans=0;
        for(int i=0; i<arr.size(); i++){
            ans+=arr.get(i);
        }
        return ans;
    }
}
