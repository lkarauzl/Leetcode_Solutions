package leetcode;

public class remove_element_fromsorted {

	public static void main(String[] args) {
		int[] a= {1,1,2};
		int[] b= {0,0,1,1,1,2,2,3,3,4};
		int d=	removeDuplicates(b);
		int c=	removeDuplicates(a);
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
public static int removeDuplicates(int[] nums) {
	 int count=0;
	 int val=101;
     for(int i=0; i<nums.length; i++){
    	 
         if(nums[i]!=val){
          nums[count]=nums[i];
         count++;
         }
         val=nums[i];
     }
     return count;

    }

}
