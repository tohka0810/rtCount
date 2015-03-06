package tool.rtcount.util;

import tool.rtcount.value.Num;

public class Analyzer {

	String inu;

	public Num checkNum(String inputNumber){

		switch(inputNumber){
		case "0" : return Num.Num0;
		case "00" : return Num.Num00;
		case "1" : return Num.Num1;
		case "2" : return Num.Num2;
		case "3" : return Num.Num3;
		case "4" : return Num.Num4;
		case "5" : return Num.Num5;
		case "6" : return Num.Num6;
		case "7" : return Num.Num7;
		case "8" : return Num.Num8;
		case "9" : return Num.Num9;
		case "10" : return Num.Num10;
		case "11" : return Num.Num11;
		case "12" : return Num.Num12;
		case "13" : return Num.Num13;
		case "14" : return Num.Num14;
		case "15" : return Num.Num15;
		case "16" : return Num.Num16;
		case "17" : return Num.Num17;
		case "18" : return Num.Num18;
		case "19" : return Num.Num19;
		case "20" : return Num.Num20;
		case "21" : return Num.Num21;
		case "22" : return Num.Num22;
		case "23" : return Num.Num23;
		case "24" : return Num.Num24;
		case "25" : return Num.Num25;
		case "26" : return Num.Num26;
		case "27" : return Num.Num27;
		case "28" : return Num.Num28;
		case "29" : return Num.Num29;
		case "30" : return Num.Num30;
		case "31" : return Num.Num31;
		case "32" : return Num.Num32;
		case "33" : return Num.Num33;
		case "34" : return Num.Num34;
		case "35" : return Num.Num35;
		case "36" : return Num.Num36;
		default : return Num.Def;
		}
	}

}
