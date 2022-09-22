/* The function returns amount of pairs 
of two the same integers in the array. */

public static int findAmountOfPairs(List<Integer> ar) {
        ar.sort(Comparator.naturalOrder());
        int pairsCounter = 0;
        int temp = 0;
        for(int i = 0; i<ar.size()-1; i++) {
            if(ar.get(i)==ar.get(i+1)){
                pairsCounter++;
                i++;
            }
        }
        return pairsCounter;
    }
