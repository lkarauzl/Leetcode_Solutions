package leetcode;

public class length_of_last_word {

	public static void main(String[] args) {
		String test="   fly me   to   the moon  ";
		int res =lengthOfLastWord(test);
		System.out.println(res);
	}

	public static int lengthOfLastWord(String s) {
		String[] aa=s.split(" ");
		String result=aa[aa.length-1];
		return result.length();
	}
}
