public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
         ArrayList<Integer> result = new ArrayList<Integer> ();

        int j = A.size() - 1;
        int i = 0;

        while (j >= i){

            if(Math.abs(A.get(i)) > Math.abs(A.get(j))){
                result.add(0, Math.abs(A.get(i) * A.get(i)));
                i++;
            }else{
                result.add(0, Math.abs(A.get(j) * A.get(j)));
                j--;
            }

        }

        return result;
    }
}
