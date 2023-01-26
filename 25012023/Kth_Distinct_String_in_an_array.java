class Solution {
    public String kthDistinct(String[] arr, int k) {
        int ans=0;
        HashMap<String, Boolean> map=new HashMap<>();

        for(int i=0; i<arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], false);
            }
            else{
                map.put(arr[i], true);
            }
        }

        for(int i=0; i<arr.length; i++){
            if(map.get(arr[i])){
                ans++;
                if(ans==k){
                    return arr[i];
                }
            }

        }
        return "";
    }
}