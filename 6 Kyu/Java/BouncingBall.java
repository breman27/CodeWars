/**
 * https://www.codewars.com/kata/5544c7a5cb454edb3c000047
 */
public class BouncingBall {

    public static int bouncingBall(double h, double bounce, double window) {
        int count = 0;
        if(h <= 0 || bounce <= 0 || bounce >= 1 || window > h) {
            return -1;
        } else {
            while(h > window) {
                count += 1;
                h = h * bounce;
            }
            return (1 + 2 * (count-1));
        }
    }
}