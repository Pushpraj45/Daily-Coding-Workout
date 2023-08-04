class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int answer = 0;
        int[] dummy = new int[capacity.length];
        for(int i=0; i<capacity.length; i++){
            dummy[i] = capacity[i] - rocks[i];
        }

        Arrays.sort(dummy);

        for(int i=0; i<capacity.length; i++){
            if(dummy[i]==0){
                continue;
            }
            else if(dummy[i]<=additionalRocks){
                additionalRocks-=dummy[i];
                dummy[i] = 0;
            }
            
        }

        for(int i=0; i<dummy.length; i++){
            if(dummy[i]==0){
                answer++;
            }
        }
        return answer;
    }
}