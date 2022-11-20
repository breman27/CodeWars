/**
 * https://www.codewars.com/kata/554b4ac871d6813a03000035
 */
public class HighestAndLowest {
    public static String HighAndLow(String numbers) {
        // Code here or
        String[] tokens = numbers.split(" ");
        int[] ary = new int[tokens.length];

        int i = 0;
        for (String token : tokens) {
            ary[i++] = Integer.parseInt(token);
        }
        int min = 999999;
        int max = -999999;
        for (int x : ary) {
            if (x > max) max = x;
            if (x < min) min = x;
        }
        return max + " " + min;
    }
}
