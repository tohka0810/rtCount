package tool.rtcount.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import tool.rtcount.util.Analyzer;
import tool.rtcount.util.Viewer;
import tool.rtcount.value.Num;

public class Executer {

	public static void main (String[] args) throws IOException {

		List<String> list = new ArrayList<String>();

		while(true){

			System.out.println("Please, input the number!");
			System.out.print("→");
			BufferedReader input =
					new BufferedReader (new InputStreamReader (System.in));
			String str = input.readLine();

			Viewer viewer = new Viewer();

			// 000を入力すると数字ごとの詳細表示
			if(str.equals("000")){
				viewer.visibleDetail();
				continue;
			}

			// 999を入力するとApp終了
			if(str.equals("999")){
				System.out.println("終了します。");
				break;
			}

			System.out.println("");
			System.out.println("InputNumber : [ " + str + " ]");
			System.out.println("");

			Analyzer az = new Analyzer();

			Num num = az.checkNum(str);
			if(num.equals(Num.Def)){
				System.out.println("wrong number!");
				System.out.println("");
				continue;
			} else {
				num.exe();
			}

			viewer.visibleTotalCount();
			viewer.visiblePercentage();

			// 最新の10ゲームを表示
			viewer.visibleList(str, list);

		}

		System.exit(0);
	}



	public void visibleDetail(){

	}

}
