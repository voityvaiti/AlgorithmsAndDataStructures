/* Given an array of integers, where all elements 
but one occur twice, function finds the unique element. */

public static int findUniqueAmongPairs(List<Integer> a) {
        if(a.size()==1) return a.get(0);
        a.sort(Comparator.naturalOrder());
        for(int i = 0; i<a.size()-2; i++) {
            if(a.get(i)!=a.get(i+1)) return a.get(i);
            else i++;
        }
        return a.get(a.size()-1); 
    }
