
Q:Problem Description

Given an integer array A of size N.

You can pick B elements from either left or right end of the array A to get maximum sum.

Find and return this maximum possible sum.

NOTE: Suppose B = 4 and array A contains 10 elements then

You can pick first four elements or can pick last four elements or can pick 1 from front and 3 from back etc . you need to return the maximum possible sum of elements you can pick.

Soluton:
public class Solution {
    public int solve(int[] A, int B) {
        int n=A.length;
        int b2=B;
        int i=0,j=n-1;
        int sum=0;
        while(b2>0)
        {
         sum+=A[i];
         i++;
         b2--;
        }
        int ans=sum;
        while(B>0)
        {
            sum-=A[--i];
            sum+=A[j--];
            if(sum>ans)
            ans=sum;
            B--;
        }
        return ans;
    }
}
