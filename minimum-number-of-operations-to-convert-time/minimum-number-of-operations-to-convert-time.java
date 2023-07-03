class Solution {

    public int convertTime(String current, String correct) {
        String[] cur = current.split(":");
        String[] cor = correct.split(":");

        int curr = Integer.parseInt(cur[0]) * 60 + Integer.parseInt(cur[1]); // Converting the things into minute
        int corr = Integer.parseInt(cor[0]) * 60 + Integer.parseInt(cor[1]); // Converting the things into minute
        int count = 0;

        while (curr + 60 <= corr) {
            ++count;
            curr += 60;
        }
        while (curr + 15 <= corr) {
            ++count;

            curr += 15;
        }
        while (curr + 5 <= corr) {
            ++count;

            curr += 5;
        }
        while (curr + 1 <= corr) {
            ++count;

            curr += 1;
        }
        return count;
    }
}
