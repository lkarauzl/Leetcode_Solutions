package leetcode;

import java.util.Arrays;

public class removeElement {
	

	public static void main(String[] args) {
		int[] a= {3,2,2,3};
		int[] b= {0,1,2,2,3,0,4,2};
		int d=	removeElement(b, 2);
		int c=	removeElement(a, 3);
		System.out.println(c);
		System.out.println(d);
		for (int i : a) {
			System.out.print(i+" ");
		}
		System.out.println();
		for (int i : b) {
			System.out.print(i+" ");
		}
	}
	public static int removeElement(int[] nums, int val) {
		int numberofval=0;
		int k;
        for(int i=0;i<nums.length;i++) {
        	if(val==nums[i]) {
        		nums[i]=99;
        		numberofval++;
        	}
        }
        Arrays.sort(nums);
        k=nums.length-numberofval;
        return k;
    }

}
