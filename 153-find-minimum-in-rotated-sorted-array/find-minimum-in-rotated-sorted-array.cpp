class Solution {
public:
    int findMin(vector<int>& arr) {
        int n=arr.size();
        int start=0;
        int end=n-1;
        if(arr[start]<=arr[end]){
            return arr[0];
        }
        while(start<=end){
            int mid=start+(end-start)/2;
            int next=(mid+1)%n;
            int prev=(mid-1+n)%n;
            if((arr[mid]<arr[next]) &&(arr[mid]<arr[prev])){
                return arr[mid];
            }
            else if(arr[start]<=arr[mid] && arr[mid]<=arr[end]){
                end=mid-1;
            }
            else{
                if(arr[start]<=arr[mid]){
                start=mid+1;
                }
                else if(arr[mid]<=arr[end]){
                end=mid-1;
            }
            }
             
        }
        return arr[0];
    }
};