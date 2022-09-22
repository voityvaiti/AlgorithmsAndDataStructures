/* There is an array of positive integers. Function returns another array, 
in which each position contains the number of elements of the input array. 
Position index is equal to element value. In this example the range 
of input values is (0, 99). */

public static List<Integer> countingSort(List<Integer> arr) {
        ArrayList<Integer> list = new ArrayList<Integer>(Collections.nCopies(100, 0));
        for(int value: arr){
            list.set(value, (list.get(value)+1));
        }
        return list;
    }
