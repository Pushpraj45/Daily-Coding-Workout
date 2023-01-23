class Solution {
    public String[] findWords(String[] words) {
        String line1 = "QWERTYUIOPqwertyuiop";
        String line2 = "ASDFGHJKLasdfghjkl";
        String line3="ZXCVBNMzxcvbnm";

        HashSet<Character> a= new HashSet<Character>();
        HashSet<Character> b= new HashSet<Character>();
       HashSet<Character> c= new HashSet<Character>();

        for(int i=0; i<line1.length(); i++){
            a.add(line1.charAt(i));
        }
        for(int i=0; i<line2.length(); i++){
            b.add(line2.charAt(i));
        }
        for(int i=0; i<line3.length(); i++){
            c.add(line3.charAt(i));
        }


        ArrayList<String> subans = new ArrayList<String>();

        for(int j=0; j<words.length; j++){
            String ch = words[j];
            int t=0;
            int g=0;
            int r=0;
             for(int i=0; i<ch.length(); i++){
                 if(a.contains(ch.charAt(i))){
                     t++;
                 }
                 else if(b.contains(ch.charAt(i))){
                     g++;
                 }
                 else if(c.contains(ch.charAt(i))){
                     r++;
                 }
             }
               if(t==ch.length() || g==ch.length() || r==ch.length()){
            subans.add(ch);
        }
        }

      

        String ans[] = new String[subans.size()];
        for(int i=0; i<subans.size(); i++){
            ans[i]=subans.get(i);
        }

        return ans;

    }
}