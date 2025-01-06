class Solution {
    public int[] minOperations(String boxes) {

        int[] answer=new int[boxes.length()];
        for(int i=0; i<boxes.length(); i++){
            for(int j=0; j<boxes.length(); j++){
               if(i!=j && boxes.charAt(j)=='1'){
                answer[i] += Math.abs(i-j);
            }
            }
        }
        return answer;
    }
}