import java.util.LinkedList;

/**
 * https://www.codewars.com/kata/546e2562b03326a88e000020
 */
public class SquareDigit {

    public int squareDigits(int n) {
        String newNum = "";
        LinkedList<Integer> stack = new LinkedList<Integer>();
        while(n > 0){
            stack.push((n % 10) * (n % 10));
            n = n / 10;
        }
        while(!stack.isEmpty()){
            newNum += stack.pop();
        }
        return Integer.parseInt(newNum);
    }

}