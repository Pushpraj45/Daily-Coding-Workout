class Solution {
    public int minimumDeletions(String word, int k) {
     HashMap<Character, Integer> hm = new HashMap<>();
        
        for(char c:word.toCharArray()){
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        
        int mydel = Integer.MAX_VALUE;
        
        int[] cy = new int[256];
        for(Map.Entry<Character, Integer> e:hm.entrySet()){
            char c = e.getKey();
            int f = e.getValue();
            cy[c]=f; // Storing the frequency of the character
        }
        
        for(int i=0; i<cy.length; i++){
            int t = cy[i];
            int del = 0;
            
            for(int f:cy){
                if(f>t+k){
                    del += f-(t+k);
                }
                else if(f<t){
                    del+=f;
                }
            }
            
            mydel = Math.min(mydel, del);
            
            if(mydel==0){
                break;
            }
        }
        
        if(mydel == Integer.MAX_VALUE){
            return 0;
        }
        else{
            return mydel;
        }
        
    }
}