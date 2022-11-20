/**
 * https://www.codewars.com/kata/5875b200d520904a04000003
 */
public class EnoughSpace {
    public static int enough(int cap, int on, int wait) {
        // your code here
        if (on + wait > cap) {
            return (on + wait) - cap;
        }
        return 0;
    }
}
