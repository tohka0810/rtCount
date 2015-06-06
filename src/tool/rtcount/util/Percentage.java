package tool.rtcount.util;

public class Percentage {

	private static double percentRed;
	private static double percentBlack;
	private static double percentGreen;
	private static double percentEven;
	private static double percentOdd;
	private static double percentZero;
	private static double percentLow;
	private static double percentHigh;
	private static double percentFirst;
	private static double percentSecond;
	private static double percentThird;
	private static double percentColumn1;
	private static double percentColumn2;
	private static double percentColumn3;

	public static void percentageAll() {
		percentageRed();
		percentageBlack();
		percentageGreen();
		percentageEven();
		percentageOdd();
		percentageZero();
		percentageLow();
		percentageHigh();
		percentageFirst();
		percentageSecond();
		percentageThird();
		percentageColumn1();
		percentageColumn2();
		percentageColumn3();
	}

	private static void percentageRed() {
		double result = ( double ) Counter.getRed() / ( double ) Counter.getGame() * 100.0;
		percentRed = result;
	}

	public static double getPerRed(){
		return percentRed;
	}

	private static void percentageBlack() {
		double result = ( double ) Counter.getBlack() / ( double ) Counter.getGame() * 100.0;
		percentBlack = result;
	}

	public static double getPerBlack(){
		return percentBlack;
	}

	private static void percentageGreen() {
		double result = ( double ) Counter.getGreen() / ( double ) Counter.getGame() * 100.0;
		percentGreen = result;
	}

	public static double getPerGreen(){
		return percentGreen;
	}

	private static void percentageEven() {
		double result = ( double ) Counter.getEven() / ( double ) Counter.getGame() * 100.0;
		percentEven = result;
	}

	public static double getPerEven(){
		return percentEven;
	}

	private static void percentageOdd() {
		double result = ( double ) Counter.getOdd() / ( double ) Counter.getGame() * 100.0;
		percentOdd = result;
	}

	public static double getPerOdd(){
		return percentOdd;
	}

	private static void percentageZero() {
		double result = ( double ) Counter.getZero() / ( double ) Counter.getGame() * 100.0;
		percentZero = result;
	}

	public static double getPerZero(){
		return percentZero;
	}

	private static void percentageLow() {
		double result = ( double ) Counter.getLow() / ( double ) Counter.getGame() * 100.0;
		percentLow = result;
	}

	public static double getPerLow(){
		return percentLow;
	}

	private static void percentageHigh() {
		double result = ( double ) Counter.getHigh() / ( double ) Counter.getGame() * 100.0;
		percentHigh = result;
	}

	public static double getPerHigh(){
		return percentHigh;
	}

	private static void percentageFirst() {
		double result = ( double ) Counter.getFirst() / ( double ) Counter.getGame() * 100.0;
		percentFirst = result;
	}

	public static double getPerFirst(){
		return percentFirst;
	}

	private static void percentageSecond() {
		double result = ( double ) Counter.getSecond() / ( double ) Counter.getGame() * 100.0;
		percentSecond = result;
	}

	public static double getPerSecond(){
		return percentSecond;
	}

	private static void percentageThird() {
		double result = ( double ) Counter.getThird() / ( double ) Counter.getGame() * 100.0;
		percentThird = result;
	}

	public static double getPerThird(){
		return percentThird;
	}

	private static void percentageColumn1() {
		double result = ( double ) Counter.getColumn1() / ( double ) Counter.getGame() * 100.0;
		percentColumn1 = result;
	}

	public static double getPerColumn1(){
		return percentColumn1;
	}

	private static void percentageColumn2() {
		double result = ( double ) Counter.getColumn2() / ( double ) Counter.getGame() * 100.0;
		percentColumn2 = result;
	}

	public static double getPerColumn2(){
		return percentColumn2;
	}

	private static void percentageColumn3() {
		double result = ( double ) Counter.getColumn3() / ( double ) Counter.getGame() * 100.0;
		percentColumn3 = result;
	}

	public static double getPerColumn3(){
		return percentColumn3;
	}
}
