/* There are two n-element arrays of integers A and B and some value {K}.
The function returns true if it is possible to permute the arrays elements 
so that the relation A[i] + B[i]>K is satisfied for each iteration.
Returns false if this is not possible */

public static boolean twoArraysRelation(int k, List<Integer> A, List<Integer> B) {
        A.sort(Comparator.naturalOrder());
        B.sort(Comparator.reverseOrder());
        
        for(int i = 0; i<A.size(); i++) {
            if(A.get(i)+B.get(i)<k) return false;
        }
        return true;
    }
