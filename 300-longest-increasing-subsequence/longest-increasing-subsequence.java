class Solution {
    public static int lcs(int arr1[], int arr2[]){
        int n=arr1.length;
        int m=arr2.length;
        int dp[][]=new int[n+1][m+1];

//        initialize
        for (int i=0; i<n+1; i++){
            dp[i][0]=0;
        }

        for (int j=0; j<m+1; j++){
            dp[0][j]=0;
        }

//        bottom up
        for (int i=1; i<n+1; i++){
            for (int j=1; j<m+1; j++){
                if (arr1[i-1]==arr2[j-1]){
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else{
                    int ans1=dp[i-1][j];
                    int ans2=dp[i][j-1];
                    dp[i][j]=Math.max(ans1, ans2);
                }
            }
        }
        return dp[n][m];
    }
    public int lengthOfLIS(int[] arr) {
        // HashSet<Integer> set=new HashSet<>();
        // for (int i=0; i<arr1.length; i++){
        //     set.add(arr1[i]);
        // }

        // int arr2[]=new int[set.size()];  // sorted unique elements
        // int i=0;
        // for (int num : set){
        //     arr2[i]=num;
        //     i++;
        // }
        // Arrays.sort(arr2);
        // return lcs(arr1, arr2);
        int n = arr.length;
        //  int dp[][] = new int[n+1][n+1];
        // for(int index = n-1; index>=0; index--){
        //     for(int previndex=index-1; previndex>=-1; previndex--){
        //         int nottake = 0+dp[index+1][previndex+1];
        //         int take = 0;
        //         if(previndex==-1 || arr[index]>arr[previndex]){
        //              take = 1+dp[index+1][index+1];
        //         }
        //         dp[index][previndex+1] = Math.max(nottake, take);
        //     }
        // }

        // return dp[0][0]; 

        // int[] dp = new int[n];
        // Arrays.fill(dp, 1); // LIS ek to hoga hi minimum 

        // for(int i=0; i<=n-1; i++){
        //     for(int previndex=0; previndex<=i-1; previndex++){
        //         if(arr[previndex]<arr[i]){
        //             dp[i] = Math.max(dp[i], 1+dp[previndex]);                }
        //     }
        // }

        // int ans  = -1;
        // for(int i=0; i<=n-1; i++){
        //     ans = Math.max(ans, dp[i]);
        // }

        // return ans;

         List<Integer> temp = new ArrayList<Integer>();

        temp.add(arr[0]);
        int len = 1;
        for(int i=1; i<n; i++){
            if(arr[i]>temp.get(temp.size()-1)){
                temp.add(arr[i]);
                len++;
            }
            else{
                // Replacement Step
                int index = Collections.binarySearch(temp,arr[i]);
                // if negative index then find it's accurate index
                if(index<0){
                    index = -index-1;
                }

                temp.set(index, arr[i]); // element ko vaha par dal diya 
            }
        }

        return len; 
    }
}