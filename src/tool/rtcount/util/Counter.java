package tool.rtcount.util;

public class Counter {

	private static int game;
	private static int red;
	private static int black;
	private static int green;
	private static int even;
	private static int odd;
	private static int zero;
	public static int low;
	public static int high;
	public static int first;
	public static int second;
	public static int third;
	public static int column1;
	public static int column2;
	public static int column3;


	public static void countGame(){
		game++;
	}

	public static int getGame(){
		return game;
	}

	public static void countRed(){
		red++;
	}

	public static int getRed(){
		return red;
	}

	public static void countBlack(){
		black++;
	}

	public static int getBlack(){
		return black;
	}

	public static void countGreen(){
		green++;
	}

	public static int getGreen(){
		return green;
	}

	public static void countEven(){
		even++;
	}

	public static int getEven(){
		return even;
	}

	public static void countOdd(){
		odd++;
	}

	public static int getOdd(){
		return odd;
	}

	public static void countZero(){
		zero++;
	}

	public static int getZero(){
		return zero;
	}

	public static void countLow(){
		low++;
	}

	public static int getLow(){
		return low;
	}

	public static void countHigh(){
		high++;
	}

	public static int getHigh(){
		return high;
	}

	public static void countFirst(){
		first++;
	}

	public static int getFirst(){
		return first;
	}

	public static void countSecond(){
		second++;
	}

	public static int getSecond(){
		return second;
	}

	public static void countThird(){
		third++;
	}

	public static int getThird(){
		return third;
	}

	public static void countColumn1(){
		column1++;
	}

	public static int getColumn1(){
		return column1;
	}

	public static void countColumn2(){
		column2++;
	}

	public static int getColumn2(){
		return column2;
	}

	public static void countColumn3(){
		column3++;
	}

	public static int getColumn3(){
		return column3;
	}

	// 未使用
	public void init(){
		game = 0;
		red = 0;
		black = 0;
		green = 0;
		even = 0;
		odd = 0;
		zero = 0;
		low = 0;
		high = 0;
		first = 0;
		second = 0;
		third = 0;
		column1 = 0;
		column2 = 0;
		column3 = 0;
	}

}
