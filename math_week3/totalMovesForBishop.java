public class Solution {
    public int solve(int A, int B) {
        int topLeft=Math.min(A-1,B-1);
        int topRight=Math.min(8-B,A-1);
        int bottomLeft=Math.min(8-A,B-1);
        int bottomRight=Math.min(8-B,8-A);
        int ans=topLeft+topRight+bottomLeft+bottomRight;
        return ans;
    }
}
