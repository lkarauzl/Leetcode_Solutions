package leetcode;

import java.util.Arrays;

public class plusOne {

	public static void main(String[] args) {
		int[] aa = { 9,8,7,6,5,4,3,2,1,0};
		int[] res = plusOne4(aa);
		System.out.println(Arrays.toString(res));
	}

	public static int[] plusOne4(int[] digits) {

		int length = digits.length;
		int[] result = new int[length + 1];
		result[0] = 1;
		int j = 9;
//		if (digits[length - 1] != 9) {
//			digits[length - 1] += 1;
//			return digits;
//		} else if (digits[length - 1] == 9) {
			for (j = length - 1; j >= 0; j--) {
				if (digits[j] != 9) {
					digits[j] += 1;
					return digits;
				} 
				digits[j] = 0;
					
				

			}
//			if (j == -1) {
//				System.arraycopy(digits, 0, result, 1, length);
//			}
		

		return result;
	}

	public static int[] plusOne1(int[] digits) {
		int length = digits.length;
		long basamak = (int) Math.pow(10, length - 1);
		long number = 0;
		for (int i = 0; i < length; i++) {
			number += basamak * digits[i];
			basamak /= 10;
		}
		basamak = 10;
		long result = number + 1;

		length = (int) (Math.log10(result) + 1);
		int[] res = new int[length];
		for (int i = res.length - 1; i >= 0; i--) {
			res[i] = (int) (result % basamak);
			result /= 10;

		}
		return res;
	}
}
