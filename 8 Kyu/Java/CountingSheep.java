import java.util.Arrays;

/**
 * https://www.codewars.com/kata/54edbc7200b811e956000556
 */
public class CountingSheep {
    public int countSheeps(Boolean[] arrayOfSheeps) {
        return Arrays.stream(arrayOfSheeps).filter(x -> x != null && x).toArray().length;
    }
}