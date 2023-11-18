class Solution {
    public String reverseWords(String s) {
        char[] characters = s.toCharArray();

        int i=0;
        int j;

        for( j=0; j<=characters.length; j++){
            if(j==characters.length || characters[j]==' '){
                swap(characters,i,j-1);
                i=j+1; // Moved to next word/string
            }
        }

        return new String(characters);
    }

    public void swap(char[] c, int a, int b){
        while(a<b){
        char temp = c[b];
        c[b] = c[a];
        c[a] = temp;
        a++;
        b--;
        }
    }
}