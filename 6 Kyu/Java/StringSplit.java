/**
 * https://www.codewars.com/kata/515de9ae9dcfc28eb6000001
 */
public class StringSplit {
    public static String[] solution(String s) {
        String[] array = s.split("(?<=\\G..)");

        if(array[array.length-1].length() == 1) {
            array[array.length-1] = array[array.length-1] + "_";
        }

        return array;
    }
}