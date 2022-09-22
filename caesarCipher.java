/* Encrypts the string using Caesar cipher and 
returns the result.
{k} is the shift factor. */

public static String caesarCipher(String s, int k) {
        k = k%26;
        char[] sCharArr = s.toCharArray();
        for(int i = 0; i<sCharArr.length; i++) {
            if(sCharArr[i]>='a' && sCharArr[i]<='z') {
                int symbolInInteger = sCharArr[i] + k;
                if(symbolInInteger>'z') symbolInInteger -= 26;
                sCharArr[i] = (char)symbolInInteger;
            }
            else if (sCharArr[i]>='A' && sCharArr[i]<='Z') {
                int symbolInInteger = sCharArr[i] + k;
                if(symbolInInteger>'Z') symbolInInteger -= 26;
                sCharArr[i] = (char)symbolInInteger;
            }
        }
        return new String(sCharArr);
    }
