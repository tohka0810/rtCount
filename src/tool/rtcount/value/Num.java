package tool.rtcount.value;

import tool.rtcount.util.Counter;
import tool.rtcount.util.Percentage;

public enum Num {
	/*
	 * inputNumberを解析して、
	 * Color, EO, HL, ダズン, Columnの属性の判定を行う
	 * 属性を引数にしてカウンターの実行
	 *
	 */
	Num0 { // 0,緑
		@Override public void exe() {
			NumParam param = new NumParam(green, zero);
			plusNumberCount();
			Counter.countGame();
			param.countElement();
			Percentage.percentageAll();
		}
	},

	Num00 { // 00,緑
		@Override public void exe() {
			NumParam param = new NumParam(green, zero);
			plusNumberCount();
			Counter.countGame();
			param.countElement();
			Percentage.percentageAll();
		}
	},

	Num1 { // 1,red,odd,low,first,column1
		@Override public void exe() {
			NumParam param = new NumParam(red, odd);
			plusNumberCount();
			Counter.countGame();
			param.countElement();
			Percentage.percentageAll();
		}
	},

	Num2 { // 2,black,even,low,first,column2
		@Override public void exe() {
			NumParam param = new NumParam(black, even);
			plusNumberCount();
			Counter.countGame();
			param.countElement();
			Percentage.percentageAll();
		}
	},

	Num3 { // 3,red,odd,low,first,column3
		@Override public void exe() {
			NumParam param = new NumParam(red, odd);
			plusNumberCount();
			Counter.countGame();
			param.countElement();
			Percentage.percentageAll();
		}
	},

	Num4 { // 4,
		@Override public void exe() {
			NumParam param = new NumParam(black, even);
			plusNumberCount();
			Counter.countGame();
			param.countElement();
			Percentage.percentageAll();
		}
	},

	Num5 {
		@Override public void exe() {
			NumParam param = new NumParam(red, odd);
			plusNumberCount();
			Counter.countGame();
			param.countElement();
			Percentage.percentageAll();
		}
	},

	Num6 {
		@Override public void exe() {
			NumParam param = new NumParam(black, even);
			plusNumberCount();
			Counter.countGame();
			param.countElement();
			Percentage.percentageAll();
		}
	},

	Num7 {
		@Override public void exe() {
			NumParam param = new NumParam(red, odd);
			plusNumberCount();
			Counter.countGame();
			param.countElement();
			Percentage.percentageAll();
		}
	},

	Num8 {
		@Override public void exe() {
			NumParam param = new NumParam(black, even);
			plusNumberCount();
			Counter.countGame();
			param.countElement();
			Percentage.percentageAll();
		}
	},

	Num9 {
		@Override public void exe() {
			NumParam param = new NumParam(red, odd);
			plusNumberCount();
			Counter.countGame();
			param.countElement();
			Percentage.percentageAll();
		}
	},

	Num10 {
		@Override public void exe() {
			NumParam param = new NumParam(black, even);
			plusNumberCount();
			Counter.countGame();
			param.countElement();
			Percentage.percentageAll();
		}
	},

	Num11 {
		@Override public void exe() {
			NumParam param = new NumParam(black, odd);
			plusNumberCount();
			Counter.countGame();
			param.countElement();
			Percentage.percentageAll();
		}
	},

	Num12 {
		@Override public void exe() {
			NumParam param = new NumParam(red, even);
			plusNumberCount();
			Counter.countGame();
			param.countElement();
			Percentage.percentageAll();
		}
	},

	Num13 {
		@Override public void exe() {
			NumParam param = new NumParam(black, odd);
			plusNumberCount();
			Counter.countGame();
			param.countElement();
			Percentage.percentageAll();
		}
	},

	Num14 {
		@Override public void exe() {
			NumParam param = new NumParam(red, even);
			plusNumberCount();
			Counter.countGame();
			param.countElement();
			Percentage.percentageAll();
		}
	},

	Num15 {
		@Override public void exe() {
			NumParam param = new NumParam(black, odd);
			plusNumberCount();
			Counter.countGame();
			param.countElement();
			Percentage.percentageAll();
		}
	},

	Num16 {
		@Override public void exe() {
			NumParam param = new NumParam(red, even);
			plusNumberCount();
			Counter.countGame();
			param.countElement();
			Percentage.percentageAll();
		}
	},

	Num17 {
		@Override public void exe() {
			NumParam param = new NumParam(black, odd);
			plusNumberCount();
			Counter.countGame();
			param.countElement();
			Percentage.percentageAll();
		}
	},

