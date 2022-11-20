/**
 * https://www.codewars.com/kata/544a54fd18b8e06d240005c0
 */
public class SmallestValue {
    public static int findSmallest(final int[] numbers, final String toReturn) {
        int min = Integer.MAX_VALUE;
        int tmpMin = min;
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            tmpMin = min;
            min = Math.min(min, numbers[i]);
            if (numbers[i] == min && tmpMin != min) {
                index = i;
            }
        }
        if (toReturn.equals("index")) return index;
        else return min;
    }
}
