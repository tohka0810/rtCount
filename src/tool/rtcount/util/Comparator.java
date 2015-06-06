package tool.rtcount.util;

public class Comparator implements java.util.Comparator<String> {

	@Override
	public int compare(String str1, String str2) {

		return Integer.valueOf(str1).compareTo(Integer.valueOf(str2));

	}



}
