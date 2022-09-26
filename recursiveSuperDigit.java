/* Function recursively sums the digits of the 
input value(in string format) until a single digit is obtained */

public static int recursiveSuperDigit(String n) {
        if(n.length()==1) return Integer.parseInt(n);
        char[] nCharArr = n.toCharArray();
        long sumOfDigits = 0;
        for(int i = 0; i<nCharArr.length; i++) {
            sumOfDigits += Character.getNumericValue(nCharArr[i])*k;
        }
        return recursiveSuperDigit(Long.toString(sumOfDigits));
    }
