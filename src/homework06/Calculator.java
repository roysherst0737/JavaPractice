package homework06;

public class Calculator {
	
	public double powerXY(double x, double y) throws CalException {
		if (x == 0 && y == 0) {
			CalException ce = new CalException("0的0次方沒有意義！");
			throw ce;
		} else if (y < 0) {
			CalException ce = new CalException("次方為負值，結果回傳不為整數！");
			throw ce;
		}
		return Math.pow(x, y);
	}
}
