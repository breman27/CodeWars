/**
 * https://www.codewars.com/kata/563b74ddd19a3ad462000054
 */
public class Stringy {
    public static String stringy(int size) {
        String s = "";
        for(int i = 0; i < size; i++){
            s += i % 2 == 0 ? "1" : "0";
        }
        return s;
    }
}
