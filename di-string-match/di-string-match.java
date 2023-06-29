class Solution {
    public int[] diStringMatch(String s) {
        List<Integer> ans = new ArrayList<>();
        int i = 0;
        int d = s.length();
        for (char it : s.toCharArray()) {
            if (it == 'I') {
                ans.add(i);
                i++;
            } else {
                ans.add(d);
                d--;
            }
        }
        ans.add(i);

        int[] result = new int[ans.size()];
        for (int j = 0; j < ans.size(); j++) {
            result[j] = ans.get(j);
        }

        return result;
    }
}
