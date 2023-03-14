class Solution {
public:
    int vowelStrings(vector<string>& words, int left, int right) {
        int result=0;
        for(int k=left; k<=right; k++){
            string temp = words[k];
            int a=temp.size();
            if((temp[0]=='a' || temp[0]=='e' || temp[0] == 'i' || temp[0]=='o' || temp[0]=='u') && (temp[a-1]=='a' || temp[a-1]=='e' || temp[a-1]=='i'|| temp[a-1]=='o'|| temp[a-1]=='u'))
                result++;
            
        }
        return result;
    }
};