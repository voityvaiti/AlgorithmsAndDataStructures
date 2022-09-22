/*Given an array of integers, function is calculating the ratios 
of its elements, that are positive, negative and zero */

public static void ratiosOfIntegers(List<Integer> arr) {
    int positive = 0;
    int negative = 0;
    int zero = 0;
    for(int value: arr) {
        if(value>0){
            positive++;
        }
        else if(value<0){
            negative++;
        }
        else{
            zero++;
        }
        }
    int size = arr.size();
    System.out.println((float)positive/size);
    System.out.println((float)negative/size);
    System.out.println((float)zero/size);
    }
