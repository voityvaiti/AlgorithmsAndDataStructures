/* Given five positive integers, function finds 
the minimum and maximum values that can be calculated by 
summing exactly four of the five integers.
*/

public static void minAndMaxSum(List<Integer> arr) {
    int min = arr.get(0);
    int max = arr.get(0);
    long sum = 0;
    for(int value: arr) {
        if(value>max){
            max = value;
        }
        else if(value<min) {
            min = value;
        }
        sum += value;
    }
    System.out.print((sum-max) + " " + (sum-min));
    }