	Num18 {
		@Override public void exe() {
			NumParam param = new NumParam(red, even);
			plusNumberCount();
			Counter.countGame();
			param.countElement();
			Percentage.percentageAll();
		}
	},

	Num19 {
		@Override public void exe() {
			NumParam param = new NumParam(red, odd);
			plusNumberCount();
			Counter.countGame();
			param.countElement();
			Percentage.percentageAll();
		}
	},

	Num20 {
		@Override public void exe() {
			NumParam param = new NumParam(black, even);
			plusNumberCount();
			Counter.countGame();
			param.countElement();
			Percentage.percentageAll();
		}
	},

	Num21 {
		@Override public void exe() {
			NumParam param = new NumParam(red, odd);
			plusNumberCount();
			Counter.countGame();
			param.countElement();
			Percentage.percentageAll();
		}
	},

	Num22 {
		@Override public void exe() {
			NumParam param = new NumParam(black, even);
			plusNumberCount();
			Counter.countGame();
			param.countElement();
			Percentage.percentageAll();
		}
	},

	Num23 {
		@Override public void exe() {
			NumParam param = new NumParam(red, odd);
			plusNumberCount();
			Counter.countGame();
			param.countElement();
			Percentage.percentageAll();
		}
	},

	Num24 {
		@Override public void exe() {
			NumParam param = new NumParam(black, even);
			plusNumberCount();
			Counter.countGame();
			param.countElement();
			Percentage.percentageAll();
		}
	},

	Num25 {
		@Override public void exe() {
			NumParam param = new NumParam(red, odd);
			plusNumberCount();
			Counter.countGame();
			param.countElement();
			Percentage.percentageAll();
		}
	},

	Num26 {
		@Override public void exe() {
			NumParam param = new NumParam(black, even);
			plusNumberCount();
			Counter.countGame();
			param.countElement();
			Percentage.percentageAll();
		}
	},

	Num27 {
		@Override public void exe() {
			NumParam param = new NumParam(red, odd);
			plusNumberCount();
			Counter.countGame();
			param.countElement();
			Percentage.percentageAll();
		}
	},

	Num28 {
		@Override public void exe() {
			NumParam param = new NumParam(black, even);
			plusNumberCount();
			Counter.countGame();
			param.countElement();
			Percentage.percentageAll();
		}
	},

	Num29 {
		@Override public void exe() {
			NumParam param = new NumParam(black, odd);
			plusNumberCount();
			Counter.countGame();
			param.countElement();
			Percentage.percentageAll();
		}
	},

	Num30 {
		@Override public void exe() {
			NumParam param = new NumParam(red, even);
			plusNumberCount();
			Counter.countGame();
			param.countElement();
			Percentage.percentageAll();
		}
	},

	Num31 {
		@Override public void exe() {
			NumParam param = new NumParam(black, odd);
			plusNumberCount();
			Counter.countGame();
			param.countElement();
			Percentage.percentageAll();
		}
	},

	Num32 {
		@Override public void exe() {
			NumParam param = new NumParam(red, even);
			plusNumberCount();
			Counter.countGame();
			param.countElement();
			Percentage.percentageAll();
		}
	},

	Num33 {
		@Override public void exe() {
			NumParam param = new NumParam(black, odd);
			plusNumberCount();
			Counter.countGame();
			param.countElement();
			Percentage.percentageAll();
		}
	},

	Num34 {
		@Override public void exe() {
			NumParam param = new NumParam(red, even);
			plusNumberCount();
			Counter.countGame();
			param.countElement();
			Percentage.percentageAll();
		}
	},

	Num35 {
		@Override public void exe() {
			NumParam param = new NumParam(black, odd);
			plusNumberCount();
			Counter.countGame();
			param.countElement();
			Percentage.percentageAll();
		}
	},

	Num36 {
		@Override public void exe() {
			NumParam param = new NumParam(red, even);
			plusNumberCount();
			Counter.countGame();
			param.countElement();
			Percentage.percentageAll();
		}
	},

	Def {
		@Override public void exe() {

		}

	};

	public abstract void exe();

	private int NumberCount;

	String red = "red";
	String black = "black";
	String green = "green";
	String even = "even";
	String odd = "odd";
	String zero = "zero";
	String high = "high";
	String low = "low";
	String first = "first";
	String second = "second";
	String third = "third";
	String column1 = "column1";
	String column2 = "column2";
	String column3 = "column3";


	public int getNumberCount() {

		return NumberCount;

	}

	public void plusNumberCount(){

		this.NumberCount += 1;

	}

	public void setNumberCount(int numberCount){

		NumberCount = numberCount;

	}

}
