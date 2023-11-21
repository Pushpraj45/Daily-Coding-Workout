class Solution {
    public boolean squareIsWhite(String coordinates) {
        char letter = coordinates.charAt(0);
        int digit = coordinates.charAt(1)-'0';

        if(letter == 'a' || letter =='c' || letter == 'e' || letter=='g'){
            // Even digit
            return digit%2==0;
        }
        else{
            return digit%2==1;
        }
    }
}