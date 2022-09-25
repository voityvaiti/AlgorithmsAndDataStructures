/* Function return TRUE if there is a position 
in the array, where the sums of elements on both sides are equal. 
Or FALSE if there is not. */



public static boolean balancedSums(List<Integer> arr) {
    if(arr.size()<2) return true;
    long arrSumRight = 0;
    long arrSumLeft = 0;
    for(int i = 1; i<arr.size(); i++) {
        arrSumRight += arr.get(i);
    }
    if(arrSumRight==0) return true;
    for(int i = 1; i<arr.size(); i++) {
        arrSumLeft += arr.get(i-1);
        arrSumRight -= arr.get(i);
        if(arrSumLeft==arrSumRight) return true;
    }
    return false;
}
