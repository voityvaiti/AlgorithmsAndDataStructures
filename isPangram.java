/* In the parameter, the function takes a string value,
and returns true if it's a pangram, or false if it isn't.
A pangram is a sentence using every letter of a 
given alphabet at least once.*/

public static boolean pangrams(String s) {
        s = s.toLowerCase();
        char[] sCharArr = s.toCharArray();
        HashSet<Character> lettersSet = new HashSet<>();
        for(char c: sCharArr) {
            if(c >= 'a' && c<='z') {
                lettersSet.add(c);
            }
        }
        if(lettersSet.size()==26) return true;
        else return false;
    }
