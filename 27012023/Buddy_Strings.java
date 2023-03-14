class Solution {
    public boolean buddyStrings(String A, String B) {
        if(A.length()!=B.length()){
            return false;
        }

        if(A.equals(B)){
            HashSet<Character> unique_chars = new HashSet();
            for(char c : A.toCharArray()){
                unique_chars.add(c);
            }

            if(unique_chars.size()<A.length()){
                return true;
            }
            else{
                return false;
            }
        }
        List<Integer> diff = new ArrayList();
        for(int i=0; i<A.length(); i++){
            if(A.charAt(i)!=B.charAt(i)){
                diff.add(i);
            }
        }
        if(diff.size() == 2 && 
        A.charAt(diff.get(0)) == B.charAt(diff.get(1)) &&
         B.charAt(diff.get(0)) == A.charAt(diff.get(1))
         ){
            return true;
        }
        else{
            return false;
        }
    }
}