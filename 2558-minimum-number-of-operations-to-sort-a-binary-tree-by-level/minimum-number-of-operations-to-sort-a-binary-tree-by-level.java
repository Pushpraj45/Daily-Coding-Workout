/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<int[]> levelOrder(TreeNode root){
        List<int[]> ans = new ArrayList<>();
        if(root==null){
            return ans;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size= q.size();
            int[] arr  = new int[size];
            int k=0;
            for(int i=0;i<size;i++){
                TreeNode curr = q.poll();
                arr[k++] = curr.val;
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
            ans.add(arr);
        }
        return ans;
    }
    public static class Pair{
        int n;
        int i;
        Pair(int element,int index){
            n=element;
            i=index;
        }
    }
    public static int minSwaps(int[] arr) {
        List<Pair>  lst=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            lst.add(new Pair(arr[i],i));
        }
        Comparator<Pair> cmp=(a,b)->(a.n-b.n);
        Collections.sort(lst,cmp);
        int swap=0;
        int k=0;
        int n=arr.length;
        while(k<n)
        {
            Pair p=lst.get(k);
            if(p.i!=k)
            {
                swap++;
                Pair temp=lst.get(k);
                lst.set(k,lst.get(p.i));
                lst.set(p.i,temp);
            }
            else{
                k++;
            }
        }
        return swap;
    }
    
    public int minimumOperations(TreeNode root) {
        List<int[]> list = levelOrder(root);
        int cnt=0;
        for(int[] arr: list){
            cnt+= minSwaps(arr);
        }
        return cnt;
    }
}