/**
 * https://www.codewars.com/kata/514b92a657cdc65150000006
 */
public class MultiplesOfThreeOrFive {
    public int solution(int number) {
        int total = 0;
        for(int i = 0; i < number; i++){
            if(i % 15 == 0 || i % 3 == 0 || i % 5 == 0){
                total += i;
            }
        }
        return total;
    }
}
