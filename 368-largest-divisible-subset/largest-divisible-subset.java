class Solution {
    public List<Integer> largestDivisibleSubset(int[] arr) {
        // int n = nums.length;
        // int[] dp = new int[n];
        // Arrays.fill(dp, 1);
        // Arrays.sort(nums);
        
        // int maxSize = 1, maxIndex = 0;
        // for (int i = 1; i < n; i++) {
        //     for (int j = 0; j < i; j++) {
        //         if (nums[i] % nums[j] == 0) {
        //             dp[i] = Math.max(dp[i], dp[j] + 1);
        //             if (dp[i] > maxSize) {
        //                 maxSize = dp[i];
        //                 maxIndex = i;
        //             }
        //         }
        //     }
        // }
        
        // List<Integer> result = new ArrayList<>();
        // int num = nums[maxIndex];
        // for (int i = maxIndex; i >= 0; i--) {
        //     if (num % nums[i] == 0 && dp[i] == maxSize) {
        //         result.add(nums[i]);
        //         num = nums[i];
        //         maxSize--;
        //     }
        // }
        
        // return result;

         int n = arr.length;
         Arrays.sort(arr);

        List<Integer> dp = new ArrayList<>(Collections.nCopies(n, 1));
        List<Integer> hash = new ArrayList<>(Collections.nCopies(n,0)); 

        for(int i=0; i<n; i++){
            hash.set(i,i); // Current index ke satth we did init

            for(int previndex=0; previndex<=i-1; previndex++){
                if(arr[i]%arr[previndex]==0  && 1+dp.get(previndex)>dp.get(i)){
                    dp.set(i, 1+dp.get(previndex));
                    hash.set(i,previndex); // Same codde hi hai bhai bas list ka use kar diya 
                }
            }
        }
        int ans = -1;
        int lastindex = -1;
        for(int i=0; i<n; i++){
            if(dp.get(i)>ans){
                ans = dp.get(i);
                lastindex = i;// max element ka index mil gaya bhai 

            }
        }
        List<Integer> temp = new ArrayList<>();
        temp.add(arr[lastindex]);

        while (hash.get(lastindex)!=lastindex) {
            lastindex = hash.get(lastindex);
            temp.add(arr[lastindex]);
            
        }


        Collections.reverse(temp);

        return temp; 
    }
}
