package tool.rtcount.util;

import java.text.DecimalFormat;
import java.util.Collections;
import java.util.List;

import tool.rtcount.value.Num;

public class Viewer {

	public void visibleTotalCount() {

		// Counterの出力。
		System.out.println("------------ TOTAL ------------");
		System.out.println("   " + "Game  : " + Counter.getGame());
		System.out.println("");
		System.out.println("   " + "Red   : " + Counter.getRed());
		System.out.println("   " + "Black : " + Counter.getBlack());
		System.out.println("   " + "Green : " + Counter.getGreen());
		System.out.println("");
		System.out.println("   " + "Even  : " + Counter.getEven());
		System.out.println("   " + "Odd   : " + Counter.getOdd());
		System.out.println("   " + "Zero  : " + Counter.getZero());
		System.out.println("");
	}

	public void visiblePercentage() {

		// Percentageの出力。

		double red = Percentage.getPerRed();
		double black = Percentage.getPerBlack();
		double green = Percentage.getPerGreen();

		double even = Percentage.getPerEven();
		double odd = Percentage.getPerOdd();
		double zero = Percentage.getPerZero();

		DecimalFormat df = new DecimalFormat("0.0");

		System.out.println("---------- PERCENTAGE ----------");
		System.out.println("   " + "RedPercent   :" + df.format(red) + "%"
				+ visibleHotColor(red));
		System.out.println("   " + "BlackPercent :" + df.format(black) + "%"
				+ visibleHotColor(black));
		System.out.println("   " + "GreenPercent :" + df.format(green) + "%");
		System.out.println("");
		System.out.println("   " + "EvenPercent  :" + df.format(even) + "%"
				+ visibleHotEO(even));
		System.out.println("   " + "OddPercent   :" + df.format(odd) + "%"
				+ visibleHotEO(odd));
		System.out.println("   " + "ZeroPercent  :" + df.format(zero) + "%");
		System.out.println("");
	}

	public void visibleList(String str, List<String> list) {

		int loop = 0;
		list.add(str);
		Collections.reverse(list);

		System.out.print("recent number : ");

		for (String s : list) { // 最大10回のループに変更

			loop++;
			if (loop > 10) {
				break;
			}

			System.out.print("[" + s + "] ");

		}

		// for(int i = 0; i > 10; i++){
		// System.out.print("["+ list.get(i) + "]");
		// }

		Collections.reverse(list);

		System.out.println("");
		System.out.println("");
	}

	public String visibleHotColor(double percent) {

		double hot = 70;
		double amazing = 80;
		String hotMessage = ("←Hot!!");
		String amaMessage = ("←Amazing!!!");
		String nothing = ("");

		DecimalFormat df = new DecimalFormat("0.0");
		double hotPercent = Double.valueOf(df.format(hot));
		double amaPercent = Double.valueOf(df.format(amazing));

		if (percent == Percentage.getPerRed()) {

			if (Percentage.getPerRed() > Percentage.getPerBlack()) {

				if (Percentage.getPerRed() >= amaPercent) {

					return amaMessage;

				} else if (Percentage.getPerRed() >= hotPercent) {

					return hotMessage;

				} else {

					return nothing;
				}
			}
		} else if (percent == Percentage.getPerBlack()) {

			if (Percentage.getPerBlack() > Percentage.getPerRed()) {

				if (Percentage.getPerBlack() >= amaPercent) {

					return amaMessage;

				} else if (Percentage.getPerBlack() >= hotPercent) {

					return hotMessage;

				} else {

					return nothing;

				}
			}
		}

		return nothing;
	}

	public String visibleHotEO(double percent) {

		double hot = 70;
		double amazing = 80;
		String hotMessage = ("←Hot!!");
		String amaMessage = ("←Amazing!!!");
		String nothing = ("");

		DecimalFormat df = new DecimalFormat("0.0");
		double hotPercent = Double.valueOf(df.format(hot));
		double amaPercent = Double.valueOf(df.format(amazing));

		if (percent == Percentage.getPerEven()) {

			if (Percentage.getPerEven() > Percentage.getPerOdd()) {

				if (Percentage.getPerEven() >= amaPercent) {

					return amaMessage;

				} else if (Percentage.getPerEven() >= hotPercent) {

					return hotMessage;

				} else {

					return nothing;

				}
			}
		} else if (percent == Percentage.getPerOdd()) {

			if (Percentage.getPerOdd() > Percentage.getPerEven()) {

				if (Percentage.getPerOdd() >= amaPercent) {

					return amaMessage;

				} else if (Percentage.getPerOdd() >= hotPercent) {

					return hotMessage;

				} else {

					return nothing;

				}
			}
		}

		return nothing;
	}

