public class NthSeries {
	
	public static String seriesSum(int n) {
		double result = 1;
    double x = 1;
    for(int i = 0; i < n-1; i++){
      result += 1/(x+3);
      x = x + 3;
    }
    result = Math.floor(result*100+0.5)/100;
    String r = Double.toString(result);
    if(r.length() == 3) return result + "0";
    else return result + "";
	}
}