/* There is a collection of input strings and a 
collection of query strings. For each query string, 
function determines how many times it occurs in the 
list of input strings.*/

public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        List<Integer> counts = new ArrayList<>();
        for(int i = 0; i<queries.size(); i++) {
            int count = 0;
            for(int j = 0; j<strings.size(); j++) {
                if(strings.get(j).equals(queries.get(i))) count++;
            }
            counts.add(count);
        }
        return counts;
    }
