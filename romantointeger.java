package leetcode;

public class romantointeger {

	public static void main(String[] args) {
//		I             1
//		V             5
//		X             10
//		L             50
//		C             100
//		D             500
//		M             1000
		String roman ="MCMXCIV";
		int res=romanToInt(roman);
		System.out.println(res);

	}
	public static int romanToInt(String s) {
		int result=0;
		
        for(int i=0;i<s.length();i++) {
        	s.charAt(i);
        	switch (s.charAt(i)) {
        	case 'I': 
                result += 1;
                break;
            case 'V':
            	if(i!=0) {
            	if(s.charAt(i-1)=='I') {
            		result+=3;
            		break;
            	}}
                result += 5;
                break;
            case 'X':
            	if(i!=0) {
            	if(s.charAt(i-1)=='I') {
            		result+=8;
            		break;
            	}}

                result += 10;
                break;
            case 'L':
            	if(i!=0) {
            	if(s.charAt(i-1)=='X') {
            		result+=30;
            		break;
            	}}

                result += 50;
                break;
            case 'C':
            	if(i!=0) {
            	if(s.charAt(i-1)=='X') {
            		result+=80;
            		break;
            	}}

                result += 100;
                break;
            case 'D':
            	if(i!=0) {
            	if(s.charAt(i-1)=='C') {
            		result+=300;
            		break;
            	}}

                result += 500;
                break;
            case 'M':
            	if(i!=0) {
            	if(s.charAt(i-1)=='C') {
            		result+=800;
            		break;
            	}}

                result += 1000;
                break;
				
        	}
        	}
        return result;
        }

}
