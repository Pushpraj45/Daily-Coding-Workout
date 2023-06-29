class Solution {
public:
    vector<int> diStringMatch(string s) {
        vector<int> ans;
        int i = 0;
        int d = s.length();
        for(auto it : s){
            if(it=='I'){ans.push_back(i); i++;}
            else{ans.push_back(d); d--;};
        }
        ans.push_back(i);
        return ans;
    }
};