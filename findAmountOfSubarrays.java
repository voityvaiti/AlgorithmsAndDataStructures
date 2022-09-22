/* There is an array, value {n} and value {m}. Function is searches through 
the array to find subarray length of which equals n, and sum of 
elements equals m. Returns amount of those subarrays */

public static int findAmountOfSubarrays(List<Integer> s, int n, int m) {
        int sum = 0;
        int counter = 0;
        if(s.size()<n) return 0;
        
        for(int i = 0; i<n; i++) {
            sum += s.get(i);
        } 
        if(sum == m) counter++;
        
        for(int i = 1; i<s.size()-n+1; i++) {
            sum = sum - s.get(i-1) + s.get(i+n-1);
            if(sum == m) counter++;
        }
        return counter;
    }
