package leetcode;

public class longestcommonprefix {

	public static void main(String[] args) {
		String[] strs = { "ab", "a" };
		String[] strs4 = { "", "b" };
		String[] strs2 = { "flower", "flow", "flight" };
		String[] strs3 = { "dog", "racecar", "car" };
		System.out.println(longestCommonPrefix(strs));
		System.out.println(longestCommonPrefix(strs2));
		System.out.println(longestCommonPrefix(strs3));
		System.out.println(longestCommonPrefix(strs4));
	}

	public static String longestCommonPrefix(String[] strs) {

		int small = 125122;
		String comparedword = strs[0];
		for (String string : strs) {
			if (string.length() < small) {
				small=string.length(); 
				comparedword = string;
			}
		}
		int flag = 0;
		String result = "";
		char tempresult = ' ';
		for (int comparedletter = 0; comparedletter < comparedword.length(); comparedletter++) {
			tempresult = comparedword.charAt(comparedletter);
			flag = 0;
			for (String string : strs) {

				if (string.charAt(comparedletter) == tempresult) {
					flag++;
				}
			}
			if (flag == strs.length) {
				result += comparedword.charAt(comparedletter);
			}
			if (flag != strs.length) {
				return result;
			}
		}
		return result;
	}
}
