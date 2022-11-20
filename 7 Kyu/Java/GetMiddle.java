/**
 * https://www.codewars.com/kata/56747fd5cb988479af000028
 */
public class GetMiddle {
    public static String getMiddle(String word) {
        return word.length() % 2 == 0 ? word.substring(word.length() / 2 - 1, (word.length() / 2) + 1) : word.substring(word.length() / 2, word.length() / 2 + 1);
    }
}
