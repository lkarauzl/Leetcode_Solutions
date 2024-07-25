package leetcode;

public class longestPalindrome {

	public static String findLongestPalindrome(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }

        int maxLength = 1;
        int start = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (isPalindrome(s, i, j)) {
                    int currentLength = j - i + 1;
                    if (currentLength > maxLength) {
                        maxLength = currentLength;
                        start = i;
                    }
                }
            }
        }

        return s.substring(start, start + maxLength);
    }

    private static boolean isPalindrome(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start++) != s.charAt(end--)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String input = "babad";
        String longestPalindrome = findLongestPalindrome(input);
        System.out.println("Verilen sing içindeki en uzun palindrom: " + longestPalindrome);
    }

}
