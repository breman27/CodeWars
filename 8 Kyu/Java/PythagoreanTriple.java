import java.util.Arrays;

/**
 * https://www.codewars.com/kata/5951d30ce99cf2467e000013
 */
public class PythagoreanTriple {

    public int pythagoreanTriple(int[] triple){
        return Math.pow(triple[0], 2) + Math.pow(triple[1], 2) == Math.pow(triple[2], 2) ? 1 : 0;
    }
}