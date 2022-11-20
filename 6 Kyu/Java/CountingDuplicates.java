import java.util.HashMap;

/**
 * https://www.codewars.com/kata/54bf1c2cd5b56cc47f0007a1
 */
public class CountingDuplicates {
    public static int duplicateCount(String text) {
        HashMap<Character, Integer> distinct = new HashMap<>();
        text = text.toLowerCase();
        int count;
        int duplicate = 0;
        for(char c : text.toCharArray()) {
            count = distinct.containsKey(c) ? distinct.get(c) : 0;
            distinct.put(c, count + 1);
        }
        for(char key : distinct.keySet()){
            if(distinct.get(key) > 1){
                duplicate++;
            }
        }
        return duplicate;
    }
}