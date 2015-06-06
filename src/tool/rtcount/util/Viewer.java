package tool.rtcount.util;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

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

		String red = "Red";
		String black = "Black";
		String green = "Green";
		String even = "Even";
		String odd = "Odd";
		String zero = "Zero";

		// Percentageの出力。

//		double red = Percentage.getPerRed();
//		double black = Percentage.getPerBlack();
//		double green = Percentage.getPerGreen();
//
//		double even = Percentage.getPerEven();
//		double odd = Percentage.getPerOdd();
//		double zero = Percentage.getPerZero();

		Map<String, Double> perMap = new TreeMap<String, Double>();

		perMap.put(red, Percentage.getPerRed());
		perMap.put(black, Percentage.getPerBlack());
		perMap.put(green, Percentage.getPerGreen());
		perMap.put(even, Percentage.getPerEven());
		perMap.put(odd, Percentage.getPerOdd());
		perMap.put(zero, Percentage.getPerZero());


		Format df = new DecimalFormat("0.0");

//		System.out.println("---------- PERCENTAGE ----------");
//		System.out.println("   " + "RedPercent   :" + df.format(red) + "%"
//				+ visibleHotColor(red));
//		System.out.println("   " + "BlackPercent :" + df.format(black) + "%"
//				+ visibleHotColor(black));
//		System.out.println("   " + "GreenPercent :" + df.format(green) + "%");
//		System.out.println("");
//		System.out.println("   " + "EvenPercent  :" + df.format(even) + "%"
//				+ visibleHotEO(even));
//		System.out.println("   " + "OddPercent   :" + df.format(odd) + "%"
//				+ visibleHotEO(odd));
//		System.out.println("   " + "ZeroPercent  :" + df.format(zero) + "%");
//		System.out.println("");

		System.out.println("---------- PERCENTAGE ----------");

		Set<Entry<String,Double>> entries = perMap.entrySet();
		Iterator<Entry<String,Double>> iteMap = entries.iterator();
		while(iteMap.hasNext()){
			Entry<String, Double> entry = iteMap.next();
			System.out.println("   "+ entry.getKey().toString() + "Percent\t: "
			+ df.format(entry.getValue()) + " % " + checkElement(entry));
		}
	}

	private String checkElement(Entry<String , Double> entry){

		String msg = null;
		switch(entry.getKey()){
		case "Red":
		case "Black":
			msg = visibleHotColor(entry.getValue());
			return msg;

		case "Even":
		case "Odd":
			msg = visibleHotEO(entry.getValue());
			return msg;

		default:
			msg = "";
			return msg;

		}
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
//		int v0 = Num.Num0.getNumberCount();
//		int v00 = Num.Num00.getNumberCount();
//		int v1 = Num.Num1.getNumberCount();
//		int v2 = Num.Num2.getNumberCount();
//		int v3 = Num.Num3.getNumberCount();
//		int v4 = Num.Num4.getNumberCount();
//		int v5 = Num.Num5.getNumberCount();
//		int v6 = Num.Num6.getNumberCount();
//		int v7 = Num.Num7.getNumberCount();
//		int v8 = Num.Num8.getNumberCount();
//		int v9 = Num.Num9.getNumberCount();
//		int v10 = Num.Num10.getNumberCount();
//		int v11 = Num.Num11.getNumberCount();
//		int v12 = Num.Num12.getNumberCount();
//		int v13 = Num.Num13.getNumberCount();
//		int v14 = Num.Num14.getNumberCount();
//		int v15 = Num.Num15.getNumberCount();
//		int v16 = Num.Num16.getNumberCount();
//		int v17 = Num.Num17.getNumberCount();
//		int v18 = Num.Num18.getNumberCount();
//		int v19 = Num.Num19.getNumberCount();
//		int v20 = Num.Num20.getNumberCount();
//		int v21 = Num.Num21.getNumberCount();
//		int v22 = Num.Num22.getNumberCount();
//		int v23 = Num.Num23.getNumberCount();
//		int v24 = Num.Num24.getNumberCount();
//		int v25 = Num.Num25.getNumberCount();
//		int v26 = Num.Num26.getNumberCount();
//		int v27 = Num.Num27.getNumberCount();
//		int v28 = Num.Num28.getNumberCount();
//		int v29 = Num.Num29.getNumberCount();
//		int v30 = Num.Num30.getNumberCount();
//		int v31 = Num.Num31.getNumberCount();
//		int v32 = Num.Num32.getNumberCount();
//		int v33 = Num.Num33.getNumberCount();
//		int v34 = Num.Num34.getNumberCount();
//		int v35 = Num.Num35.getNumberCount();
//		int v36 = Num.Num36.getNumberCount();

//		Map<Integer, Integer> viewMap = new TreeMap<Integer, Integer>();
		Map<String, Integer> viewMap = new TreeMap<String, Integer>(new Comparator());
//		int countEnum = EnumSet.allOf(Num.class).size();
		Num[] keysByNum = Num.class.getEnumConstants();
		int countEnum = keysByNum.length;
		// decimalformatでエラーが出る　→　2桁にフォーマットしたい
//		DecimalFormat f = new DecimalFormat("##");
		for(int i = 0; i < countEnum-1; i++){
			String k = keysByNum[i].toString();
			String kk = k.substring(3);
			String key = String.format("%1$2s", kk);

//			Integer value = Num.values()[i].getNumberCount();
			Integer value = keysByNum[i].getNumberCount();
			viewMap.put(key, value);
		}

//		System.out.println("");
//		System.out.println("---------- Detail ----------");
//		System.out.println(" 0 : " + v0 + " / " + Counter.getGame() + " | ");
//		System.out.println("00 : " + v00 + " / " + Counter.getGame() + " | ");
//		System.out.println(" 1 : " + v1 + " / " + Counter.getGame() + " | ");
//		System.out.println(" 2 : " + v2 + " / " + Counter.getGame() + " | ");
//		System.out.println(" 3 : " + v3 + " / " + Counter.getGame() + " | ");
//		System.out.println(" 4 : " + v4 + " / " + Counter.getGame() + " | ");
//		System.out.println(" 5 : " + v5 + " / " + Counter.getGame() + " | ");
//		System.out.println(" 6 : " + v6 + " / " + Counter.getGame() + " | ");
//		System.out.println(" 7 : " + v7 + " / " + Counter.getGame() + " | ");
//		System.out.println(" 8 : " + v8 + " / " + Counter.getGame() + " | ");
//		System.out.println(" 9 : " + v9 + " / " + Counter.getGame() + " | ");
//		System.out.println("10 : " + v10 + " / " + Counter.getGame() + " | ");
//		System.out.println("11 : " + v11 + " / " + Counter.getGame() + " | ");
//		System.out.println("12 : " + v12 + " / " + Counter.getGame() + " | ");
//		System.out.println("13 : " + v13 + " / " + Counter.getGame() + " | ");
//		System.out.println("14 : " + v14 + " / " + Counter.getGame() + " | ");
//		System.out.println("15 : " + v15 + " / " + Counter.getGame() + " | ");
//		System.out.println("16 : " + v16 + " / " + Counter.getGame() + " | ");
//		System.out.println("17 : " + v17 + " / " + Counter.getGame() + " | ");
//		System.out.println("18 : " + v18 + " / " + Counter.getGame() + " | ");
//		System.out.println("19 : " + v19 + " / " + Counter.getGame() + " | ");
//		System.out.println("20 : " + v20 + " / " + Counter.getGame() + " | ");
//		System.out.println("21 : " + v21 + " / " + Counter.getGame() + " | ");
//		System.out.println("22 : " + v22 + " / " + Counter.getGame() + " | ");
//		System.out.println("23 : " + v23 + " / " + Counter.getGame() + " | ");
//		System.out.println("24 : " + v24 + " / " + Counter.getGame() + " | ");
//		System.out.println("25 : " + v25 + " / " + Counter.getGame() + " | ");
//		System.out.println("26 : " + v26 + " / " + Counter.getGame() + " | ");
//		System.out.println("27 : " + v27 + " / " + Counter.getGame() + " | ");
//		System.out.println("28 : " + v28 + " / " + Counter.getGame() + " | ");
//		System.out.println("29 : " + v29 + " / " + Counter.getGame() + " | ");
//		System.out.println("30 : " + v30 + " / " + Counter.getGame() + " | ");
//		System.out.println("31 : " + v31 + " / " + Counter.getGame() + " | ");
//		System.out.println("32 : " + v32 + " / " + Counter.getGame() + " | ");
//		System.out.println("33 : " + v33 + " / " + Counter.getGame() + " | ");
//		System.out.println("34 : " + v34 + " / " + Counter.getGame() + " | ");
//		System.out.println("35 : " + v35 + " / " + Counter.getGame() + " | ");
//		System.out.println("36 : " + v36 + " / " + Counter.getGame() + " | ");

		System.out.println("");

		System.out.println("");
		System.out.println("---------- Detail ----------\n");

		Set<Entry<String, Integer>> entries = viewMap.entrySet();
		Iterator<Entry<String, Integer>> iteViewMap = entries.iterator();
		while(iteViewMap.hasNext()){
			Entry<String, Integer> entry = iteViewMap.next();
			String key = entry.getKey().toString();
			Integer value = entry.getValue();
			if(!entry.getKey().equals(Num.Def)){
				System.out.println(key + "\t: " + value);
			}
		}
	}

}