	public void visibleDetail() {

		// データの持つクラスと表示するクラスを分ける
		int v0 = Num.Num0.getNumberCount();
		int v00 = Num.Num00.getNumberCount();
		int v1 = Num.Num1.getNumberCount();
		int v2 = Num.Num2.getNumberCount();
		int v3 = Num.Num3.getNumberCount();
		int v4 = Num.Num4.getNumberCount();
		int v5 = Num.Num5.getNumberCount();
		int v6 = Num.Num6.getNumberCount();
		int v7 = Num.Num7.getNumberCount();
		int v8 = Num.Num8.getNumberCount();
		int v9 = Num.Num9.getNumberCount();
		int v10 = Num.Num10.getNumberCount();
		int v11 = Num.Num11.getNumberCount();
		int v12 = Num.Num12.getNumberCount();
		int v13 = Num.Num13.getNumberCount();
		int v14 = Num.Num14.getNumberCount();
		int v15 = Num.Num15.getNumberCount();
		int v16 = Num.Num16.getNumberCount();
		int v17 = Num.Num17.getNumberCount();
		int v18 = Num.Num18.getNumberCount();
		int v19 = Num.Num19.getNumberCount();
		int v20 = Num.Num20.getNumberCount();
		int v21 = Num.Num21.getNumberCount();
		int v22 = Num.Num22.getNumberCount();
		int v23 = Num.Num23.getNumberCount();
		int v24 = Num.Num24.getNumberCount();
		int v25 = Num.Num25.getNumberCount();
		int v26 = Num.Num26.getNumberCount();
		int v27 = Num.Num27.getNumberCount();
		int v28 = Num.Num28.getNumberCount();
		int v29 = Num.Num29.getNumberCount();
		int v30 = Num.Num30.getNumberCount();
		int v31 = Num.Num31.getNumberCount();
		int v32 = Num.Num32.getNumberCount();
		int v33 = Num.Num33.getNumberCount();
		int v34 = Num.Num34.getNumberCount();
		int v35 = Num.Num35.getNumberCount();
		int v36 = Num.Num36.getNumberCount();

		System.out.println("");
		System.out.println("---------- Detail ----------");
		System.out.println(" 0 : " + v0 + " / " + Counter.getGame() + " | ");
		System.out.println("00 : " + v00);
		System.out.println(" 1 : " + v1);
		System.out.println(" 2 : " + v2);
		System.out.println(" 3 : " + v3);
		System.out.println(" 4 : " + v4);
		System.out.println(" 5 : " + v5);
		System.out.println(" 6 : " + v6);
		System.out.println(" 7 : " + v7);
		System.out.println(" 8 : " + v8);
		System.out.println(" 9 : " + v9);
		System.out.println("10 : " + v10);
		System.out.println("11 : " + v11);
		System.out.println("12 : " + v12);
		System.out.println("13 : " + v13);
		System.out.println("14 : " + v14);
		System.out.println("15 : " + v15);
		System.out.println("16 : " + v16);
		System.out.println("17 : " + v17);
		System.out.println("18 : " + v18);
		System.out.println("19 : " + v19);
		System.out.println("20 : " + v20);
		System.out.println("21 : " + v21);
		System.out.println("22 : " + v22);
		System.out.println("23 : " + v23);
		System.out.println("24 : " + v24);
		System.out.println("25 : " + v25);
		System.out.println("26 : " + v26);
		System.out.println("27 : " + v27);
		System.out.println("28 : " + v28);
		System.out.println("29 : " + v29);
		System.out.println("30 : " + v30);
		System.out.println("31 : " + v31);
		System.out.println("32 : " + v32);
		System.out.println("33 : " + v33);
		System.out.println("34 : " + v34);
		System.out.println("35 : " + v35);
		System.out.println("36 : " + v36);

		System.out.println("");

	}

}
