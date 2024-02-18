class Solution {
 
    //     int len1 = arr1.length;
    //     int len2 = arr2.length;
        
    //     if(len1==0||len2==0){
    //         return 0;
    //     }
        
    //     int mymin = Math.min(len1,len2);
    //     int mcpl = 0;
        
    //     for(int i=0; i<len1; i++){
            
    //         for(int j=0; j<len2; j++){
    //         int normcpl = LCPS(arr1[i],arr2[j]); 
    //         mcpl = Math.max(mcpl,normcpl);
    //     }
    //     }
        
    //     return mcpl;
    // }
    // public int LCPS(int my1, int my2){
    //     String d1 =Integer.toString(my1);
        
    //     String d2 = Integer.toString(my2);
        
    //     StringBuilder mycmn = new StringBuilder();
    //     int index = 0;
            
    //     while(index<Math.min(d1.length(),d2.length()) && d1.charAt(index)==d2.charAt(index)){
    //         mycmn.append(d1.charAt(index));
    //         index++;
    //     }
    //             int cpl = 0;

    //     return mycmn.length();

    /* Above Code Provides us TLE  */

    // HashSet usage 
   public int longestCommonPrefix(int[] arr1, int[] arr2) {
    // HashSet to store generated prefixes
    HashSet<Integer> set = new HashSet<>();

    // Generating prefixes from elements of arr1
    for(int val : arr1){
        String str = val + ""; // Convert integer to string
        int len = str.length();
        for(int i = 0; i < len; i++){
            int curr = Integer.parseInt(str.substring(0, i + 1)); // Extract prefix
            set.add(curr); // Add prefix to set
        }
    }

    // Initializing the answer variable
    int ans = 0;

    // Iterating through elements of arr2 to find longest common prefix
    for(int val : arr2){
        String str = val + ""; // Convert integer to string
        int len = str.length();

        // Checking prefixes for longest common prefix
        for(int i = ans; i < len; i++){
            int curr = Integer.parseInt(str.substring(0, i + 1)); // Extract prefix
            if(set.contains(curr)){ // Check if prefix exists in set
                ans = i + 1; // Update answer with current prefix length
            }
        }

    }

    // Returning the length of the longest common prefix
    return ans;
}

}