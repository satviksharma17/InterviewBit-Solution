public class Solution {
    public int coverPoints(int[] A, int[] B) {
        int n=A.length;
        int steps=0;
        for(int i=0;i<n-1;i++)
        {
        int x1=A[i];
        int y1=B[i];
        int x2=A[i+1];
        int y2=B[i+1];
        int x_diff=Math.abs(x1-x2);
        int y_diff=Math.abs(y1-y2);
         steps+=Math.max(x_diff,y_diff);
        }
       return steps;
    }
}
