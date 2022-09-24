/* There is an array and value k. Function defines the subarray 
with length k, in which the difference between min and max is as small as possible, 
and returns this difference */



public static int arrWithMinDifference(int k, List<Integer> arr) {
        if(k>arr.size()) return 0;
        arr.sort(Comparator.naturalOrder());
        int maxMinDiff = Integer.MAX_VALUE;
        for(int i = 0; i<arr.size()-k+1; i++) {
            if(arr.get(i+k-1) - arr.get(i) < maxMinDiff) maxMinDiff = arr.get(i+k-1) - arr.get(i);  
        }
        return maxMinDiff;      
    }
