/**
 * https://www.codewars.com/kata/582e0e592029ea10530009ce
 */
public class DuckDuckGoose {
    public static String duckDuckGoose(Player[] players, int goose) {
        goose -= 1;
        return players[(goose%players.length)].name;
    }
}
