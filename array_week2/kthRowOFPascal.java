public class Solution {
    public ArrayList<Integer> getRow(int A) {
         int prev = 1;
         ArrayList<Integer> res=new ArrayList<>();
    res.add(prev);
     
    for(int i = 1; i <= A; i++)
    {
         
       // nCr = (nCr-1 * (n - r + 1))/r
       int curr = (prev * (A - i + 1)) / i;
        res.add(curr);
       prev = curr;
    }
    return res;
    }
}
