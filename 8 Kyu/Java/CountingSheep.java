import java.util.Arrays;
public class CountingSheep {
    public int countSheeps(Boolean[] arrayOfSheeps) {
        return Arrays.stream(arrayOfSheeps).filter(x -> x != null && x == true).toArray().length;
    }
}