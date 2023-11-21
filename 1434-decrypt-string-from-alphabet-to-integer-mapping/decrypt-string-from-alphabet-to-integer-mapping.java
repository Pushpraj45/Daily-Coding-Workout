class Solution {
    public String freqAlphabets(String s) {
        // Create HashMap store all chars with their respective values
        // Strinbuilder and store all the substrings of s from map whenever encounter the things from '#' and so on... 

        HashMap<String, Character> map = new HashMap<>();
        int k =1;
        for(char ch = 'a'; ch<='z'; ch++){
            if(ch<'j'){
                map.put(String.valueOf(k++),ch);
            }
            else{
                map.put(String.valueOf(k++)+"#",ch);
            }
        }

        StringBuilder sb = new StringBuilder();
        int i=s.length()-1;
        while(i>=0){
            if(s.charAt(i)=='#') // take substring from i-2 to i+1 
            {
                sb.append(map.get(s.substring(i-2, i+1)));
                i-=3;
            }
            else{
                sb.append(map.get(s.substring(i,i+1)));
                i--;
            }
        }
        return sb.reverse().toString();
    }
}