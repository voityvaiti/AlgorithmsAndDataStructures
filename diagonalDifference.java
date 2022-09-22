/* Given a square matrix, function calculates 
the absolute difference between the sums of its diagonals. */

public static int diagonalDifference(List<List<Integer>> arr) {
        int dSum1 = 0;
        int dSum2 = 0;
        for(int i = 0; i<arr.size(); i++){
            dSum1 += arr.get(i).get(i);
            dSum2 += arr.get(arr.size()-i-1).get(i);
        }
        return Math.abs(dSum2-dSum1);
    }
