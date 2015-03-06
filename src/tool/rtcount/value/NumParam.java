package tool.rtcount.value;

import tool.rtcount.util.Counter;

public class NumParam {

	private String color;
	private String evenodd;
	private String highlow;
	private String duzzn;
	private String column;

	//テスト用コンストラクタ
	public NumParam(String color, String evenodd) {
		this.color = color;
		this.evenodd = evenodd;
	}

	public NumParam(String color, String evenodd, String highlow, String duzzn, String column) {
		this.color = color;
		this.evenodd = evenodd;
		this.highlow = highlow;
		this.duzzn = duzzn;
		this.column = column;
	}

	public void countElement() {
		checkColor(this.color);
		checkEO(this.evenodd);
//		checkHL(this.highlow);
//		checkDuzzn(this.duzzn);
//		checkColumn(this.column);
	}

	private void checkColor(String color) {
		if (color.equals("red")) {
			Counter.countRed();
		} else if (color.equals("black")) {
			Counter.countBlack();
		} else if (color.equals("green")) {
			Counter.countGreen();
		} else {

		}
	}

	private void checkEO(String evenodd) {
		if (evenodd.equals("even")) {
			Counter.countEven();
		} else if (evenodd.equals("odd")) {
			Counter.countOdd();
		} else if (evenodd.equals("zero")) {
			Counter.countZero();
		} else {

		}
	}

	private void checkHL(String highlow) {
		if (highlow.equals("high")) {
			Counter.countHigh();
		} else if (highlow.equals("low")) {
			Counter.countLow();
		} else {

		}
	}

	private void checkDuzzn(String duzzn) {
		if (duzzn.equals("first")) {
			Counter.countFirst();
		} else if (duzzn.equals("second")) {
			Counter.countSecond();
		} else if (duzzn.equals("third")) {
			Counter.countThird();
		} else {

		}
	}

	private void checkColumn(String column) {
		if (column.equals("column1")) {
			Counter.countColumn1();
		} else if (column.equals("column2")) {
			Counter.countColumn2();
		} else if (column.equals("column3")) {
			Counter.countColumn3();
		} else {

		}
	}


}
