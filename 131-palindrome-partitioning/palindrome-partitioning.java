class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res= new ArrayList<>();
        List<String> path = new ArrayList<>();
        partitionhelper(0,s,path,res); 
        return res;
    }
    
    private void partitionhelper(int index, String s, List<String> path, List<List<String>>res){
        if(index == s.length()){
            res.add(new ArrayList<>(path));
            return;
        }

        for(int i=index; i<s.length(); i++){
            if(ispalindrome(s,index,i)){
                path.add(s.substring(index,i+1)); // if string is palindrome to utni ko path mein add kar diya 
                partitionhelper(i+1,s,path,res); // calling the function again
                path.remove(path.size()-1); // removing and backtracking the path
            }
        }
    }

    private boolean ispalindrome(String s, int start, int end){
        while(start<=end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

}